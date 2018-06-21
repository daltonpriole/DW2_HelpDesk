package dw2.help.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dw2.help.dao.UsuarioDAO;
import dw2.help.modelo.Usuario;

public class Cadastrar implements Comando {
	public String executa(HttpServletRequest request,
			HttpServletResponse response)
				throws Exception {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String senha2 = request.getParameter("senha2");
		Usuario usuario = new Usuario(login, senha);
		String msg = null;
		String url = "/cadastro.jsp";
		UsuarioDAO userDAO = new UsuarioDAO();
		if(senha.equals(senha2) &&
				!userDAO.verificaLogin(usuario)) {
			userDAO.salvar(usuario);
			url = "/login.jsp";
		} else {
			msg = "Login já existe ou senhas não conferem";
			request.setAttribute("mensagem", msg);
		}
	
		return url;
				
	}

}
