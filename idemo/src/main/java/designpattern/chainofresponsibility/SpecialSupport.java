/**
 * <p>Title:SpecialSupport.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern.chainofresponsibility;

/**
 * <p>Title:SpecialSupport</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class SpecialSupport extends Support {
    private int number;
    /**
     * @param name
     */
    public SpecialSupport(String name,int number) {
        super(name);
        this.number = number;
    }

    /* (non-Javadoc)
     * <p>Title:resolve</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.chainofresponsibility.Support#resolve(com.rxl.design_pattern.chainofresponsibility.Trouble)
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }else {
            return false;
        }
    }

}
