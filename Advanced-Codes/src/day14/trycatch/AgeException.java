package day14.trycatch;

public class AgeException extends RuntimeException{
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);//报错信息
    }
}
