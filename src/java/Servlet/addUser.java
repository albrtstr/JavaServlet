/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

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
public class addUser extends HttpServlet {

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
            out.println("<title>Servlet addUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addUser at " + request.getContextPath() + "</h1>");
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
        DataBaseConnection conn = new DataBaseConnection();
        Connection connect = conn.getConnection();
        PrintWriter out = response.getWriter();
        
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String emailAddress = request.getParameter("emailAddress");
        String birthDate = request.getParameter("birthDate");
        
        userName = userName.toUpperCase();
        try{
            String query = "select * from userpengguna where userName = '" +userName+ "'";
            Statement statement = conn.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                out.println("<html>");
                    out.println("<body>");
                        out.println("<center>");
                        out.println("<h1>Username " +userName+ " sudah digunakan!</h1>");
                        out.println("<br><a href='inputDatabase.jsp'>Input kembali</a></br>");
                        out.println("</center>");
                    out.println("</body>");
                out.println("</html>");
            } else {
                PreparedStatement data = connect.prepareStatement("insert into userpengguna values(?,?,?,?)");
                data.setString(1, userName);
                data.setString(2, password);
                data.setString(3, emailAddress);
                data.setString(4, birthDate);
                data.executeUpdate();
                response.sendRedirect("showUser");
                connect.commit();
            }
            
        }
        catch (SQLException ex) {
            System.out.println("Message: " +ex.getMessage());
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
