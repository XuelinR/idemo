package designpattern;

import org.junit.Test;

import designpattern.adapter.Adapter;
import designpattern.adapter.Print;


public class AdapterTest {
	@Test
	public void adapterTest() {
		Print p = new Adapter("Hello");
		p.printWeak();
		p.printStrong();
	}
}
