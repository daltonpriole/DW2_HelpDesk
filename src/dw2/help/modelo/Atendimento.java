package dw2.help.modelo;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {
	
	List<Chamado> chamados;
	
	public Atendimento() {
		chamados = new ArrayList<Chamado>();
	}
	
	public void adicionar(Chamado chamado) {
		chamados.add(chamado);
	}
	
	public List<Chamado> getChamados() {
		return chamados;
	}

}
