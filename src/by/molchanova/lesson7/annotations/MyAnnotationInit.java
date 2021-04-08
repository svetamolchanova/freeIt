package by.molchanova.lesson7.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotationInit {

    boolean suppressException() default false;
}
