/*
 * Sweethome Domotic System
 * Copyright © 2017 Nicola Iacovelli
 * Tutti i diritti sono riservati
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicola-pc
 */
public class servlet extends HttpServlet {

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
        response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Informazioni client-server</title>"); 
       out.println("</head>");
       out.println("<body>");		
       out.println("<h3>Informazioni sul sistema client-server</h3>");     
       out.println("Porta del server: " +request.getServerPort()+"<BR>");   
       out.println("Carattere encoding: " +request.getCharacterEncoding()+"<BR>");  
       out.println("Metodo: " + request.getMethod()+"<BR>");
       out.println("Indirizzo della richiesta: " + request.getRequestURI()+"<BR>");  
       out.println("Informazioni sul percorso: " + request.getPathInfo()+"<BR>");  
       out.println("Protocollo: " + request.getProtocol()+"<BR>");
       out.println("Nome host remoto: " + request.getRemoteHost()+"<BR>");
       out.println("Indirizzo host remoto: " + request.getRemoteAddr()+"<BR>");

       out.println("</body>");
       out.println("</html>");

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
