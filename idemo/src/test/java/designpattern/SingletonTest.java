package designpattern;

import org.junit.Test;

import designpattern.singleton.Singleton;


public class SingletonTest {

	@Test
	public void test() {
		Singleton singleton = Singleton.getSingleton();
		System.out.println(singleton.getName()+":"+singleton.getValue());
	}
}

