package by.molchanova.lesson7.annotations.passwordvalidator;

import java.util.regex.*;
import javax.validation.*;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {

    private final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,64})";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
