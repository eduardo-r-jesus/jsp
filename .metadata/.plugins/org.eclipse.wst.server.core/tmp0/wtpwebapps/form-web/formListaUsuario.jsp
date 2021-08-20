<%@page import="org.senai.model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dao.UsuarioDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.senai.db.Conexao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<H1>LISTAR USUÁRIOS</H1>
	<table id="customers">
		<tr>
			<th>ID</th>
			<th>Login</th>
			<th>Perfil</th>
		</tr>

		<%
		UsuarioDao objUDao = new UsuarioDao();
		List<Usuario> ls = objUDao.listarUsuario();

		if (ls.size() > 0) {
			for (Usuario us : ls) {
		%>
		<tr onclick="window.location.href = 'formCadastroUsuario.jsp?id=<%=us.getId()%>'">
			<td><%=us.getId()%></td>
			<td><%=us.getLogin()%></td>
			<td><%=us.getPerfil()%></td>
			<!--td><a href="formCadastroUsuario.jsp?id=<%=us.getId()%>"><img id="img-icon-edit" src="img/edit-solid.svg" alt="Editar Registro"></a>
			<a href="cadastrousuarioservlet?acao=excluir&id=<%=us.getId()%>"><img id="img-icon-trash" src="img/trash-alt-solid.svg" alt="Excluir Registro"></a></td-->
		</tr>

		<%
		}
		%>
	
	
	
	<%
		}else{
		%>
			<tr>
			<td>"Nenhuma informação encontrada!"</td>
			</tr>
	<%
		}
		%>
			</table>
		<!--a href="formCadastroUsuario.jsp" type="submit" class="bt_cadastrar" id="espacamento" value="Cadastrar">Cadastrar</a-->