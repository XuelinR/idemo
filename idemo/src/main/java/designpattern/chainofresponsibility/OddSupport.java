/**
 * <p>Title:OddSupport.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:OddSupport</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class OddSupport extends Support {

    /**
     * @param name
     */
    public OddSupport(String name) {
        super(name);
    }

    /* (non-Javadoc)
     * <p>Title:resolve</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.chainofresponsibility.Support#resolve(com.rxl.design_pattern.chainofresponsibility.Trouble)
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }else {
            return false;
        }
    }

}
