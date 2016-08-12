package service;

import java.io.Serializable;
import java.util.List;

import dao.DAOException;
import entity.Cargo;

public class CargoService extends Service {

	public void salvar(Cargo cargo) throws ServiceException {
		try {
			daoFactory.getCargoDAO().save(cargo);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	public Cargo load(Serializable id) throws ServiceException {
		try {
			
			return daoFactory.getCargoDAO().load(id);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	
	public List<Cargo> getCargos() throws ServiceException {
		try {
			return daoFactory.getCargoDAO().listarCargos();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	public void deletar(Cargo cargo) throws ServiceException {
		try {
			
			daoFactory.getCargoDAO().delete(cargo);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}
















