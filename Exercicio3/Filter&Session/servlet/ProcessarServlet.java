package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProcessarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String atributo = request.getParameter("atributo");
		String valor = request.getParameter("valor");
		
		HttpSession session =  request.getSession();
		session.setAttribute(atributo, valor);
		
		
		response.sendRedirect("Exercicio3/formulario.jsp");
//		request.getRequestDispatcher("Exercicio3/formulario.jsp").forward(request, response);
	}

}
