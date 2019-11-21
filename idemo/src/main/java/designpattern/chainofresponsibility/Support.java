/**
 * <p>Title:Support.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:Support</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public abstract class Support {
    private String name;//解决问题的实例
    private Support next;//要推卸给的对象
    /**
     * 
     */
    public Support(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resoled by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
}
