package designpattern.template;

/**
 * @author XuelinR
 *  template mode
 */
public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		this.width = string.getBytes().length;
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
