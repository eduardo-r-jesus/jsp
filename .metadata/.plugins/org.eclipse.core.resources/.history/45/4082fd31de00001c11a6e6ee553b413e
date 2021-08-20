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

		String acao = req.getParameter("acao");

		if (acao != null && acao.equals("excluir")) {
			objP.setId(Integer.parseInt(req.getParameter("id")));
		} else {

			objP.setNomeCompleto(req.getParameter("nome-completo"));
			objP.setTelefone(req.getParameter("telefone"));
			objP.setDtNascimento(req.getParameter("dt-Nascimento"));
			objP.setEmail(req.getParameter("e-mail"));
			objP.setSexo(req.getParameter("sexo"));
			objP.setTecnologia(req.getParameterValues("tecnologia"));
			objP.setEscolaridade(req.getParameter("escolaridade"));
			objP.setId(Integer.parseInt(req.getParameter("id")));
		}

		PessoaDao objDao = new PessoaDao();

		boolean validar = false;

		if (objP.getId() > 0) {
			if (acao != null && acao.equals("excluir")) {
				validar = objDao.excluirPessoa(objP.getId());
			}else {
				validar = objDao.alterarPessoa(objP);
			}
			
		} else {
			validar = objDao.adicionarPessoa(objP);
		}
		if (validar) {
			res.sendRedirect("formListaCadastro.jsp");
		} else {
			PrintWriter saida = res.getWriter();
			saida.println("<html>");
			saida.println("Erro ao gravar!");
			saida.println("</html>");
		}

	}
}
