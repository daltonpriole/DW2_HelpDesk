package dw2.help.comando;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dw2.help.modelo.Chamado;
import dw2.help.dao.ChamadoDAO;

public abstract class EditarChamado implements Comando{
	
	private Chamado c;

	public EditarChamado() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		if (sessao.getAttribute("login") == null) {
			if (request.getParameter("id") == null) {
				response.sendRedirect("Index.jsp");
			} else {
				sessao.setAttribute("redirect",
						"EditarChamado?id=" + request.getParameter("id"));
				response.sendRedirect("Login");
			}
		} else {
			String id = request.getParameter("id");
			//if (request.getParameter("id") != null) {
				//try {
					//ChamadoDAO cDao = new ChamadoDAO();
					//c = cDao.chamado(Integer.parseInt(id));
				//} catch (ClassNotFoundException | SQLException e) {
					//System.err.println("Erro ao consultar no banco: " + e);
				//}
			//}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		c = null;
		c.setId(Integer.parseInt(request.getParameter("id")));
		c.setTitulo(request.getParameter("titulo"));
		c.setProblema(request.getParameter("problema"));

		ChamadoDAO cDao = new ChamadoDAO();
		cDao.editar(c);
	}
	//public Chamado editar (HttpServletRequest request, HttpServletResponse response) {
		//try {
			//ChamadoDAO cDao = new ChamadoDAO();
			//c = cDao.chamado(Integer.parseInt(request.getParameter("id")));
		//} //catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
		//}
		//return c;
	//}

}
