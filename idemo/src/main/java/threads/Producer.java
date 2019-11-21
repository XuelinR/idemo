/**
 * <p>Title:Producer.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月30日
 * @version 
 */
package threads;

/**
 * <p>Title:Producer</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
public class Producer implements Runnable {
    private Product pt;
    
    /**
     * @param m
     */
    public Producer(Product pt) {
        super();
        this.pt = pt;
    }

    /* (non-Javadoc)
     * <p>Title:run</p>
     * <p>Description:</p>
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i%2==0) {
                pt.produce("三国演义");
            } else {
                pt.produce("西游记");
            }
        }
    }

}
