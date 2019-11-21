package spring;
/**
 * bean定义
 * @author admin
 *
 */
public class MyTestBean {
	/**
	 * @param testStr
	 */
	public MyTestBean(String testStr) {
		super();
		this.testStr = testStr;
	}

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
}
