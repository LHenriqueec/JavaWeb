package service;

public class ServiceFactory {

	private static ServiceFactory instance;	
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		if (instance == null) {
			instance = new ServiceFactory();
		}
		
		return instance;
	}
	
	
	public CargoService getCargoService() {
		return new CargoService();
	}
	
	public CandidatoService getCandidatoService() {
		return new CandidatoService();
	}
	
	public EleitorService getEleitorService() {
		return new EleitorService();
	}
}
