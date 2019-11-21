/**
 * <p>Title:ConnTable.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 * @version 
 */
package annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Title:ConnTable</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConnTable {
    String value();
}
