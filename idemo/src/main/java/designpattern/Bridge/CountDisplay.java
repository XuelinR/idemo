/**
 * <p>Title:CountDisplay.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.Bridge;

/**
 * <p>Title:CountDisplay</p>
 * <p>Description:在Display基础上新增功能，使其具有“只显示规定的次数”功能</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class CountDisplay extends Display {

    /**
     * @param impl
     */
    public CountDisplay(DisplayImpl impl) {
        super(impl);
        // TODO Auto-generated constructor stub
    }
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
