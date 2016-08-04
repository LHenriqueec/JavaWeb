package entity;

public class Voto {

	private Integer id;
	private Candidato candidato;
	private Eleitor eleitor;
	
	public Integer getId() {
		return id;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}
	
	private void setId(Integer id) {
		this.id = id;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
}
