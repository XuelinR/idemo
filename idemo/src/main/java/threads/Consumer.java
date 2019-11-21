/**
 * <p>Title:player.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月30日
 * @version 
 */
package threads;

/**
 * <p>Title:player</p>
 * <p>Description:生产者</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
public class Consumer implements Runnable {
    private Product pt;
    
    /**
     * @param m
     */
    public Consumer(Product pt) {
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
            pt.consume();
        }
    }

}
