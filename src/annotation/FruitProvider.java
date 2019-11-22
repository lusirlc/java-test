package annotation;

import java.lang.annotation.*;

/**
 * Created By Lu Chuan On 2019/11/22
 */
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
	int id() default -1;
	
	String name() default "";
	
	String address() default "";
	
}
