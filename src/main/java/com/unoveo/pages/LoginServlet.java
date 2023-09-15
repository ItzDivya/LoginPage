package com.unoveo.pages;
import com.unoveo.pages.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Inside doPost method");
        PrintWriter out=res.getWriter();

        // getting parameters from frontend jsp
        String uname=req.getParameter("uname");
        String upass=req.getParameter("upass");


        try{
            try {
                System.out.println("Class to be loaded");
                Class.forName("org.mariadb.jdbc.Driver");
                System.out.println("Driver Loaded");
  //            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307//abhidb", "root", "root");
                Connection con= DriverManager.getConnection("jdbc:mariadb://localhost:3307/abhidb", "root", "root");

                System.out.println("Connection est...");
//
                PreparedStatement st=con.prepareStatement("select * from user where username=? and userpass=?");

                st.setString(1, uname);
                st.setString(2, upass);

                ResultSet rs=st.executeQuery();

                if(rs.next()){
                    System.out.println("Login Successful");
                    PreparedStatement st2=con.prepareStatement("select * from register");
                    ResultSet rs2=st2.executeQuery();

                    ArrayList<Register> list=new ArrayList<>();
                    while (rs2.next()){
                        String fname=rs2.getString("fname");
                        String lname=rs2.getString("lname");
                        String city=rs2.getString("city");
                        int age=rs2.getInt("age");

                        Register reg=new Register();
                        reg.setfname(fname);
                        reg.setlname(lname);
                        reg.setcity(city);
                        reg.setage(age);
                        list.add(reg);

                    }


                    // redirect to homePage.jsp with Arraylist as parameter
                    req.setAttribute("Register", list);
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/home.jsp");
                    requestDispatcher.forward(req,res);


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