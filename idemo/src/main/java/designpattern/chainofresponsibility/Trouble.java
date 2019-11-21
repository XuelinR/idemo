/**
 * <p>Title:Trouble.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:Trouble</p>
 * <p>Description:表示发生问题的类</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class Trouble {
    private int number;
    /**
     * 构造函数
     */
    public Trouble(int number) {
        // TODO Auto-generated constructor stub
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[Trouble:"+ number +"]";
    }
}
