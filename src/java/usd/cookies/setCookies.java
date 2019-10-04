/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usd.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class setCookies extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet setCookies</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet setCookies at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
            for (int i = 0; i < 3; i++) {
                Cookie cookie = new Cookie("Session-Cookie-" +i,
                        "Cookie-Value-S" + i);
                response.addCookie(cookie);
                cookie = new Cookie("Persistent-Cookie-" +i,
                    "Cookie-Value-P" +i);
                cookie.setMaxAge(3600);
                response.addCookie(cookie);
            }
            
            String title = "Setting Cookies";
            out.println("<HTML>"
                    + "<BODY BGCOLOR=\"#FDF5E6\">\n"
                    + "<H1 ALIGN=\"CENTER\">" +title+ "</H1>\n"
                    + "To see them, visit the\n"
                    + "<A HREF=\"showCookies\">\n"
                    + "<CODE>showCookies</CODE> servlet</A>.\n"
                    + "<P>\n"
                    + "Three of the cookies are associated only with the\n"
                    + "current session, while three are persistent.\n"
                    + "Quit the browser, restart, and return to the\n"
                    + "<CODE>ShowCookies</CODE> servlet to verify that\n"
                    + "the three long-lived ones persist across sessions.\n"
                    + "</BODY></HTML>");
        } finally{
            out.close();
        }
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
