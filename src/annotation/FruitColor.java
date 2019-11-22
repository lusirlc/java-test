package annotation;

import java.lang.annotation.*;

/**
 * 水果颜色注解
 * Created By Lu Chuan On 2019/11/22
 */
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
	enum Color{BLUE,RED,GREEN};
	Color fruitColor() default Color.GREEN;
}
