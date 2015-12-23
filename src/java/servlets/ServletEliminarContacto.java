/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import capaNegocio.Ciudad;
import capaNegocio.Contacto;
import capaNegocio.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eduardo
 */
@WebServlet(name = "ServletEliminarContacto", urlPatterns = {"/EliminarContacto"})
public class ServletEliminarContacto extends HttpServlet {

    

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("eliminarContacto.jsp");
        dispatcher.forward(request, response);
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
        int uidContacto = Integer.parseInt(request.getParameter("uidContacto"));
        int uidEmpresa = Integer.parseInt(request.getParameter("uidEmpresa"));
        int uidCiudad = Integer.parseInt(request.getParameter("uidCiudad"));
        
        Ciudad ciudadNegocio = new Ciudad();
        ciudadNegocio.setUid(uidCiudad);
        
        Empresa empresaNegocio = new Empresa();
        empresaNegocio.setUid(uidEmpresa);
        
        Contacto contactoNegocio = new Contacto();
        contactoNegocio.setUid(uidContacto);
        contactoNegocio.setCiudad(ciudadNegocio);
        contactoNegocio.setEmpresa(empresaNegocio);
        
        String resultado = contactoNegocio.eliminarContacto(contactoNegocio);
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
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
