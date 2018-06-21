package dw2.help.comando;

import java.util.ArrayList;

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
		
		ChamadoDAO ChamadoDAO = new ChamadoDAO();
		ChamadoDAO.salvar(chamado);
		
		ArrayList<Chamado> Chamados =
				ChamadoDAO.getChamados();
		
		request.getServletContext().
			setAttribute("Chamados", Chamados);
		
		return "/admin.jsp";
	}
	
	

}
