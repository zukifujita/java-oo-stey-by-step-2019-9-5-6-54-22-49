package practice08;

public class Klass {
    private int number;
    private Student leader;
    private String result;

    Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        result = "Class " + this.number;
        return result;
    }

    public Student assignLeader(Student student) {
        this.leader = student;

        if (this.leader != student) {
            return null;
        }

        return getLeader();
    }

    public Student getLeader() {
        return leader;
    }
}