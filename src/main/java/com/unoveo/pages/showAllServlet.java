//package com.unoveo.pages;
//import com.unoveo.pages.*;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import javax.xml.transform.Result;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.*;
//import java.util.ArrayList;
//
//import static java.lang.Class.forName;
//
//public class showAllServlet extends HttpServlet,{
//    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        try{
//            Class.forName("org.mariadb.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3307/abhidb", "root", "root");
//            PreparedStatement st=con.prepareStatement("select * from register");
//            ResultSet rs=st.executeQuery();
//
//            ArrayList<Register> list=new ArrayList<>();
//            while (rs.next()){
//                String fname=rs.getString("fname");
//                String lname=rs.getString("lname");
//                String city=rs.getString("city");
//                int age=rs.getInt("age");
//
//                Register reg=new Register();
//                reg.setfname(fname);
//                reg.setlname(lname);
//                reg.setcity(city);
//                reg.setage(age);
//                list.add(reg);
//
//            }
//
//
//
//
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}