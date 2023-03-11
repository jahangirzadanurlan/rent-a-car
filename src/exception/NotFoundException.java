package exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException() {
        super("Student not found...");
    }
}
