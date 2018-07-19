package course;

public class Course {
    private String name;
    private String[] students = new String[5];
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


    public int getStudentsCount() {
        return studentsCount;
    }

    public void removeStudent(String andy) {
        boolean found = false;
        for (int i = 0; i < studentsCount; i++) {
            if (students[i] == name) {
                found = true;
                for (int j = i + 1; j < studentsCount; j++) {
                    students[j - 1] = students[j];
                }
                studentsCount--;
                System.out.println("Student \"" + name + "\" removed!");
            }
        }
        if (!found) {
            System.out.println("Student \"" + name + "\" not existed in list, nothing removed!");
        }
    }
}
