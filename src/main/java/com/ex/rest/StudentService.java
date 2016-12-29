package com.ex.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by appu on 27/12/16.
 */
@Path("/Studentservice")
public class StudentService {


        StudentDAO sdao = new StudentDAO();

        @GET
        @Path("/students")
        @Produces(MediaType.APPLICATION_XML)
        public List<Student> getStudents()
        {
            return sdao.getStuds();
        }

    @PUT
    @Path("/students")
    @Consumes(MediaType.APPLICATION_XML)
    public void putStudents(Student stu)
    {
        sdao.putStuds(stu);
    }

}
