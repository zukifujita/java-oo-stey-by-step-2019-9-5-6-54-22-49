package practice07;

public class Klass {
    private int number;

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
}
