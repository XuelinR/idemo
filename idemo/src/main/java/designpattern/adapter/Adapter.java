package designpattern.adapter;
/**
 * <p>Title:Adapter</p>
 * <p>Description:适配器 1.类适配器模式（继承）2.对象适配器模式（委托）</p>
 * @author XuelinR
 * @date 2018年8月30日
 *  
 */
public class Adapter extends Banner implements Print{

	public Adapter(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}
	
}

class Banner{
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("("+string+")");
	}
	public void showWithAster() {
		System.out.println("*"+string+"*");
	}
}
