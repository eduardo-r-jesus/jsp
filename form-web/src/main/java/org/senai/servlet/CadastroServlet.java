package org.senai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.senai.dao.PessoaDao;
import org.senai.model.Pessoa;

@WebServlet("/cadastroservlet")
public class CadastroServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Pessoa objP = new Pessoa();

		objP.setNomeCompleto(req.getParameter("nome-completo"));
		objP.setTelefone(req.getParameter("telefone"));
		objP.setDtNascimento(req.getParameter("dt-Nascimento"));
		objP.setEmail(req.getParameter("e-mail"));
		objP.setSexo(req.getParameter("sexo"));
		objP.setTecnologia(req.getParameterValues("tecnologia"));
		objP.setEscolaridade(req.getParameter("escolaridade"));

		PessoaDao objDao = new PessoaDao();

		if (objDao.adicionarPessoa(objP)) {
			res.sendRedirect("/form-web/formListaCadastro.jsp");
		} else {
			PrintWriter saida = res.getWriter();
			saida.println("<html>");
			saida.println("Erro ao gravar!");
			saida.println("</html>");
		}

	}

}
