package test;

import main.Course;
import main.Enrollment;
import main.Student;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");
        System.out.println(student1);
        System.out.println(student2);

        // Create courses
        Course course1 = new Course("Intro to Programming", "CSI-140");
        Course course2 = new Course("Advanced Programming", "CSI-240");
        System.out.println(course1);
        System.out.println(course2);

        // Create enrollments for student one and two
        Enrollment enrollment1 = new Enrollment(course1, 4, "FA25", 93.2f);
        Enrollment enrollment2 = new Enrollment(course2, 2, "FA25", 85.1f);
        Enrollment enrollment3 = new Enrollment(course1, 1, "FA25", 72.9f);
        Enrollment enrollment4 = new Enrollment(course2, 3, "FA25", 98.33f);
        System.out.println(enrollment1);
        System.out.println(enrollment2);
        System.out.println(enrollment3);
        System.out.println(enrollment4);

        // Add enrollments to student one and two
        student1.addCourse(enrollment1);
        student1.addCourse(enrollment2);
        student2.addCourse(enrollment3);
        student2.addCourse(enrollment4);
        System.out.println(student1);
        System.out.println(student2);
    }
}
