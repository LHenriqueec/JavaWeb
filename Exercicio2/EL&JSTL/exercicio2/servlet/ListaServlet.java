package exercicio2.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String, Object> map = new TreeMap<>();
		Enumeration<String> enums = request.getServletContext().getAttributeNames();
		
		while (enums.hasMoreElements()) {
			String chave = enums.nextElement();
			Object valor = request.getServletContext().getAttribute(chave);
			map.put(chave, valor);
		}
		request.setAttribute("parametros", map.entrySet());
		
		request.getRequestDispatcher("/Exercicio2/lista.jsp").forward(request, response);
	
	}
}
