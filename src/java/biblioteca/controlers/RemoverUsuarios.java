/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package biblioteca.controlers;

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
@WebServlet(name = "RemoverUsuarios", urlPatterns = {"/RemoverUsuarios"})
public class RemoverUsuarios extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("oi 1222");
        int index = Integer.parseInt(request.getParameter("index"));
        
        UsuarioModel model = new UsuarioModel();
        
        model.remover(index);
        
        request.setAttribute("usuarios", model.getUsuarios());
        request.getRequestDispatcher("WEB-INF/Usuarios.jsp").forward(request, response);
    }
}
