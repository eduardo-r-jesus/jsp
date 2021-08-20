package org.senai.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class ExemploServlet extends HttpServlet{
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		
		PrintWriter saida = res.getWriter();
		saida.println("<html>");
		saida.println("<body><h1>Olá mundo servlet!</h1>"+ nome+" </body>");
		saida.println("</html>");
	}

}
