package dao;

import java.util.List;

import entity.Cargo;

public class CargoDAO extends DAO<Cargo> {

	public CargoDAO() {
		super(Cargo.class);
	}
	
	public List<Cargo> listarCargos() throws DAOException {
		String hql = "FROM Cargo";
		List<Cargo> list = list(hql);

		return list;
	}
}
