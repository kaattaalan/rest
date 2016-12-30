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
        @Produces(MediaType.APPLICATION_JSON)
        public List<Student> getStudents()
        {
            return sdao.getStuds();
        }

    @PUT
    @Path("/students")
    @Consumes(MediaType.APPLICATION_JSON)
    public void putStudents(Student stu)
    {
        sdao.putStuds(stu);
    }

    @DELETE
    @Path("/students/{stuid}")
    public void delstudents(@PathParam("stuid")int id)
    {
        sdao.delStuds(id);
    }


}
