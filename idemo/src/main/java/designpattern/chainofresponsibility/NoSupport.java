/**
 * <p>Title:NoSupport.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:NoSupport</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class NoSupport extends Support {

    /**
     * @param name
     */
    public NoSupport(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * <p>Title:resolve</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.chainofresponsibility.Support#resolve(com.rxl.design_pattern.chainofresponsibility.Trouble)
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        // TODO Auto-generated method stub
        return false;
    }

}
