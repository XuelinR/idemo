/**
 * <p>Title:StringDisplay.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.decorator;

/**
 * <p>Title:StringDisplay</p>
 * <p>Description:用于显示单行字符串的类</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string) {
        // TODO Auto-generated constructor stub
        this.string = string;
    }

    /* (non-Javadoc)
     * <p>Title:getColumns</p>
     * <p>Description:得到字符数</p>
     * @see com.rxl.design_pattern.decorator.Display#getColumns()
     */
    @Override
    public int getColumns() {
        // TODO Auto-generated method stub
        return string.getBytes().length;
    }

    /* (non-Javadoc)
     * <p>Title:getRows</p>
     * <p>Description:行数</p>
     * @see com.rxl.design_pattern.decorator.Display#getRows()
     */
    @Override
    public int getRows() {
        // TODO Auto-generated method stub
        return 1;
    }

    /* (non-Javadoc)
     * <p>Title:getRowText</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.decorator.Display#getRowText(int)
     */
    @Override
    public String getRowText(int row) {
        // TODO Auto-generated method stub
        if (row == 0) {
            return string;
        }else {
            return null;
        }
    }

}
