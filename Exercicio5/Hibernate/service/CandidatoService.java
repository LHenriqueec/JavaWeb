package service;

import java.util.List;

import dao.DAOException;
import entity.Candidato;

public class CandidatoService extends Service {

	public void salvar(Candidato candidato) throws ServiceException {
		try {
			
			daoFactory.getCandidatoDAO().save(candidato);
			
		} catch(DAOException e) {
			throw new ServiceException(e);
		}
	}

	public List<Candidato> getListarCandidatos() throws ServiceException {
		try {
			return daoFactory.getCandidatoDAO().listarCandidatos();
		} catch(DAOException e) {
			throw new ServiceException(e);
		}
	}

	public Candidato load(int id_candidato) throws ServiceException {
		try {
			return daoFactory.getCandidatoDAO().load(id_candidato);
		} catch(DAOException e) {
			throw new ServiceException(e);
		}
	}
}
