/**
 * <p>Title:PrinterProxy.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 * @version 
 */
package designpattern.proxy;

/**
 * <p>Title:PrinterProxy</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 *
 */
public class PrinterProxy implements Printable{
    private String name;
    private Printer real;
    public PrinterProxy() {}
    /**
     * 
     */
    public PrinterProxy(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    

    /* (non-Javadoc)
     * <p>Title:setPrinterName</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.proxy.Printable#setPrinterName(java.lang.String)
     */
    @Override
    public synchronized void setPrinterName(String name) {
        // TODO Auto-generated method stub
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    /* (non-Javadoc)
     * <p>Title:getPrinterName</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.proxy.Printable#getPrinterName()
     */
    @Override
    public String getPrinterName() {
        // TODO Auto-generated method stub
        return name;
    }

    /* (non-Javadoc)
     * <p>Title:print</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.proxy.Printable#print(java.lang.String)
     */
    @Override
    public void print(String string) {
        // TODO Auto-generated method stub
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
