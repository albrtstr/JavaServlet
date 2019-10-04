/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usd.formData;

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
public class SubmitBiodata extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nama = request.getParameter("nama");
        String alamat = request.getParameter("alamat");
        String umur = request.getParameter("umur");
        String gender = request.getParameter("gender");
        String[] hobby = request.getParameterValues("hobby");
        
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                    out.println("<table border='1'>");
                    out.println("<tr>");
                        out.println("<td>Nama</td>");
                        out.println("<td>:</td>");
                        out.println("<td>"+nama+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                        out.println("<td>Alamat</td>");
                        out.println("<td>:</td>");
                        out.println("<td>"+alamat+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                        out.println("<td>Usia</td>");
                        out.println("<td>:</td>");
                        out.println("<td>"+umur+" tahun</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                        out.println("<td>Jenis Kelamin</td>");
                        out.println("<td>:</td>");
                        out.println("<td>"+gender+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td>Hobby</td>");
                    out.println("<td>:</td>");
                    out.println("<td>");
                    for (int i = 0; i < hobby.length; i++) {
                        if (i != hobby.length - 1) {
                            out.print(hobby[i]+", ");
                        } else {
                            out.print(hobby[i]);
                        }
                    }
                    out.println("</td>");
                    out.println("</tr>"); 
                    out.println("</table>");
                out.println("</head>");
            out.println("</html>");
        } finally {
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
        response.setContentType("text/html;charset=UTF-8");
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
