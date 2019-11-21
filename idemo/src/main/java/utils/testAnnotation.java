/**
 * <p>Title:testAnnotation.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 * @version 
 */
package utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Title:testAnnotation</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 *
 */
@Target(value= {ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface testAnnotation {
    String value() default "";
}
