package by.molchanova.lesson7.annotations.passwordvalidator;

import java.lang.annotation.*;
import javax.validation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target(FIELD)
@Retention(RUNTIME)
public @interface ValidPassword {

    String message();
}
