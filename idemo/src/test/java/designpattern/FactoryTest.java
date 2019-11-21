package designpattern;

import org.junit.Test;

import designpattern.factory.framework.Factory;
import designpattern.factory.framework.Product;
import designpattern.factory.idcard.IDCardFactory;



/**
 * @author XuelinR
 *	工厂模式测试
 */
public class FactoryTest {
	@Test
	public void factoryTest() {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("张三");
		Product card2 = factory.create("李四");
		Product card3 = factory.create("王五");
		card1.use();
		card2.use();
		card3.use();
	}
}
