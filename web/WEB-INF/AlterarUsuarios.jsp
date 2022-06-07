<%-- 
    Document   : AlterarUsuarios
    Created on : 31 de mai. de 2022, 09:12:43
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AlterarUsuarios" method="post">
            Nome: <input type="text" name="nome" value="${usuario.nome}">
            Email: <input type="text" name="email" value="${usuario.email}">
            Senha: <input type="password" name="senha">
            Curso: <input type="text" name="curso" value="${usuario.curso}">
            Idade: <input type="number" name="idade" value="${usuario.idade}">
            <input type="type" name="index" value="${index}" hidden="true" readonly="true">
            
            <input type="submit" value="Enviar" />
        </form>
            <a href="VisualizarUsuarios">Cancelar</a>
    </body>
</html>
