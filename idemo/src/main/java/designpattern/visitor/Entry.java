/**
 * <p>Title:Entry.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

import java.util.Iterator;

/**
 * <p>Title:Entry</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public Iterator<?> iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString() {
        return getName() + "(" + getSize() + ")"; 
    }
}
