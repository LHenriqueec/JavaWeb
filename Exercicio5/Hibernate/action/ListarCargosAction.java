package action;

import java.util.List;

import entity.Cargo;
import service.ServiceException;

public class ListarCargosAction extends Action {

	@Override
	public void processar() {
		try {
			List<Cargo> list = serviceFactory.getCargoService().getCargos();
			
			getRequest().getSession().setAttribute("cargos", list);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
