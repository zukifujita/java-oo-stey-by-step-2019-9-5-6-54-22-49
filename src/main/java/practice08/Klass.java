package practice08;

public class Klass {
    private int number;
    private String leader;

    Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        String result = "Class " + this.number;
        return result;
    }

//    public String getLeader() {
//
//    }

    public void assignLeader(Student student) {
        student.getId();
        student.getName();
        student.getAge();
        student.getKlass();
    }
}
