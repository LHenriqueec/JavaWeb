package action;

public class CadastrarCandidatoAction extends Action {

	@Override
	public void processar() {
		String nome = getRequest().getParameter("nome");
	}
}
