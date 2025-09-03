package main;

import java.util.List;

public class Student {
    private static int nextID = 1;

    private String name;
    private int studentID;
    private List<Enrollment> courses;

    public Student(String name, List<Enrollment> courses) {
        this.name = name;
        this.studentID = nextID++;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Enrollment> getCourses() {
        return courses;
    }

    public void setCourses(List<Enrollment> courses) {
        this.courses = courses;
    }
}
