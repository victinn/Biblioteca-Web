<%-- 
    Document   : Livros
    Created on : 12 de mai. de 2022, 20:15:44
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
                    <th>Título</th>
                    <th>N. Páginas</th>
                    <th>Autor</th>
                    <th>Gênero</th>
                    <th>Editora</th>
                    <th>Ano. Publicação</th>
                    <th>Emprestado</th>
                    <th>Remover</th>
                    <th>Alterar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <c:forEach varStatus="status" var="livro" items="${livros}">
                    <tr>
                        <td>${livro.titulo}</td>
                        <td>${livro.paginas}</td>
                        <td>${livro.nomeAutor}</td>
                        <td>${livro.genero}</td>
                        <td>${livro.editora}</td>
                        <td>${livro.anoPublicacao}</td>
                        <td>${livro.emprestado}</td>
                        <td><a href="RemoverLivros?index=${status.index}">X</a></td>
                        <td><a href="PegarLivro?index=${status.index}">X</a></td>
                    </tr>
                    </c:forEach>   
            </tbody>
        </table>
        <a href="livros.html">Cadastrar novo livro</a>
        <h1>Emprestar um Livro</h1>
        
        <form action="Emprestar">
            <select name="selectU">  
                <c:forEach varStatus="status" var="usuario" items="${usuarios}">
                    <option value="${status.index}">${usuario.nome}</option>
                 </c:forEach>
            </select>
            <select name="selectL">
                <c:forEach varStatus="statusL" var="livro" items="${livros}">
                    <c:if test= "${livro.emprestado == false}">
                        <option value="${statusL.index}">${livro.titulo}</option>              
                    </c:if>

                 </c:forEach>
            </select>
            <input type="submit" value="Emprestar" />
        </form>
        
        <h1>Devolver</h1>
        <form action="Devolver">
            <select name="devolverL">
                <c:forEach varStatus="statusL" var="livro" items="${livros}">
                    <c:if test= "${livro.emprestado == true}">
                        <option value="${statusL.index}">${livro.titulo}</option>              
                    </c:if>
                </c:forEach>     
            </select>
            <input type="submit" value="Devolver" />
        </form>
        

    </body>
</html>
