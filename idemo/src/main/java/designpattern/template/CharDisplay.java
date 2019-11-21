package designpattern.template;

/**
 * @author XuelinR
 *  template mode
 */
public class CharDisplay extends AbstractDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(ch);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(">>");
	}
}
