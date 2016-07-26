package filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MaitenanceFilter implements Filter {

	private static Properties prop = new Properties();


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		prop.load(Files.newInputStream(Paths.get("D:\\Workspace\\JavaWeb\\Exercicio3\\Filters\\application.properties")));
//		prop.load(MaitenanceFilter.class.getResourceAsStream("/application.properties"));
		
		boolean maitenance = Boolean.valueOf(prop.get("maitenance").toString());

		if (maitenance) request.getRequestDispatcher("maitenance.jsp").forward(request, response);

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void destroy() {

	}


}
