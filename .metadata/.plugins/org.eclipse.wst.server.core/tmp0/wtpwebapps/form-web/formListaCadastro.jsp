<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.senai.model.Pessoa"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dao.PessoaDao"%>
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
<title>Lista de Pessoas</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<jsp:include page="Menu.jsp" />
	<H1>LISTAR PESSOAS</H1>
	<table id="customers">
		<tr>
			<th>Id</th>
			<th>Nome Completo</th>
			<th>Telefone</th>
			<th>Data Nascimento</th>
			<th>Email</th>
			<th>Escolaridade</th>
			<th>Ações</th>
			
		</tr>
		

		<%
		PessoaDao objDao = new PessoaDao();
		List<Pessoa> ls = objDao.listarPessoa();

		if (ls.size() > 0) {
		for(Pessoa p : ls) {
		%>
		<tr>

			<td><%=p.getId()%></td>
			<td><%=p.getNomeCompleto()%></td>
			<td><%=p.getTelefone()%></td>
			<td><%=p.getDtNascimento()%></td>
			<td><%=p.getEmail()%></td>
			<td><%=p.getEscolaridade()%></td>
			<td><a href="formEditaCadastro.jsp?id=<%=p.getId()%>"><img id="img-icon-edit" src="img/edit-solid.svg" alt="Editar Registro"></a>
			<a href="formExcluiCadastro.jsp?id=<%=p.getId()%>"><img id="img-icon-trash" src="img/trash-alt-solid.svg" alt="Excluir Registro"></a></td>
		</tr>

		<%
		}
		%>
	
	
	
	<%
		}
		%>
			</table>
		<a href="/form-web/formCadastro.jsp" type="submit" class="bt_cadastrar" id="espacamento" value="Cadastrar">Cadastrar</a>


</body>
</html>