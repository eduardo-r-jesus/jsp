package org.senai.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String loginV = "admin";
		String senhaV = "admin";
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		PrintWriter saida = res.getWriter();
		saida.println("<!DOCTYPE html>");
		if (loginV.equals(login) && senhaV.equals(senha)) {
			res.sendRedirect("index.jsp");
		} else {
			saida.println("Acesso negado!");
		}		
		saida.println("</html>");
	}

}
