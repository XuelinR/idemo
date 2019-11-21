/**
 * <p>Title:LimitSupport.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:LimitSupport</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class LimitSupport extends Support {
    private int limit;
    /**
     * @param name
     */
    public LimitSupport(String name,int limit) {
        super(name);
        // TODO Auto-generated constructor stub
        this.limit = limit;
    }

    /* (non-Javadoc)
     * <p>Title:resolve</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.chainofresponsibility.Support#resolve(com.rxl.design_pattern.chainofresponsibility.Trouble)
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
    
}
