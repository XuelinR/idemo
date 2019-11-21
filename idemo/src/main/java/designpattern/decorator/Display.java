/**
 * <p>Title:Display.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.decorator;

/**
 * <p>Title:Display</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);//获取第row行的字符串
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
