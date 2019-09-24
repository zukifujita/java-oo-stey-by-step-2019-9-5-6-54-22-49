package practice02;

public class Student extends Person{
    private String name;
    private int age;
    private int klass;
    private String result;

    Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        result = "I am a Student. I am at Class " + getKlass() + ".";
        return result;
    }
}
