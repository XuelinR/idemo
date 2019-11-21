/**
 * <p>Title:Directory.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>Title:Directory</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();
    public  Directory(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
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
        int size = 0;
        Iterator<?> iterator = directory.iterator();
        while(iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            size += entry.getSize();
        }
        return size;
    }
    
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
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
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" + name); 
        }
    }

}
