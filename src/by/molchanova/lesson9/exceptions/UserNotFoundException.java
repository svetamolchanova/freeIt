package by.molchanova.lesson9.exceptions;

public class UserNotFoundException extends Exception{

    private String message;

    public UserNotFoundException(String string) {
        super(string);
    }

    public UserNotFoundException() {
        super("User not found");
        this.message = "Not found";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
