package org.senai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.senai.db.Conexao;
import org.senai.model.Pessoa;
import org.senai.model.Usuario;

public class UsuarioDao {

	public boolean adicionarUsuario(Usuario objU) {

		try {
			Connection cont = Conexao.conectar();

			String sql = "insert into login (login, senha, perfil)" + "values('" + objU.getLogin() + "', '"
					+ objU.getSenha() + "','" + objU.getPerfil() + "');";

			PreparedStatement pst = cont.prepareStatement(sql);
			pst.execute();
			pst.close();
			cont.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Usuario> listarUsuario() {
		List<Usuario> ls = new ArrayList<>();
		try {
			Connection cont = Conexao.conectar();
			PreparedStatement pst = cont.prepareStatement("select id_login, login, senha, perfil from login order by id_login");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id_login"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setPerfil(rs.getString("perfil"));
				ls.add(u);
			}
			cont.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return ls;
	}

	public Usuario getUsuario(int id) {
		Usuario u = new Usuario();

		try {
			Connection cont = Conexao.conectar();
			PreparedStatement pst = cont.prepareStatement("select * from login where id_login = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				u.setId(rs.getInt("id_login"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setPerfil(rs.getString("perfil"));
			}
			cont.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return u;
	}

	public boolean alterarUsuario(Usuario objU) {
		try {
			Connection cont = Conexao.conectar();

			String sql = "update login set login = ?, senha = ?, perfil = ? where id_login = ?";

			PreparedStatement pst = cont.prepareStatement(sql);
			pst.setString(1, objU.getLogin());
			pst.setString(2, objU.getSenha());
			pst.setString(3, objU.getPerfil());
			pst.setInt(4, objU.getId());
			pst.execute();
			pst.close();
			cont.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean excluirPessoa(int id) {
		try {
			Connection cont = Conexao.conectar();

			String sql = "delete from login where id_login = ?";

			PreparedStatement pst = cont.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			pst.close();
			cont.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
