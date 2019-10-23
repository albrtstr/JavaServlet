/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StokGudang;

import Tools.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class showStock extends HttpServlet {

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
            out.println("<title>Servlet showStock</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet showStock at " + request.getContextPath() + "</h1>");
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
        DataBaseConnection connect = new DataBaseConnection();
        PrintWriter out = response.getWriter();

        try {
            String query = "select * from stok_gudang";
            Statement statement = connect.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);

            out.print("<html>");
            out.print("<body>");
            out.print("  <style>\n"
                    + "    table {\n"
                    + "      border-collapse:collapse;\n"
                    + "      width: 50%;\n"
                    + "      border: 1px solid black;\n"
                    + "      \n"
                    + "    }\n"
                    + "    th, td {\n"
                    + "      border-bottom: 1px solid #ddd;\n"
                    + "\n"
                    + "    }\n"
                    + "  </style>");
            out.print("<h2>Daftar Stok Gadget</h2>");
            out.print("<table border=1>");
            out.print("<tr>");
            out.print("<td><u><center>ID Produk</center></u></td>");
            out.print("<td><u><center>Nama</center></u></td>");
            out.print("<td><u><center>Tipe</center></u></td>");
            out.print("<td><u><center>Jenis</center></u></td>");
            out.print("<td><u><center>Platform</center></u></td>");
            out.print("<td><u><center>Harga</center></u></td>");
            out.print("<td><u><center>Jumlah</center></u></td>");
            out.print("</tr>");

            while (result.next()) {
                out.print("<tr>");
                out.print("<td>" + result.getString(1) + "</td>");
                out.print("<td>" + result.getString(2) + "</td>");
                out.print("<td>" + result.getString(3) + "</td>");
                out.print("<td>" + result.getString(4) + "</td>");
                out.print("<td>" + result.getString(5) + "</td>");
                out.print("<td><p style='text-align:right;'>" + result.getString(6) + "</p></td>");
                out.print("<td><p style='text-align:right;'>" + result.getString(7) + "</p></td>");
                out.print("</tr>");
            }

            out.print("</table>");
            out.print("<a href='inputStok.jsp'>Kembali</a>");
            out.print("</body>");
            out.print("</html>");

        } catch (Exception ex) {

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
