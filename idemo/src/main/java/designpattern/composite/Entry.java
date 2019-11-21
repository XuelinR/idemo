/**
 * <p>Title:Entry.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.composite;

/**
 * <p>Title:Entry</p>
 * <p>Description:组合模式，目录条目的抽象类</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString() {
       return getName() + " (" +getSize() + ")";
    }
}
