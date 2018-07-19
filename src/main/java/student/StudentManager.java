package student;

public class StudentManager {
    Student[] students = new Student[20];
    private int size;

    public StudentManager() {

    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }

    public void find(String name) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            boolean match = students[i].getName().equals(name);
            if (match) {
                System.out.println("The position of student \"" + name + "\" in list is" + (i + 1));
                found++;
                break;
            }
            boolean notFound = found == 0;
            if (notFound) {
                System.out.println("There is no student with name " + name + "in list");
            }
        }
    }

    public void displayAll() {
        if (size == 0) {
            System.out.println("There is no any student in list!");
        } else if (size == 1) {
            System.out.println("There is only one student in list");
            System.out.println(students[0].getInformation() + "");
            System.out.println();
        } else {
            System.out.println("There are " + size + "students list: ");
            for (int i = 0; i < size; i++) {
                System.out.println(students[i].getInformation() + ", ");
            }
            System.out.println();
        }
    }

}
