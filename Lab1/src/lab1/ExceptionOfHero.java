package lab1;

public class ExceptionOfHero extends Exception {
    public ExceptionOfHero() {
        this("Error");
    }

    public ExceptionOfHero(String message) {
        this.message = message;
    }

    public String what() {
        return message;
    }

    private final String message;
}
