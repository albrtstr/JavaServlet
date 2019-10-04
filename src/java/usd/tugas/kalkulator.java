/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usd.tugas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class kalkulator extends HttpServlet {
    int hasil = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            int value1 = Integer.parseInt(request.getParameter("Bil1"));
            int value2 = Integer.parseInt(request.getParameter("Bil2"));

            String tanda = request.getParameter("Operasi");

            if (tanda.equals("+")) {
                hasil = value1 + value2;
            } else if (tanda.equals("-")) {
                hasil = value1 - value2;
            } else if (tanda.equals("*")) {
                hasil = value1 * value2;
            } else if (tanda.equals("/")) {
                hasil = value1 / value2;
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                    out.println("<title>Kalkulator Sederhana</title>");
                out.println("</head>");
                out.println("<body>");
                    out.println("<form action='kalkulator' method='GET'>");
                      out.println("<h1>Kalkulator Sederhana</h1>");

                        out.println("<table>");
                            out.println("<tr>");
                                out.println("<td>Bilangan 1</td>");
                                out.println("<td>:</td>");
                                out.println("<td><input type='text' name='Bil1'value='" + value1 + "'></td>");
                            out.println("</tr>");
                            out.println("<tr>");
                                out.println("<td>Bilangan 2</td>");
                                out.println("<td>:</td>");
                                out.println("<td><input type='text' name='Bil2' value='" + value2 + "'></td>");
                            out.println("</tr>");
                            out.println("<tr>");
                                out.println("<td>Hasil</td>");
                                out.println("<td>:</td>");
                                out.println("<td><input type='text' name='Hasil' value='" + hasil + "'></td>");
                            out.println("</tr>");
                            out.println("<tr>");
                                out.println("<td colspan='3'>");
                                    out.println("<input type='submit' name='Operasi' value='+'>");
                                    out.println("<input type='submit' name='Operasi' value='-'>");
                                    out.println("<input type='submit' name='Operasi' value='*'>");
                                    out.println("<input type='submit' name='Operasi' value='/'>");
                                out.println("</td>");
                            out.println("</tr>");
                        out.println("</table>");
                out.println("</body>");
            out.println("</html>");
            
        } 
        finally {
            out.close();
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
