/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StokGudang;

import Tools.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class fungsiGudang extends HttpServlet {

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
            out.println("<title>Servlet fungsiGudang</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet fungsiGudang at " + request.getContextPath() + "</h1>");
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
        Connection conn = connect.getConnection();
        PrintWriter out = response.getWriter();

        String idProduk = request.getParameter("idProduk");
        String merkProduk = request.getParameter("merkProduk");
        String tipeProduk = request.getParameter("tipeProduk");
        String jenisProduk = request.getParameter("radioJenis");
        String platformProduk = request.getParameter("jenisPlatform");
        String hargaProduk = request.getParameter("hargaProduk");
        String jumlahProduk = request.getParameter("jumlahProduk");

        String button = request.getParameter("button");

        System.out.println(idProduk);
        try {
            if ("simpanButton".equals(button)) {
                PreparedStatement dataProduk = conn.prepareStatement("insert into stok_gudang values(?,?,?,?,?,?,?)");
                dataProduk.setString(1, idProduk);
                dataProduk.setString(2, merkProduk);
                dataProduk.setString(3, tipeProduk);
                dataProduk.setString(4, jenisProduk);
                dataProduk.setString(5, platformProduk);
                dataProduk.setString(6, hargaProduk);
                dataProduk.setString(7, jumlahProduk);
                dataProduk.executeUpdate();
                
                conn.commit();
            } else if ("updateButton".equals(button)) {
                String query = "select * from stok_gudang where produkid like '%"+idProduk+"%'";
                Statement statement = connect.getConnection().createStatement();
                ResultSet result = statement.executeQuery(query);
                
                if (result.next()) {
                    idProduk = result.getString(1);
                    merkProduk = result.getString(2);
                    tipeProduk = result.getString(3);
                    jenisProduk = result.getString(4);
                    platformProduk = result.getString(5);
                    hargaProduk = result.getString(6);
                    jumlahProduk = result.getString(7);
                    response.sendRedirect("formUpdateStok.jsp?idProduk='"+idProduk+"'&merkProduk='"+merkProduk+"'"
                            + "&tipeProduk='"+tipeProduk+"'&radioJenis='"+jenisProduk+"'"
                            + "&platformProduk='"+platformProduk+"'&hargaProduk='"+hargaProduk+"'"
                            + "&jumlahProduk='"+jumlahProduk+"'");
                }

            } else if ("hapusButton".equals(button)) {
                PreparedStatement dataProduk = conn.prepareStatement("delete from stok_gudang where produkid=?");
                dataProduk.setString(1, idProduk);
                dataProduk.executeUpdate();
                conn.commit();
                response.sendRedirect("showStock");
            }

        } catch (SQLException ex) {
            out.print("Message: " + ex.getMessage());
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
