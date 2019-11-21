/**
 * <p>Title:DecoratorTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.decorator.Display;
import designpattern.decorator.FullBorder;
import designpattern.decorator.SideBorder;
import designpattern.decorator.StringDisplay;


/**
 * <p>Title:DecoratorTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class DecoratorTest {
    @Test
    public void decoratorTest() {
        Display d1 = new StringDisplay("hello,world.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show(); 
        Display d4 = new SideBorder(new FullBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("你好，世界。")
                                        ),
                                '*')
                        )
                ),
                '/');
        d4.show();
    }
}
