/**
 * <p>Title:Printer.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 * @version 
 */
package designpattern.proxy;

/**
 * <p>Title:Printer</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月10日
 *
 */
public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("正在生成Printer的实例");
    }
    public Printer(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
        heavyJob("正在生成printer的实例（"+name+"）");
    }

    /* (non-Javadoc)
     * <p>Title:setPrinterName</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.proxy.Printable#setPrinterName(java.lang.String)
     */
    @Override
    public void setPrinterName(String name) {
        // TODO Auto-generated method stub
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
        System.out.println("=== " +name+" ====");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.print(".");
            if (i==4) {
                System.out.println(".");
            }
        }
        System.out.println("结束。");
    }
}
