/**
 * 
 */
package spring;

/**
 * @author admin
 *
 */
public class Car {
	
	private String color;
	
	private String run;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "color=" + color + ",run=" + run;
	}
	/**
	 * 
	 */
	public void changeMe() {
		System.out.println("test spring replace");
	}
}
