package action;

import entity.Candidato;
import service.ServiceException;

public class CadastrarCandidatoAction extends Action {

	@Override
	public void processar() {
		Candidato candidato = new Candidato();
		candidato.setNome(getRequest().getParameter("nome"));
		int cargo = Integer.parseInt(getRequest().getParameter("id_cargo"));
		
		try {
			candidato.setCargo(serviceFactory.getCargoService().load(cargo));
		
		} catch(ServiceException e) {
			e.printStackTrace();
		}
		
		System.out.println(cargo);
		try {
			serviceFactory.getCandidatoService().salvar(candidato);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		forward("index.jsp");
	}
}
