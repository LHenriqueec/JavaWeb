package exercicio.servlet;

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
		Enumeration<String> names = getServletContext().getAttributeNames();
		
		while (names.hasMoreElements()) {
			String key = names.nextElement();
			
			Object value = getServletContext().getAttribute(key);
			
			map.put(key, value);
		}
		
		request.setAttribute("atributos", map);
		request.getRequestDispatcher("/Exercicio1/JSP/index.jsp").forward(request, response);
	}

}
