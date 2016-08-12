package controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import action.Action;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Properties action;
	
	static {
		
		try (InputStream is = ControllerServlet.class.getResourceAsStream("/actions.properties")) {
			action = new Properties();
			action.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		Path path = Paths.get(request.getServletPath());
		String action_path = path.getName(1).toString();
		action_path = action_path.substring(0, action_path.indexOf("."));
		
		String action_class = action.getProperty(action_path);
		
		System.out.println(action_class);
		
		try {
			Action action = (Action) Class.forName(action_class).newInstance();
			action.setRequest(request);
			action.setResponse(response);
			action.runAction();
		
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
