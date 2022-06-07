<%-- 
    Document   : AlterarLivros
    Created on : 30 de mai. de 2022, 09:53:35
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
        <form action="AlterarLivros" method="post">
            Título: <input type="text" name="titulo" value="${antigo.titulo}">
            N. Páginas: <input type="number" name="paginas" value="${antigo.paginas}">
            Autor: <input type="text" name="nomeAutor" value="${antigo.nomeAutor}">
            Genero: <input type="text" name="genero" value="${antigo.genero}">
            Editora: <input type="text" name="editora" value="${antigo.editora}">
            Ano Publicação: <input type="number" name="anoPublicacao" value="${antigo.anoPublicacao}">
            <input type="type" name="index" value="${index}" readonly="true" hidden="true">
            
            <input type="submit" value="Alterar" />
        </form>
            <a href="VisualizarLivros">Cancelar</a>
    </body>
</html>
