package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ServiceFactory;
import util.HibernateUtil;

public abstract class Action {

	private HttpServletRequest request;
	private HttpServletResponse response;
	protected ServiceFactory serviceFactory;
	
	public Action() {
		serviceFactory = ServiceFactory.getInstance();
	}
	
	public abstract void processar();
	
	public void runAction() {
		try {
			HibernateUtil.beginTransaction();
			processar();
			HibernateUtil.commit();
			System.out.println("ação iniciada");
		} catch (Exception e) {
			HibernateUtil.rollback();
		}
	}

	public void forward(String path) {
		try {
			request.getRequestDispatcher(path).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void redirect(String path) {
		try {
			response.sendRedirect(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	public HttpServletResponse getResponse() {
		return response;
	}
	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
}
