package action;

import java.util.List;

import javax.servlet.http.HttpSession;

import entity.Candidato;
import entity.Eleitor;
import entity.Voto;
import service.ServiceException;

public class VotarAction extends Action {

	@SuppressWarnings("unchecked")
	@Override
	public void processar() {
		
		int id_candidato = Integer.parseInt(getRequest().getParameter("id_candidato"));
		int id_eleitor = Integer.parseInt(getRequest().getParameter("id_eleitor"));
		
		try {
			Candidato candidato = serviceFactory.getCandidatoService().load(id_candidato);
			Eleitor eleitor = serviceFactory.getEleitorService().load(id_eleitor);
			
			HttpSession session = getRequest().getSession();
			Voto voto = new Voto();
			voto.setCandidato(candidato);
			voto.setEleitor(eleitor);
			
			List<Voto> votos = (List<Voto>) session.getAttribute("votos");
			votos.add(voto);
		
		} catch(ServiceException e) {
			e.printStackTrace();
		}
		
		forward("index.jsp");
	}

}
