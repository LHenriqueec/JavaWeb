package dao;

import java.util.List;

import entity.Candidato;

public class CandidatoDAO extends DAO<Candidato> {

	public CandidatoDAO() {
		super(Candidato.class);
	}
	
	public List<Candidato> listarCandidatos() throws DAOException {
		return list("FROM Candidato");
	}

}
