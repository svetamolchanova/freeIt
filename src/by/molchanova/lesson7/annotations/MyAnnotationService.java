package by.molchanova.lesson7.annotations;

import java.lang.annotation.*;

@Documented //Помечается если нужно что бы класс, помеченный нашей аннотацией попал в JavaDoc
@Inherited //Данная аннотация будет наследоваться потомками класса, помеченной нашей аннотацией
@Target(ElementType.TYPE) //Указывает область применения нашей аннотации
@Retention(RetentionPolicy.RUNTIME) //Указывает область действия нашей аннотации
public @interface MyAnnotationService {
	
	String name();
	
	boolean lazyLoad() default false;

}
