package com.ex.rest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by appu on 27/12/16.
 */
public class StudentDAO {
    private Connection conn;

    public StudentDAO() {
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/sample","root","expertzlab");
        }catch (SQLException e)
        {
            System.out.println(e);
        }

    }
    public List<Student> getStuds() {
       List<Student> list=new ArrayList<Student>();
        list.add(new Student(111,"Chathan"));
        try{

            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM student");

            while(rs.next())
            {
                list.add(new Student(rs.getInt(1),rs.getString(2)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }

        return list;
    }


    public void putStuds(Student stu) {
        try{
            PreparedStatement st=conn.prepareStatement("INSERT INTO student VALUES(?,?)");
            st.setInt(1,stu.getId());
            st.setString(2,stu.getName());
            st.execute();
        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public void delStuds(int id)
    {
        try
        {
            PreparedStatement st=conn.prepareStatement("DELETE FROM student WHERE id=?");
            st.setInt(1,id);
            st.execute();
        }catch (SQLException e){
            System.out.println(e);
        }
    }





}
