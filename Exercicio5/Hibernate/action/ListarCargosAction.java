package action;

import java.util.List;

import javax.servlet.http.HttpSession;

import entity.Cargo;
import service.ServiceException;

public class ListarCargosAction extends Action {

	@Override
	public void processar() {
		try {
			List<Cargo> list = serviceFactory.getCargoService().getCargos();
			
			
			HttpSession session = getRequest().getSession();
			
			session.setAttribute("cargos", list);
			
			forward("Cargos.jsp");
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
