<%@page import="org.senai.model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dao.UsuarioDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.senai.db.Conexao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuário</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<jsp:include page="Menu.jsp" />
	<H1>LISTAR USUÁRIOS</H1>
	<table id="customers">
		<tr>
			<th>ID</th>
			<th>Login</th>
			<th>Perfil</th>
			<th>Ações</th>
		</tr>

		<%
		UsuarioDao objUDao = new UsuarioDao();
		List<Usuario> ls = objUDao.listarUsuario();

		if (ls.size() > 0) {
			for (Usuario u : ls) {
		%>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getLogin()%></td>
			<td><%=u.getPerfil()%></td>
			<td><!--a href="formEditarUsuario.jsp?id=<%=u.getId()%>"><img id="img-icon-edit" src="img/edit-solid.svg" alt="Editar Registro"></a>
			<a href="formExcluiUsuario.jsp?id=<%=u.getId()%>"><img id="img-icon-trash" src="img/trash-alt-solid.svg" alt="Excluir Registro"></a --></td>
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
		<a href="/form-web/formCadastroUsuario.jsp" type="submit" class="bt_cadastrar" id="espacamento" value="Cadastrar">Cadastrar</a>

</body>
</html>