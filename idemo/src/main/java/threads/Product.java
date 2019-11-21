/**
 * <p>Title:Movie.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月30日
 * @version 
 */
package threads;

/**
 * <p>Title:Movie</p>
 * <p>Description:模拟播放、观看场景</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
public class Product {
    private String pic;
    //
    private boolean flag = true;
    /**
     * <p>Title:play</p>
     * <p>Description:播放</p>
     * @param pic
     */
    public synchronized void produce(String pic){
        //Producer
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //begin product
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.pic = pic;
        System.out.println("produce:"+pic);
        //over produce
        this.notify();
        //stop produce
        this.flag = false;
    }
    /**
     * <p>Title:watch</p>
     * <p>Description:观看</p>
     */
    public synchronized void consume() {
        //Consumer
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("consume:"+pic);
        //over consume
        this.notify();
        //stop consume
        this.flag = true;
    }
    
    public static void main(String[] args) {
        Product pt = new Product();
        Producer pd = new Producer(pt);
        Consumer cs = new Consumer(pt);
        new Thread(pd).start();
        new Thread(cs).start();
    }
}
