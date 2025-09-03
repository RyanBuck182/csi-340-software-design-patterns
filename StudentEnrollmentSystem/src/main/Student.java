package main;

import java.util.LinkedList;
import java.util.List;

public class Student {
    private static int nextID = 1;

    private String name;
    private int studentID;
    private List<Enrollment> courses;

    public Student(String name) {
        this.name = name;
        this.studentID = nextID++;
        this.courses = new LinkedList<Enrollment>();
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

    public void addCourse(Enrollment enrollment) {
        this.courses.add(enrollment);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", courses=" + courses +
                '}';
    }
}
