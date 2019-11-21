/**
 * <p>Title:ConnFiled.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 * @version 
 */
package annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/**
 * <p>Title:ConnFiled</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 *
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface ConnFiled {
    String column();
    String type();
    int length();
}
