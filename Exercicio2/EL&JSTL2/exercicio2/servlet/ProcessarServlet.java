package exercicio2.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exercicio2.entity.Usuario;

public class ProcessarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");
		
		String pagina = request.getParameter("pagina") == null ? "" : request.getParameter("pagina");
		
		if (usuario == null) {
			usuario = new Usuario();
			session.setAttribute("usuario", usuario);
		}
		
		switch (pagina) {
			case "email": usuario.setEmail(request.getParameter("email"));
				request.getRequestDispatcher("Exercicio2/nome.jsp").forward(request, response);
				break;
			case "nome": usuario.setNome(request.getParameter("nome"));
				request.getRequestDispatcher("Exercicio2/telefone.jsp").forward(request, response);
				break;
			case "telefone": usuario.setTelefone(request.getParameter("telefone"));
				request.getRequestDispatcher("Exercicio2/dados.jsp").forward(request, response);
				break;
		}
		
	}
}
