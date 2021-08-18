/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-08-17 23:59:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.senai.model.Pessoa;
import org.senai.dao.PessoaDao;

public final class formCadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.senai.model.Pessoa");
    _jspx_imports_classes.add("org.senai.dao.PessoaDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Cadastro</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	Pessoa p = new Pessoa(); 
	
	try{	
	int id = Integer.parseInt(request.getParameter("id"));
	PessoaDao dao = new PessoaDao();
	p = dao.getPessoa(id);
	}catch(Exception e){
		
	}
	
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<form action=\"cadastroservlet\">\r\n");
      out.write("		<input type=\"hidden\" name=\"id\" value=\"");
      out.print(p.getId());
      out.write("\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("		<fieldset>\r\n");
      out.write("			<legend>CADASTRO</legend>\r\n");
      out.write("			<img id=\"img-java\" src=\"img/java.png\"> <label for=\"nome\">Nome\r\n");
      out.write("				Completo:</label> <input type=\"text\" class=\"larguraTexto\" id=\"nome\"\r\n");
      out.write("				name=\"nome-completo\" placeholder=\"Digite o seu Nome Completo\"\r\n");
      out.write("				value=\"");
      out.print(p.getNomeCompleto());
      out.write("\"> <label for=\"telefone\">Telefone:</label>\r\n");
      out.write("			<input type=\"text\" class=\"larguraTexto\" id=\"telefone\" name=\"telefone\"\r\n");
      out.write("				placeholder=\"(99)9.9999-9999)\" value=\"");
      out.print(p.getTelefone());
      out.write("\">\r\n");
      out.write("			<label for=\"dtNascimento\">Data Nascimento:</label> <input type=\"date\"\r\n");
      out.write("				class=\"larguraTexto\" id=\"dtNascimento\" name=\"dt-Nascimento\"\r\n");
      out.write("				placeholder=\"Informe sua data de nascimento\"\r\n");
      out.write("				value=\"");
      out.print(p.getDtNascimento());
      out.write("\"> <label for=\"email\">E-mail:</label>\r\n");
      out.write("			<input type=\"email\" class=\"larguraTexto\" id=\"email\" name=\"e-mail\"\r\n");
      out.write("				placeholder=\"Informe seu e-mail\" value=\"");
      out.print(p.getEmail());
      out.write("\">\r\n");
      out.write("			<label for=\"sexo\">Sexo:</label>\r\n");
      out.write("			<div class=\"bloco-inline\">\r\n");
      out.write("				<input type=\"radio\" id=\"masc\" name=\"sexo\" value=\"m\"><label\r\n");
      out.write("					for=\"masc\">Masculino</label> <input type=\"radio\" id=\"fem\"\r\n");
      out.write("					name=\"sexo\" value=\"f\"><label for=\"fem\">Feminino</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<label for=\"tecnologia\">Tecnologia:</label>\r\n");
      out.write("			<div class=\"bloco-inline\">\r\n");
      out.write("				<input type=\"checkbox\" id=\"html\" name=\"tecnologia\" value=\"html\"><label for=\"html\">HTML</label> \r\n");
      out.write("				<input type=\"checkbox\" id=\"css\"	name=\"tecnologia\" value=\"css\"><label for=\"css\">CSS</label>\r\n");
      out.write("				<input type=\"checkbox\" id=\"java\" name=\"tecnologia\" value=\"java\"><label	for=\"java\">JAVA</label> \r\n");
      out.write("				<input type=\"checkbox\" id=\"php\"	name=\"tecnologia\" value=\"php\"><label for=\"php\">PHP</label>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<label for=\"escolaridade\">Escolaridade</label> <select\r\n");
      out.write("				name=\"escolaridade\" class=\"larguraTexto\" id=\"escolaridade\">\r\n");
      out.write("				<option value=\"Selecione\">Selecione</option>\r\n");
      out.write("				<option value=\"Ensino Fundamental\">Ensino Fundamental</option>\r\n");
      out.write("				<option value=\"Ensino Médio\">Ensino Médio</option>\r\n");
      out.write("				<option value=\"Ensino Superior\">Ensino Superior</option>\r\n");
      out.write("				<option value=\"Especialização\">Especialização</option>\r\n");
      out.write("				<option value=\"Mestrado\">Mestrado</option>\r\n");
      out.write("				<option value=\"Doutorado\">Doutorado</option>\r\n");
      out.write("			</select> <input type=\"submit\" class=\"bt\" id=\"espacamento\" value=\"Enviar\">\r\n");
      out.write("			<input type=\"reset\" class=\"bt\" value=\"Limpar\">\r\n");
      out.write("		</fieldset>\r\n");
      out.write("	</form>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		var lsSexo = document.getElementsByName(\"sexo\");\r\n");
      out.write("		for (i in lsSexo) {\r\n");
      out.write("			if (lsSexo[i].value == '");
      out.print(p.getSexo());
      out.write("') {\r\n");
      out.write("				lsSexo[i].setAttribute('checked', 'checked');\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		document.getElementById(\"escolaridade\").value = \"");
      out.print(p.getEscolaridade());
      out.write("\";\r\n");
      out.write("		\r\n");
      out.write("		");

		for (String t : p.getTecnologia()) {
			out.println("document.getElementById('"+t+"').setAttribute('checked', 'checked')");
		}
		
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
