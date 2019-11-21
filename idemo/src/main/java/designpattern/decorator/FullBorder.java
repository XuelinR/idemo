/**
 * <p>Title:FullBorder.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.decorator;

/**
 * <p>Title:FullBorder</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class FullBorder extends Border {

    /**
     * @param display
     */
    public FullBorder(Display display) {
        super(display);
        // TODO Auto-generated constructor stub
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
        return 1 + display.getRows() + 1;
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
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row-1) + "|";
        }
    }
    private String makeLine(char ch,int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
