/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-08-20 23:54:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.senai.dao.UsuarioDao;
import org.senai.model.Usuario;
import org.senai.model.Usuario;
import java.util.List;
import org.senai.dao.UsuarioDao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import org.senai.db.Conexao;
import java.sql.Connection;

public final class formCadastroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/formListaUsuario.jsp", Long.valueOf(1629503531112L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.senai.dao.UsuarioDao");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("org.senai.db.Conexao");
    _jspx_imports_classes.add("org.senai.model.Usuario");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
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
      out.write("<title>Cadastro Usuário</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	Usuario u = new Usuario(); 
	
	try{	
	int id = Integer.parseInt(request.getParameter("id"));
	UsuarioDao dao = new UsuarioDao();
	u = dao.getUsuario(id);
	}catch(Exception e){
		
	}
	
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"cadastrousuarioservlet\" method=\"Post\">\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
      out.print(u.getId());
      out.write("\">\r\n");
      out.write(" 	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>CADASTRO USUÁRIO</legend>\r\n");
      out.write("                <img id=\"img-java\" src=\"img/java.png\">\r\n");
      out.write("                <label for=\"login\">Login:</label>\r\n");
      out.write("                <input type=\"text\" class=\"larguraTexto\" id=\"login\" name=\"login-usuario\" placeholder=\"Digite o seu login\" value=\"");
      out.print(u.getLogin());
      out.write("\">\r\n");
      out.write("                <label for=\"telefone\">Senha:</label>\r\n");
      out.write("                <input type=\"password\" class=\"larguraTexto\" id=\"senha\" name=\"senha-usuario\" placeholder=\"Digite sua Senha\" value=\"");
      out.print(u.getSenha());
      out.write("\">\r\n");
      out.write("                <label for=\"sexo\">Perfil:</label>\r\n");
      out.write("                <div class=\"bloco-inline\">\r\n");
      out.write("                    <input type=\"radio\" id=\"administrador\" name=\"perfil\" value=\"administrador\" checked=\"checked\"><label for=\"adm\">Administrador</label>\r\n");
      out.write("                    <input type=\"radio\" id=\"operador\" name=\"perfil\" value=\"operador\"><label for=\"ope\">Operador</label>\r\n");
      out.write("                    <input type=\"radio\" id=\"estagiario\" name=\"perfil\" value=\"estagiario\"><label for=\"est\">Estagiário</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"submit\" class=\"bt\" id=\"espacamento\" value=\"Gravar\">\r\n");
      out.write("                	");

				if(u.getId() > 0){
			
      out.write("			\r\n");
      out.write("			<a href=\"cadastrousuarioservlet?acao=excluir&id=");
      out.print(u.getId());
      out.write("\" type=\"submit\" class=\"bt\" onclick=\"return confirm('Deseja realmente excluir o registro?')\"	id=\"espacamento\" value=\"Excluir\">Excluir</a>\r\n");
      out.write("			");

				}else{
			
      out.write("\r\n");
      out.write("			<input type=\"reset\" class=\"bt\" value=\"Limpar\">\r\n");
      out.write("			");

				}
			
      out.write("			\r\n");
      out.write("			<a href=\"formCadastroUsuario.jsp\" type=\"submit\" class=\"bt\"	id=\"espacamento\" value=\"Cadastrar\">Novo Cadastro</a>\r\n");
      out.write("                \r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </form> \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("		var lsPerfil = document.getElementsByName(\"perfil\");\r\n");
      out.write("		for (i in lsPerfil) {\r\n");
      out.write("			if (lsPerfil[i].value == '");
      out.print(u.getPerfil());
      out.write("') {\r\n");
      out.write("				lsPerfil[i].setAttribute('checked', 'checked');\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<H1>LISTAR USUÁRIOS</H1>\r\n");
      out.write("	<table id=\"customers\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>ID</th>\r\n");
      out.write("			<th>Login</th>\r\n");
      out.write("			<th>Perfil</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

		UsuarioDao objUDao = new UsuarioDao();
		List<Usuario> ls = objUDao.listarUsuario();

		if (ls.size() > 0) {
			for (Usuario us : ls) {
		
      out.write("\r\n");
      out.write("		<tr onclick=\"window.location.href = 'formCadastroUsuario.jsp?id=");
      out.print(us.getId());
      out.write("'\">\r\n");
      out.write("			<td>");
      out.print(us.getId());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(us.getLogin());
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(us.getPerfil());
      out.write("</td>\r\n");
      out.write("			<!--td><a href=\"formCadastroUsuario.jsp?id=");
      out.print(us.getId());
      out.write("\"><img id=\"img-icon-edit\" src=\"img/edit-solid.svg\" alt=\"Editar Registro\"></a>\r\n");
      out.write("			<a href=\"cadastrousuarioservlet?acao=excluir&id=");
      out.print(us.getId());
      out.write("\"><img id=\"img-icon-trash\" src=\"img/trash-alt-solid.svg\" alt=\"Excluir Registro\"></a></td-->\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");

		}else{
		
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("			<td>\"Nenhuma informação encontrada!\"</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("	");

		}
		
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("		<!--a href=\"formCadastroUsuario.jsp\" type=\"submit\" class=\"bt_cadastrar\" id=\"espacamento\" value=\"Cadastrar\">Cadastrar</a-->");
      out.write("\r\n");
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
