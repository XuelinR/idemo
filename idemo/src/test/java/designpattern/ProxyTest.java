/**
 * <p>Title:ProxyTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.proxy.Printable;
import designpattern.proxy.PrinterProxy;


/**
 * <p>Title:ProxyTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 *
 */
public class ProxyTest {
    @Test
    public void proxyTest() {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("现在的名字是"+printable.getPrinterName()+"。");
        printable.setPrinterName("Bob");
        System.out.println("现在的名字是 " +printable.getPrinterName()+ "。");
        printable.print("Hello,world.");
    }
}
