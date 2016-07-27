package filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ProcessarFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		Enumeration<String> result =  session.getAttributeNames();
		
		while (result.hasMoreElements()) {
			String name = result.nextElement();
			System.out.printf("%s -> %s\n", name, session.getAttribute(name));
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}
}
