/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package biblioteca.controlers;

import biblioteca.models.LivroModel;
import biblioteca.models.UsuarioModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author victo
 */
@WebServlet(name = "RemoverLivros", urlPatterns = {"/RemoverLivros"})
public class RemoverLivros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int index = Integer.parseInt(request.getParameter("index"));
        
        LivroModel model = new LivroModel();
        model.remover(index);
        
        UsuarioModel modelU = new UsuarioModel();
        
        request.setAttribute("usuarios", modelU.getUsuarios());
        request.setAttribute("livros", model.getlivros());
        request.getRequestDispatcher("WEB-INF/Livros.jsp").
                forward(request, response);
    }
}
