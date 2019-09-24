package practice07;

public class Student extends Person {
    private String name;
    private int age;
    private Klass klass;
    private String result;

    Student(String name, int age) {
        super(name, age);
    }

    Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        result = super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
        return result;
    }
}
