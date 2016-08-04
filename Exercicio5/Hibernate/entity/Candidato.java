package entity;

public class Candidato {

	private Integer id;
	private String nome;
	private Cargo cargo;
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	private void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
