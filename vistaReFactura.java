/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviking.vista;

import daoPrueba.daoProducto;
import daoPrueba.daoReFactura;
import daoPrueba.daoRegistroAlumno;
import dtoprueba.dtoInsertProductos;
import dtoprueba.dtoReFactura;
import dtoprueba.dtoRegistroAlumno;
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
 * @author james
 */
@WebServlet(name = "vistaReFactura", urlPatterns = {"/vistaReFactura"})
public class vistaReFactura extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            dtoReFactura dtoIn = new dtoReFactura();
            daoReFactura daoIn = new daoReFactura();
            daoProducto daoProducto = new daoProducto();
            dtoInsertProductos dtoProducto= new dtoInsertProductos();
            dtoRegistroAlumno dtoAlumno = new dtoRegistroAlumno();
            daoRegistroAlumno daoAlumno = new daoRegistroAlumno();
            
            
            
            //datos alumno
            dtoAlumno.setNombre(request.getParameter("nombre"));
            dtoAlumno.setNombre(request.getParameter("id"));
            dtoAlumno.setNombre(request.getParameter("email"));
            
            daoAlumno.guardarAlumno(dtoAlumno);
            
           
            
            //datos proveedor
            dtoIn.setCedula(request.getParameter("id"));
            dtoIn.setNombre(request.getParameter("nombre"));
            dtoIn.setCorreo(request.getParameter("email"));
            daoIn.guardarFactura(dtoIn);
            
            //datos productos
            dtoProducto.setNombreProducto(request.getParameter("nombreProducto"));
            dtoProducto.setValorUnidad(request.getParameter("valorUnidad"));
            dtoProducto.setCantidad(request.getParameter("Cantidad"));
            dtoProducto.setuMedida(request.getParameter("uMedida"));
            daoProducto.guardarProducto(dtoProducto);
            
                                                
            if (dtoIn.getCedula().trim().length() <=11) {

                RequestDispatcher requestIn = request.getRequestDispatcher("registroDeFacturas.jsp");
                requestIn.forward(request, response);

            } else if(dtoProducto.getNombreProducto().trim().length() <=11) {
                
                RequestDispatcher requestIn = request.getRequestDispatcher("registroDeFacturas.jsp");
                requestIn.forward(request, response);
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet vistaReFactura</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Su informacion contiene errores.</h1>");
                out.println("</body>");
                out.println("</html>");
            }

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
