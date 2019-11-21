/**
 * <p>Title:Display.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.Bridge;

/**
 * <p>Title:Display</p>
 * <p>Description:抽象的，负责显示一些东西。该类位于“类的功能层次结构”的最上层</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {
        open();
        print();
        close();
    }
}
