package dw2.help.teste;

import dw2.help.dao.UsuarioDAO;
import dw2.help.modelo.Usuario;
import dw2.help.util.ConnectionHelpFactory;

public class TestaConexao {

	public static void main(String[] args) {
		System.out.println(
				ConnectionHelpFactory.getConnection());
		Usuario usuario = new Usuario("admin","123");
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.verifica(usuario));
	}

}
