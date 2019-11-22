package annotation;

import java.lang.annotation.*;

/**
 * 水果名称注解
 * Created By Lu Chuan On 2019/11/22
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
	String value() default "";
}
