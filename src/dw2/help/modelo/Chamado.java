package dw2.help.modelo;

public class Chamado {
	private int id;
	private String titulo;
	private String problema;
	private String solucao;
	private String estado;


	public Chamado(String titulo, String problema, String solucao, String estado){
		this.setTitulo(titulo);
		this.setProblema(problema);
		this.setSolucao(solucao);
		this.setEstado(estado);
	}

	public Chamado(int id, String titulo, String problema){
		this.setId(id);
		this.setTitulo(titulo);
		this.setProblema(problema);
	}

	
	public Chamado(int id, String titulo, String problema, String solucao, String estado) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setProblema(problema);
		this.setSolucao(solucao);
		this.setEstado(estado);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

//--------------------------------------------------
	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
//-------------------------------------------


}
