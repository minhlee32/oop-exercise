package course;

public class Course {
    private String name;
    private String[] students;
    private int studentsCount;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public void addStudent(String student) {
        students[studentsCount] = name;
        studentsCount++;
    }
}
