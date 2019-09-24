package practice07;

public class Teacher extends Person {
    private String name;
    private int age;
    private Klass klass;
    private String result;

    Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if(getKlass() == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            result = super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }

        return result;
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber() != klass.getNumber()){
            result = super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        } else {
            result = "My name is Tom. I am 21 years old. I am a Teacher. I teach " + student.getName() + ".";
        }

        return result;
    }
}
