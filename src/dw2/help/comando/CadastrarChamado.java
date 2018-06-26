package dw2.help.comando;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dw2.help.dao.ChamadoDAO;
import dw2.help.modelo.Chamado;

public class CadastrarChamado implements Comando {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response)
					throws Exception {
		String titulo = request.getParameter("titulo");
		String conteudo = request.getParameter("conteudo");
		
		Chamado chamado = new Chamado(titulo, conteudo);
		
		ChamadoDAO chamadoDAO = new ChamadoDAO();
		chamadoDAO.salvar(chamado);
		
		ArrayList<Chamado> chamados =
				chamadoDAO.getChamados();
		
		request.getServletContext().
			setAttribute("chamados", chamados);
		
		return "/NovoChamado.jsp";
	}
}
