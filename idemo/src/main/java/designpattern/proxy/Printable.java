/**
 * <p>Title:Printable.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 * @version 
 */
package designpattern.proxy;

/**
 * <p>Title:Printable</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 *
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
