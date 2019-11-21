/**
 * <p>Title:File.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.composite;

/**
 * <p>Title:File</p>
 * <p>Description:表示文件的类，创建一个传入名称及大小的文件</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class File extends Entry {
    private String name;
    private int size;
    public File(String name,int size) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.size = size;
    }

    /* (non-Javadoc)
     * <p>Title:getName</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.composite.Entry#getName()
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /* (non-Javadoc)
     * <p>Title:getSize</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.composite.Entry#getSize()
     */
    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return size;
    }

    /* (non-Javadoc)
     * <p>Title:printList</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.composite.Entry#printList(java.lang.String)
     */
    @Override
    protected void printList(String prefix) {
        // TODO Auto-generated method stub
        System.out.println(prefix + "/" +this);
    }

}
