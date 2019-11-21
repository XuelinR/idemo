/**
 * <p>Title:SideBorder.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.decorator;

/**
 * <p>Title:SideBorder</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class SideBorder extends Border {
    private char borderChar;//表示装饰边框的字符
    /**
     * @param display
     */
    public SideBorder(Display display,char ch) {
        super(display);
        // TODO Auto-generated constructor stub
        this.borderChar = ch;
    }
    /* (non-Javadoc)
     * <p>Title:getColumns</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.decorator.Display#getColumns()
     */
    @Override
    public int getColumns() {
        // TODO Auto-generated method stub
        return 1 + display.getColumns() + 1;
    }
    /* (non-Javadoc)
     * <p>Title:getRows</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.decorator.Display#getRows()
     */
    @Override
    public int getRows() {
        // TODO Auto-generated method stub
        return display.getRows();
    }
    /* (non-Javadoc)
     * <p>Title:getRowText</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.decorator.Display#getRowText(int)
     */
    @Override
    public String getRowText(int row) {
        // TODO Auto-generated method stub
        return borderChar + display.getRowText(row) + borderChar;
    }

}
