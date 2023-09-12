package com.unoveo.pages;
import com.unoveo.pages.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Inside doPost method");
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("uname");
        String upass=req.getParameter("upass");


        try{
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                System.out.println("Driver Loaded");
//                Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307//abhidb", "root", "root");
                Connection con= DriverManager.getConnection("jdbc:mariadb://localhost:3307/abhidb", "root", "root");

                System.out.println("Connection est...");
//
                PreparedStatement st=con.prepareStatement("select * from user where username=? and userpass=?");

                st.setString(1, uname);
                st.setString(2, upass);

                ResultSet rs=st.executeQuery();

                if(rs.next()){
                    System.out.println("Login Successful");
                    PreparedStatement stt=con.prepareStatement("select * from register;");
                    System.out.println("PrepareStatement done");
                   ResultSet rst = stt.executeQuery();

                    System.out.println("Statement Executed");
                }

                else{
                    out.println("Sorry! Invalid Credentials");
                }
                System.out.println("Got st. obj to execute query");

                st.executeQuery();
                System.out.println("Query Executed");

                st.close();
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}