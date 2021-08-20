<%@page import="org.senai.model.Pessoa"%>
<%@page import="org.senai.dao.PessoaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<%
	Pessoa p = new Pessoa(); 
	
	try{	
	int id = Integer.parseInt(request.getParameter("id"));
	PessoaDao dao = new PessoaDao();
	p = dao.getPessoa(id);
	}catch(Exception e){
		
	}
	
	%>

	<form action="cadastroservlet">
		<input type="hidden" name="id" value="<%=p.getId()%>">
		<jsp:include page="Menu.jsp" />
		<fieldset>
			<legend>CADASTRO</legend>
			<img id="img-java" src="img/java.png"> <label for="nome">Nome
				Completo:</label> <input type="text" class="larguraTexto" id="nome"
				name="nome-completo" placeholder="Digite o seu Nome Completo"
				value="<%=p.getNomeCompleto()%>"> <label for="telefone">Telefone:</label>
			<input type="text" class="larguraTexto" id="telefone" name="telefone"
				placeholder="(99)9.9999-9999)" value="<%=p.getTelefone()%>">
			<label for="dtNascimento">Data Nascimento:</label> <input type="date"
				class="larguraTexto" id="dtNascimento" name="dt-Nascimento"
				placeholder="Informe sua data de nascimento"
				value="<%=p.getDtNascimento()%>"> <label for="email">E-mail:</label>
			<input type="email" class="larguraTexto" id="email" name="e-mail"
				placeholder="Informe seu e-mail" value="<%=p.getEmail()%>">
			<label for="sexo">Sexo:</label>
			<div class="bloco-inline">
				<input type="radio" id="masc" name="sexo" value="m"><label
					for="masc">Masculino</label> 
					<input type="radio" id="fem" name="sexo" value="f"><label for="fem">Feminino</label>
			</div>
			<label for="tecnologia">Tecnologia:</label>
			<div class="bloco-inline">
				<input type="checkbox" id="html" name="tecnologia" value="html"><label for="html">HTML</label> 
				<input type="checkbox" id="css"	name="tecnologia" value="css"><label for="css">CSS</label>
				<input type="checkbox" id="java" name="tecnologia" value="java"><label	for="java">JAVA</label> 
				<input type="checkbox" id="php"	name="tecnologia" value="php"><label for="php">PHP</label>
			</div>

			<label for="escolaridade">Escolaridade</label> <select
				name="escolaridade" class="larguraTexto" id="escolaridade">
				<option value="Selecione">Selecione</option>
				<option value="Ensino Fundamental">Ensino Fundamental</option>
				<option value="Ensino Médio">Ensino Médio</option>
				<option value="Ensino Superior">Ensino Superior</option>
				<option value="Especialização">Especialização</option>
				<option value="Mestrado">Mestrado</option>
				<option value="Doutorado">Doutorado</option>
			</select> 
			<input type="submit" class="bt" id="espacamento" value="Enviar">
			<input type="reset" class="bt" value="Limpar">
		</fieldset>
	</form>
	<script type="text/javascript">
		var lsSexo = document.getElementsByName("sexo");
		for (i in lsSexo) {
			if (lsSexo[i].value == '<%=p.getSexo()%>') {
				lsSexo[i].setAttribute('checked', 'checked');
			}
		}
		
		document.getElementById("escolaridade").value = "<%=p.getEscolaridade()%>";
		
		<%
		for (String t : p.getTecnologia()) {
			out.println("document.getElementById('"+t+"').setAttribute('checked', 'checked')");
		}
		%>
		
	</script>
</body>
</html>