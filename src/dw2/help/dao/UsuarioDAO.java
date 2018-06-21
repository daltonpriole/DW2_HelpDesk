package dw2.help.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dw2.help.modelo.Usuario;
import dw2.help.util.ConnectionLojaFactory;

public class UsuarioDAO {
	
	public void salvar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		if (usuario == null)
			throw new RuntimeException("Usuário não pode ser nulo");
		try {
			String sql = "Insert into usuario (login, senha) " +
							"values (?, ?)";
			conn = ConnectionLojaFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean verifica(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean valido = false;
		
		try {
			String sql =
					"select * from usuario " +
							"where login=? and senha=?";
			conn = ConnectionLojaFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			rs = ps.executeQuery();
			
			if(rs.next())
				valido = true;
			
			conn.close();
			
			return valido;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean verificaLogin(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean valido = false;
		
		try {
			String sql =
					"select * from usuario " +
							"where login=?";
			conn = ConnectionLojaFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			rs = ps.executeQuery();
			
			if(rs.next())
				valido = true;
			
			conn.close();
			
			return valido;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


}










