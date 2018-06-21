package dw2.help.modelo;

public class Chamado {
	private int id;
	private String titulo;
	private String conteudo;
	private String retorno;
	private String estado;


	public Chamado(String titulo, String conteudo){
		this.setTitulo(titulo);
		this.setConteudo(conteudo);
	}

	public Chamado(int id, String titulo, String conteudo){
		this.setId(id);
		this.setTitulo(titulo);
		this.setConteudo(conteudo);
	}

	
	public Chamado(int id, String titulo, String conteudo, String Retorno, String estado) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setConteudo(conteudo);
		this.setConteudo(Retorno);
		this.setConteudo(estado);
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

//--------------------------------------------------
	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
//-------------------------------------------


}
