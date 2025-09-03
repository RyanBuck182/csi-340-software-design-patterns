package main;

import java.util.LinkedList;
import java.util.List;

public class Student {
    private static int nextID = 1;

    private final int studentID;
    private final List<Enrollment> courses;
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentID = nextID++;
        this.courses = new LinkedList<Enrollment>();
    }

    public int getStudentID() {
        return studentID;
    }

    public List<Enrollment> getCourses() {
        return courses;
    }

    public void addCourse(Enrollment enrollment) {
        this.courses.add(enrollment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
