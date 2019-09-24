package practice07;

public class Klass {
    private int number;
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
}
