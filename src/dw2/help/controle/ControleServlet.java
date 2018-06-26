package dw2.help.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dw2.help.comando.Comando;

/**
 * Servlet implementation class ControleServlet
 */
@WebServlet("/controle")
public class ControleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,
					IOException {
		String parametro = request.getParameter("comando");
		String nomeComando = "dw2.help.comando." + parametro;
		
		try {
			Class classe = Class.forName(nomeComando);
			Comando comando = (Comando) classe.newInstance();
			String view = comando.executa(request, response);
			request.getRequestDispatcher(view).forward(request, response);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}





