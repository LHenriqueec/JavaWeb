package action;

import entity.Cargo;
import service.ServiceException;

public class CadastroCargoAction extends Action {

	@Override
	public void processar() {
		String nome = getRequest().getParameter("nome");
		Cargo cargo = new Cargo();
		cargo.setNome(nome);
		
		try {
			serviceFactory.getCargoService().salvar(cargo);
		
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		redirect("ListarCargos.action");
	}

}
