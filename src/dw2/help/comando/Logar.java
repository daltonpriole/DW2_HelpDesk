package dw2.help.comando;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dw2.help.dao.ChamadoDAO;
import dw2.help.dao.UsuarioDAO;
import dw2.help.modelo.Chamado;
import dw2.help.modelo.Usuario;

public class Logar implements Comando {
	
	public String executa(HttpServletRequest request,
			HttpServletResponse response)
				throws Exception {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario(login, senha);
		String msg = null;
		String url = "/login.jsp";
		UsuarioDAO userDAO = new UsuarioDAO();
		if(userDAO.verifica(usuario)) {
			HttpSession sessao =
					request.getSession(true);
			ChamadoDAO chamadoDAO =
					new ChamadoDAO();
			ArrayList<Chamado> chamados =
					chamadoDAO.getChamados();
			request.getServletContext().
					setAttribute("chamados", chamados);

			if(usuario.getLogin().equals("admin")) {
				url = "/admin.jsp";
			} else {
				url = "/loja.jsp";
			}
			sessao.setAttribute("usuario", usuario);
		} else {
			msg = "usuário Inválido";
			request.setAttribute("mensagem", msg);
		}
	
		return url;
				
	}

}
