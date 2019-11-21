/**
 * <p>Title:File.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

/**
 * <p>Title:File</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public class File extends Entry {
    private String name;
    private int size;
    /**
     * 
     */
    public File(String name,int size) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.size = size;
    }

    /* (non-Javadoc)
     * <p>Title:accept</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.visitor.Element#accept(com.rxl.design_pattern.visitor.Visitor)
     */
    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }

    /* (non-Javadoc)
     * <p>Title:getName</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.visitor.Entry#getName()
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /* (non-Javadoc)
     * <p>Title:getSize</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.visitor.Entry#getSize()
     */
    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return size;
    }

}
