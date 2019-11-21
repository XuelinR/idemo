/**
 * <p>Title:StringDisplayImpl.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.Bridge;

/**
 * <p>Title:StringDisplayImpl</p>
 * <p>Description:类的实现层次结构</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;
    public StringDisplayImpl(String string) {
        // TODO Auto-generated constructor stub
        this.string = string;
        this.width = string.getBytes().length;
    }
    /* (non-Javadoc)
     * <p>Title:rawOpen</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.Bridge.DisplayImpl#rawOpen()
     */
    @Override
    public void rawOpen() {
        // TODO Auto-generated method stub
        printLine();
    }

    /* (non-Javadoc)
     * <p>Title:rawPrint</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.Bridge.DisplayImpl#rawPrint()
     */
    @Override
    public void rawPrint() {
        // TODO Auto-generated method stub
        System.out.println("|"+string+"|");
    }

    /* (non-Javadoc)
     * <p>Title:rawClose</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.Bridge.DisplayImpl#rawClose()
     */
    @Override
    public void rawClose() {
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
