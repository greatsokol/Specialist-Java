package day2_2_exception;

public class MyException extends Exception {
    private final double t;
    
    public MyException(double t) {
        super("MyException: Default message");
        this.t = t;
    }

    public MyException(double t, String message) {
        super(message);
        this.t = t;
    }

    public MyException(double t, String message, Throwable cause) {
        super(message, cause);
        this.t = t;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
