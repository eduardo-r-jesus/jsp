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

<H1>LISTAR PESSOAS</H1>
<table id="customers">
	<tr>
		<th>Id</th>
		<th>Nome Completo</th>
		<th>Telefone</th>
		<th>Data Nascimento</th>
		<th>Email</th>
		<th>Escolaridade</th>
	</tr>

	<%
	PessoaDao objDao = new PessoaDao();
	List<Pessoa> ls = objDao.listarPessoa();

	if (ls.size() > 0) {
		for (Pessoa ps : ls) {
	%>
	<tr onclick="window.location.href = 'formCadastro.jsp?id=<%=ps.getId()%>'">

		<td><%=ps.getId()%></td>
		<td><%=ps.getNomeCompleto()%></td>
		<td><%=ps.getTelefone()%></td>
		<td><%=ps.getDtNascimento()%></td>
		<td><%=ps.getEmail()%></td>
		<td><%=ps.getEscolaridade()%></td>
		<!-- td><a href="formCadastro.jsp?id=<%=ps.getId()%>"><img
				id="img-icon-edit" src="img/edit-solid.svg" alt="Editar Registro"></a>
			<a href="cadastroservlet?acao=excluir&id=<%=ps.getId()%>"><img
				id="img-icon-trash" src="img/trash-alt-solid.svg"
				alt="Excluir Registro"></a></td-->
	</tr>

	<%
	}

	}
	%>

</table>
<!--a href="formCadastro.jsp" type="submit" class="bt_cadastrar"
	id="espacamento" value="Cadastrar">Cadastrar</a-->

