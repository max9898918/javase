package a100_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE,ElementType.METHOD }) //与前面定义的注解不同的地方，这里使用了元注解Target
public @interface A000_Annotation {
//这里定义了一个空的注解，它能干什么呢。我也不知道，但他能用。
}
