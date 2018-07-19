package student;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return "Student " + name + ".\nAge: " + age;
    }
}
