<%@page import="org.senai.dao.UsuarioDao"%>
<%@page import="org.senai.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Usuário</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>

<%
	Usuario u = new Usuario(); 
	
	try{	
	int id = Integer.parseInt(request.getParameter("id"));
	UsuarioDao dao = new UsuarioDao();
	u = dao.getUsuario(id);
	}catch(Exception e){
		
	}
	
	%>


<form action="cadastrousuarioservlet" method="Post">
<input type="hidden" name="id" value="<%=u.getId()%>">
 	<jsp:include page="Menu.jsp" />
        <fieldset>
            <legend>CADASTRO USUÁRIO</legend>
                <img id="img-java" src="img/java.png">
                <label for="login">Login:</label>
                <input type="text" class="larguraTexto" id="login" name="login-usuario" placeholder="Digite o seu login" value="<%=u.getLogin()%>">
                <label for="telefone">Senha:</label>
                <input type="password" class="larguraTexto" id="senha" name="senha-usuario" placeholder="Digite sua Senha" value="<%=u.getSenha()%>">
                <label for="sexo">Perfil:</label>
                <div class="bloco-inline">
                    <input type="radio" id="administrador" name="perfil" value="administrador" checked="checked"><label for="adm">Administrador</label>
                    <input type="radio" id="operador" name="perfil" value="operador"><label for="ope">Operador</label>
                    <input type="radio" id="estagiario" name="perfil" value="estagiario"><label for="est">Estagiário</label>
                </div>
                
                <input type="submit" class="bt" id="espacamento" value="Gravar">
                	<%
				if(u.getId() > 0){
			%>			
			<a href="cadastrousuarioservlet?acao=excluir&id=<%=u.getId()%>" type="submit" class="bt" onclick="return confirm('Deseja realmente excluir o registro?')"	id="espacamento" value="Excluir">Excluir</a>
			<%
				}else{
			%>
			<input type="reset" class="bt" value="Limpar">
			<%
				}
			%>			
			<a href="formCadastroUsuario.jsp" type="submit" class="bt"	id="espacamento" value="Cadastrar">Novo Cadastro</a>
                
        </fieldset>
    </form> 
    <script type="text/javascript">
		var lsPerfil = document.getElementsByName("perfil");
		for (i in lsPerfil) {
			if (lsPerfil[i].value == '<%=u.getPerfil()%>') {
				lsPerfil[i].setAttribute('checked', 'checked');
			}
		}
	</script>
	<%@ include file="formListaUsuario.jsp" %>
</body>
</html>