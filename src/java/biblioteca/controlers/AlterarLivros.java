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
import java.io.PrintWriter;


/**
 *
 * @author victo
 */
@WebServlet(name = "AlterarLivros", urlPatterns = {"/AlterarLivros"})
public class AlterarLivros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
        String novoTitulo;
        int novoPaginas;
        String novoNomeAutor, novoGenero, novoEditora;
        int novoAnoPublicacao;
        int index;
        
        novoTitulo = request.getParameter("titulo");
        novoPaginas = Integer.parseInt(request.getParameter("paginas"));
        novoNomeAutor = request.getParameter("nomeAutor");
        novoGenero = request.getParameter("genero");
        novoEditora = request.getParameter("editora");
        novoAnoPublicacao = Integer.parseInt(request.getParameter("anoPublicacao"));
        index = Integer.parseInt(request.getParameter("index"));
        
        LivroModel model = new LivroModel();
        Livros l = model.arrayLivros.get(index);
        l.setTitulo(novoTitulo);
        l.setPaginas(novoPaginas);
        l.setNomeAutor(novoNomeAutor);
        l.setGenero(novoGenero);
        l.setEditora(novoEditora);
        l.setAnoPublicacao(novoAnoPublicacao);
        
        UsuarioModel modelU = new UsuarioModel();
        
        request.setAttribute("livros", model.getlivros());
        request.setAttribute("usuarios", modelU.getUsuarios());
        request.getRequestDispatcher("WEB-INF/Livros.jsp").
                forward(request, response);
        
        }
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
