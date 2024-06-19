package annotation.reflection.io;
import java.lang.annotation.*;

@Repeatable(SecondAnnotationS.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SecondAnnotation {
    int hour();
    int priority();
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SecondAnnotationS {
    SecondAnnotation[] value() default {};
}
