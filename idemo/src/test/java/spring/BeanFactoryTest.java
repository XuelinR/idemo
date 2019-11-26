package spring;

import static org.junit.Assert.assertEquals;

import javax.swing.plaf.basic.DefaultMenuLayout;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	
	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		MyTestBean bean = bf.getBean("myTestBean",MyTestBean.class);
		assertEquals("testStr", bean.getTestStr());
		System.out.println("Bean:"+bean);
		
	}
	
	@Test
	public void testApplication() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyTestBean bean = context.getBean("myTestBean",MyTestBean.class);
		Car cbean = context.getBean("car", Car.class);
		System.out.println("Bean:"+bean);
		System.out.println("cBean:"+cbean);
	}
	
	@Test
	public void testWebApplication() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions("spring-config.xml");
		MyTestBean bean = factory.getBean(MyTestBean.class);
		Car cbean = factory.getBean(Car.class);
		cbean.setColor("red");
		cbean.setRun("runner");
		System.out.println(bean);
		System.out.println(cbean.toString());
	}
	
	@Test
	public void testSpringReplacer() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions("spring-config.xml");
		Car car = factory.getBean(Car.class);
		System.out.println(car);
		MyTestBean bean = factory.getBean(MyTestBean.class);
		System.out.println(bean);
	}
}
