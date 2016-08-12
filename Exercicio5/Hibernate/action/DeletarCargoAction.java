package action;

import entity.Cargo;

public class DeletarCargoAction extends Action {


	@Override
	public void processar() {
		int id = Integer.parseInt(getRequest().getParameter("id"));
		System.out.println(id);
		try {
			
			Cargo cargo = serviceFactory.getCargoService().load(id);
			
			serviceFactory.getCargoService().deletar(cargo);
			
			redirect("ListarCargos.action");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
