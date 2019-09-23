package practice08;

public class Student extends Person {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    Student(int id, String name, int age) {
        super(id, name, age);
    }

    Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {

        String result = super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
        return result;
    }
}