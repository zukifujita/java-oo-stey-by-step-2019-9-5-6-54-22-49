package practice08;

public class Klass {
    private int number;
    private Student leader;

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

    public Student assignLeader(Student jerry) {
        this.leader = jerry;
        if (this.leader != null) {
            getLeader();
        }

        return null;
    }

    public Student getLeader() {
        return leader;
    }
}