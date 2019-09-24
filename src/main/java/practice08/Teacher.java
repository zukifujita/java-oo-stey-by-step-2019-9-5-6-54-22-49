package practice08;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private String result;
    private Klass klass;

    Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        result = "";
        if(getKlass() == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            result = super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }

        return result;
    }

    public String introduceWith(Student jerry) {
        result = "";

        if(klass.getNumber() != 2){
            result = super.introduce() + " I am a Teacher. I don't teach " + jerry.getName() + ".";
        } else {
            result = "My name is Tom. I am 21 years old. I am a Teacher. I teach " + jerry.getName() + ".";
        }

        return result;
    }
}