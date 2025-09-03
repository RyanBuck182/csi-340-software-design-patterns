package main;

public class Enrollment {
    private final Course course;
    private final String semester;
    private int section;
    private float grade;

    public Enrollment(Course course, int section, String semester, float grade) {
        this.course = course;
        this.section = section;
        this.semester = semester;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "course=" + course +
                ", section=" + section +
                ", semester='" + semester + '\'' +
                ", grade=" + grade +
                '}';
    }
}
