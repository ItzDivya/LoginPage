package com.unoveo.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/adduser")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("addUser.jsp");
    }

    @Override
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("in do post");
        PrintWriter out=res.getWriter();
        String fname= req.getParameter("fname");
        String lname=req.getParameter("lname");
        String city=req.getParameter("city");
        String age=req.getParameter("age");

        System.out.println("fname : "+fname);
        System.out.println("lname : "+lname);
        System.out.println("city : "+city);
        System.out.println("age : "+age);
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/abhidb", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            PreparedStatement st=con.prepareStatement("insert into register values (?, ?, ?, ?);");
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, city);
            st.setString(4, age);

            st.executeQuery();
            st.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
