/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usd.tugas;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class rekomendasifilm extends HttpServlet {

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
            String[] listFilm = new String[]{"Focus", "Sponge Bob The Movie", 
                                        "Fifty Shades of Grey", "The Lazarus Effect"};
            String[] tableList = new String[]{"No", "Judul Film", "Rating", "Bintang Film", "Tanggal Tayang"};
            String[] tableFilm = new String[]{"Chappie", "Exotic Marigold Hotel", "Unfinished Business"};
            String[] tableRating = new String[]{"8.6", "7.0", "7.3"};
            String[] tableStar = new String[]{"Hugh Jackman", "Judi Dench", "Vince Vaughn"};
            String[] tableDate = new String[]{"6 Maret 2015", "6 Maret 2015", "6 Maret 2015"};
            
            int column = 5;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rekomendasi Film</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Rekomendasi Film di Bioskop Kesayangan Anda</h1>");
            out.println("<h3>Daftar Film yang Sedang Diputar Saat Ini</h3>");
            out.println("<ol>");
            for (int i = 0; i < listFilm.length; i++) {
                out.println("<li>"+listFilm[i]+"</li>");
            }
            out.println("</ol>");
            out.println("<h3>Daftar Film yang akan Diputar Minggu Ini</h3>");
            out.println("<table border='1'");
            out.println("<tr>");
            for (int i = 0; i < column; i++) {
                out.println("<td>"+tableList[i]+"</td>");
            }
            out.println("</tr>");
            for (int i = 0; i < tableFilm.length; i++) {
                out.println("<tr>");
                out.println("<td>"+(i+1)+"</td>"
                          + "<td>"+tableFilm[i]+"</td>"
                          + "<td>"+tableRating[i]+"</td>"
                          + "<td>"+tableStar[i]+"</td>"
                          + "<td>"+tableDate[i]+"</td>");
                out.println("</tr>");
            }
            out.println("");
            out.println("");
            out.println("</body>");
            out.println("</html>");
        } finally {
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
