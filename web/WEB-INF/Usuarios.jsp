<%-- 
    Document   : Usuarios
    Created on : 12 de mai. de 2022, 20:14:25
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Curso</th>
                    <th>Idade</th>
                    <th>Remover</th>
                    <th>Alterar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach varStatus="status" var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.nome}</td>
                        <td>${usuario.email}</td>
                        <td>${usuario.curso}</td>
                        <td>${usuario.idade}</td>
                        <td><a href="RemoverUsuarios?index=${status.index}">X</a></td>
                        <td><a href="PegarUsuario?index=${status.index}">X</a></td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <a href="usuarios.html">Cadastrar novo usuário</a>

    </body>
</html>
