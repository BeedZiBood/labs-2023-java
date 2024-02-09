public class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException() {
        super("Invalid file format.");
    }

    public InvalidFileFormatException(String message) {
        super(message);
    }
}
