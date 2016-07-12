package exercicio.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GravarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String chave = request.getParameter("chave");
		String valor = request.getParameter("valor");
		
		
		getServletContext().setAttribute(chave, valor);
		
		response.sendRedirect("/web/Lista");
	}

}
