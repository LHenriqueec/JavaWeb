package dao;

public class DAOFactory {

	private static DAOFactory instance;
	
	private DAOFactory(){};
	
	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		
		return instance;
	}
	
	public CargoDAO getCargoDAO() {
		return new CargoDAO();
	}
	
	public CandidatoDAO getCandidatoDAO() {
		return new CandidatoDAO();
	}

	public EleitorDAO getEleitorDAO() {
		return new EleitorDAO();
	}
}
