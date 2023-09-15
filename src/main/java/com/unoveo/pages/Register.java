package com.unoveo.pages;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/showAllServlet")

public class Register {
    String fname;
    String lname;
    String city;
    int age;
    public void setfname(String fname){
        this.fname=fname;
    }
    public void setlname(String lname){
        this.lname=lname;
    }
    public void setcity(String city){
        this.city=city;
    }
    public void setage(int age){
        this.age=age;
    }

    public String getfname() {
        return fname;
    }

    public String getlname() {
        return lname;
    }

    public String getcity() {
        return city;
    }

    public int getage() {
        return age;
    }
}
