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

		String acao = req.getParameter("acao");

		if (acao != null && acao.equals("excluir")) {
			objU.setId(Integer.parseInt(req.getParameter("id")));
		} else {

			objU.setLogin(req.getParameter("login-usuario"));
			objU.setSenha(req.getParameter("senha-usuario"));
			objU.setPerfil(req.getParameter("perfil"));
			objU.setId(Integer.parseInt(req.getParameter("id")));
		}

		UsuarioDao objUDao = new UsuarioDao();

		boolean validar = false;

		if (objU.getId() > 0) {
			if (acao != null && acao.equals("excluir")) {
				validar = objUDao.excluirPessoa(objU.getId());
			} else {
				validar = objUDao.alterarUsuario(objU);
			}

		} else {
			validar = objUDao.adicionarUsuario(objU);
		}
		if (validar) {
			res.sendRedirect("formCadastroUsuario.jsp");
		} else {
			PrintWriter saida = res.getWriter();
			saida.println("<html>");
			saida.println("Erro ao gravar!");
			saida.println("</html>");
		}

	}

}
