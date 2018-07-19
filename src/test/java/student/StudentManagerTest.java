package student;

import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student andy = new Student("Andy", 23);
        studentManager.add(andy);
        System.out.println("added " + andy.getInformation());
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInformation());
        studentManager.displayAll();

        Student samy = new Student("Samy", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInformation());
        studentManager.displayAll();


    }

}