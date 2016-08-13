package filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import entity.Candidato;
import service.ServiceException;
import service.ServiceFactory;

public class VotarFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			List<Candidato> candidatos = ServiceFactory.getInstance().getCandidatoService().getListarCandidatos();
			
			HttpSession session = ((HttpServletRequest) request).getSession();
			session.setAttribute("candidatos", candidatos);
			
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
