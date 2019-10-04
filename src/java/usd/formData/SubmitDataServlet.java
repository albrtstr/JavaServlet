/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usd.formData;

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
public class SubmitDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nim = request.getParameter("nim");
        String nama = request.getParameter("nama");
        String statusLulus = request.getParameter("statuslulus");
        
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                    out.println("<title>Status Kelulusan</title>");
                out.println("</head>");
                out.println("<body>");
                    out.println("<h1>STATUS KELULUSAN MAHASISWA</h1");
                    out.println("<p>Mahasiswa dengan Nama "+nama+
                            " NIM "+nim+" berhasil menyelesaikan studi S1 dengan predikat "+statusLulus+"</p>");
                out.println("</body>");
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
        
        String nim = request.getParameter("nim");
        String nama = request.getParameter("nama");
        String statusLulus = request.getParameter("statuslulus");
        //String keterangan = filter(request.getParameter("keterangan"));
        
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                    out.println("<title>Status Kelulusan</title>");
                out.println("</head>");
                out.println("<body>");
                    out.println("<h1>UCAPAN SELAMAT!!!</h1>");
                    out.println("<p>Selamat kepada "+nama+" dengan NIM "+nim+
                            " mendapatkan predikat kelulusan "+statusLulus+"</p>");
                    //out.println("<p>Keterangan: "+keterangan);
                out.println("</body>");
            out.println("</html>");    
        } finally {
            out.close();
        }
    }
    
    public static String filter(String input){
        StringBuffer filtered = new StringBuffer(input.length());
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            switch (c) {
                case '<':
                    filtered.append("&lt;");
                    break;
                case '>':
                    filtered.append("&gt;");
                    break;
                case '"':
                    filtered.append("&amp;");
                default:
                    filtered.append(c);
            }
        } return(filtered.toString());
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
