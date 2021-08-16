package org.senai.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.senai.dao.PessoaDao;
import org.senai.dao.UsuarioDao;
import org.senai.db.Conexao;
import org.senai.model.Usuario;

@WebServlet("/cadastrousuarioservlet")
public class CadastroUsuarioServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Usuario objU = new Usuario();

		objU.setLogin(req.getParameter("login-usuario"));
		objU.setSenha(req.getParameter("senha-usuario"));
		objU.setPerfil(req.getParameter("perfil"));

		UsuarioDao objUDao = new UsuarioDao();

		if (objUDao.adicionarUsuario(objU)) {
			res.sendRedirect("/form-web/formListaUsuario.jsp");
		} else {
			PrintWriter saida = res.getWriter();
			saida.println("<html>");
			saida.println("Erro ao gravar!");
			saida.println("</html>");
		}

	}

}
