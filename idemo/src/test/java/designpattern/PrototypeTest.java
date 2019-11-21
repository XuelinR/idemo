/**
 * <p>Title:PrototypeTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.prototype.framework.Manager;
import designpattern.prototype.framework.Product;
import designpattern.prototype.message.MessageBox;
import designpattern.prototype.message.UnderlinePen;


/**
 * <p>Title:PrototypeTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 *
 */
public class PrototypeTest {
    @Test
    public void prototypeTest(){
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);
        Product product1 = manager.create("strong message");
        product1.use("Hello,world.");
        Product product2 = manager.create("warning box");
        product2.use("Hello,world.");
        Product product3 = manager.create("slash box");
        product3.use("Hello,world.");
    }
}
