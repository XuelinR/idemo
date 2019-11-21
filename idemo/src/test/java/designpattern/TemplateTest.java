package designpattern;

import org.junit.Test;

import designpattern.template.AbstractDisplay;
import designpattern.template.CharDisplay;
import designpattern.template.StringDisplay;


/**
 * @author XuelinR
 *	模板模式测试
 */
public class TemplateTest {
	@Test
	public void templateTest() {
		AbstractDisplay a1 = new CharDisplay('H');
		AbstractDisplay a2 = new StringDisplay("Hello World!");
		AbstractDisplay a3 = new StringDisplay("你好，世界!");
		a1.display();
		a2.display();
		a3.display();
	}
	
}
