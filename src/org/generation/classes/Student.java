package org.generation.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
{
    private String name;

    private String id;

    private int age;

    public final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}