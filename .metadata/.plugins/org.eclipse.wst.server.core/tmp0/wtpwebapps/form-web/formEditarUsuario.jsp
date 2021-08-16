<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuário</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<form action="editarusuarioservlet" method="Post">
 	<jsp:include page="Menu.jsp" />
        <fieldset>
            <legend>EDITAR USUÁRIO</legend>
                <img id="img-java" src="img/java.png">
                
                <label for="login">Id:</label>
                <input type="text" class="larguraTexto" id="id" name="id_usuario" >
                <label for="login">Login:</label>
                <input type="text" class="larguraTexto" id="login" name="login-usuario">
                <label for="telefone">Senha:</label>
                <input type="password" class="larguraTexto" id="senha" name="senha-usuario">
                <label for="sexo">Perfil:</label>
                <div class="bloco-inline">
                    <input type="radio" id="adm" name="perfil" value="administrador" checked="checked"><label for="adm">Administrador</label>
                    <input type="radio" id="ope" name="perfil" value="operador"><label for="ope">Operador</label>
                    <input type="radio" id="est" name="perfil" value="estagiario"><label for="est">Estagiário</label>
                </div>
                
                <input type="submit" class="bt" id="espacamento" value="Atualizar">
                <input type="reset" class="bt"  value="Limpar">
        </fieldset>
    </form> 
</body>
</html>