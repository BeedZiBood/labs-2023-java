public class ExceptionForAnnotationParam extends Exception {
    public ExceptionForAnnotationParam() {
        this("Error");
    }

    public ExceptionForAnnotationParam(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    private final String message;
}
