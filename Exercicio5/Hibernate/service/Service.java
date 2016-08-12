package service;

import dao.DAOFactory;

public class Service {

	protected DAOFactory daoFactory;
	
	public Service() {
		daoFactory = DAOFactory.getInstance();
	}
}
