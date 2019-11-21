/**
 * <p>Title:BridgeTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.Bridge.CountDisplay;
import designpattern.Bridge.Display;
import designpattern.Bridge.StringDisplayImpl;


/**
 * <p>Title:BridgeTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class BridgeTest {
    @Test
    public void bridgeTest() {
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
