package com.ex.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by appu on 27/12/16.
 */
@XmlRootElement(name="student")
public class Student {
    private int id;
    private String  name;
    Student(){}

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
