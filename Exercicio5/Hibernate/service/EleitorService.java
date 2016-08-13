package service;

import java.io.Serializable;

import dao.DAOException;
import entity.Eleitor;

public class EleitorService extends Service {

	 public Eleitor load(Serializable id) throws ServiceException {
		 try {
			 return daoFactory.getEleitorDAO().load(id);
		 
		 } catch(DAOException e) {
			 throw new ServiceException();
		 }
	 }
}
