public class FileReadException extends Exception {
    public FileReadException() {
        super("Can't read file.");
    }

    public FileReadException(String message) {
        super(message);
    }
}
