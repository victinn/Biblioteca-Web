/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package biblioteca.controlers;

import biblioteca.entities.Livros;
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
@WebServlet(name = "ServletLivros", urlPatterns = {"/ServletLivros"})
public class ServletLivros extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
               String titulo;
        int paginas;
        String nomeAutor, genero, editora;
        int anoPublicacao;
        
        titulo = request.getParameter("titulo");
        paginas = Integer.parseInt(request.getParameter("paginas"));
        nomeAutor = request.getParameter("nomeAutor");
        genero = request.getParameter("genero");
        editora = request.getParameter("editora");
        anoPublicacao = Integer.parseInt(request.getParameter("anoPublicacao"));
        
        Livros l = new Livros(titulo, paginas, nomeAutor, genero, editora, anoPublicacao);
        LivroModel model = new LivroModel();
        model.add(l);
        
        UsuarioModel modelU = new UsuarioModel();
        
        request.setAttribute("usuarios", modelU.getUsuarios());
        request.setAttribute("livros", model.getlivros());
        request.getRequestDispatcher("WEB-INF/Livros.jsp").
                forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
