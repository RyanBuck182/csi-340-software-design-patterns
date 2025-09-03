public class Enrollment {
    private Course course;
    private int section;
    private String semester;
    private float grade;

    public Enrollment(Course course, int section, String semester, float grade) {
        this.course = course;
        this.section = section;
        this.semester = semester;
        this.grade = grade;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
