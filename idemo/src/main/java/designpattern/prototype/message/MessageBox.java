/**
 * <p>Title:MessageBox.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 * @version 
 */
package designpattern.prototype.message;

import designpattern.prototype.framework.Product;

/**
 * <p>Title:MessageBox</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 *
 */
public class MessageBox implements Product {
    private char decochar;
    /**
     * @param decochar
     */
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    /*
     * (non-Javadoc)
     * <p>Title:use</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.prototype.framework.Product#use(java.lang.String)
     */
    public void use(String string) {
        int length = string.getBytes().length;
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + string + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    /*
     * (non-Javadoc)
     * <p>Title:createClone</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.prototype.framework.Product#createClone()
     */
    public Product createClone() {
        Product product = null;
        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return product;
    }
}
