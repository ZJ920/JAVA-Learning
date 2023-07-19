package day14.trycatch;

public class NameException extends RuntimeException {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
