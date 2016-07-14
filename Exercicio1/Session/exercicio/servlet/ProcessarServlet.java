package exercicio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exercicio.entity.Usuario;

public class ProcessarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		Usuario usuario = (Usuario) session.getAttribute("usuario");
		
		if(usuario == null) {
			usuario = new Usuario();
			request.setAttribute("usuario", usuario);
		}
		
		
		if (request.getParameter("email") != null) {
			usuario.setEmail(request.getParameter("email"));
			session.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/Exercicio1/Session/nome.jsp").forward(request, response);;
		
		} else if (request.getParameter("nome") != null) {
			usuario.setNome(request.getParameter("nome"));
			session.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/Exercicio1/Session/telefone.jsp").forward(request, response);
			
		} else if (request.getParameter("telefone") != null) {
			usuario.setTelefone(request.getParameter("telefone"));
			session.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/Exercicio1/Session/lista.jsp").forward(request, response);
		}
	}

}
