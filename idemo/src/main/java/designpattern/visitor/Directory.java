/**
 * <p>Title:Direcotory.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>Title:Direcotory</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();
    /**
     * 
     */
    public Directory(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
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
        int size = 0;
        Iterator<?> iterator = dir.iterator();
        while(iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            size += entry.getSize();
        }
        return size;
    }
    
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }
    
    public Iterator<?> iterator(){
        return dir.iterator();
    }
}
