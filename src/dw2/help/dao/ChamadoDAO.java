package dw2.help.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dw2.help.modelo.Chamado;
import dw2.help.util.ConnectionLojaFactory;

public class ChamadoDAO {
	
	public void salvar(Chamado chamado) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		if(chamado == null)
			throw new RuntimeException("Chamado não pode se nulo");

		try {
			conn = ConnectionLojaFactory.getConnection();
			String sql = "insert into chamado " +
							"(titulo, conteudo, retorno, estado)" +
								"values (?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, chamado.getTitulo());
			ps.setString(2, chamado.getConteudo());
			ps.setString(3, chamado.getRetorno());
			ps.setString(4, chamado.getEstado());
			ps.executeUpdate();
			conn.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public ArrayList<Chamado> getChamados() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from chamado";
			conn = ConnectionLojaFactory.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ArrayList<Chamado> chamados =
					new ArrayList<Chamado>();
			while(rs.next()) {
				Chamado cham = new Chamado(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5));
				chamados.add(cham);
			}
			
			conn.close();
			
			return chamados;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	public Chamado getChamado(int codigo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from chamado where codigo = ?";
			conn = ConnectionLojaFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, codigo);
			rs = ps.executeQuery();
			
			Chamado chamado = null;
			if(rs.next()) {
				chamado = new Chamado(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3));
			}
			
			conn.close();
			
			return chamado;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}





