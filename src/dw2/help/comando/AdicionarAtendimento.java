package dw2.help.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dw2.help.dao.ChamadoDAO;
import dw2.help.modelo.Atendimento;
import dw2.help.modelo.Chamado;

public class AdicionarAtendimento implements Comando {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String codigo = request.getParameter("codigo");
		ChamadoDAO chamadoDAO = new ChamadoDAO();
		Chamado chamado = 
				chamadoDAO.getChamado(
								Integer.parseInt(codigo));

		HttpSession sessao = request.getSession(false);

		Atendimento atendimento = null;
		if(sessao != null) {
			atendimento = (Atendimento)
				sessao.getAttribute("atendimento");
			
			if(atendimento == null)
				atendimento = new Atendimento();
			
			if (chamado != null) {
				atendimento.adicionar(chamado);
			}
			
			sessao.setAttribute("atendimento", atendimento);
		
		}
		
		
	
		return "/ListarChamado.jsp";
	}
	
	

}
