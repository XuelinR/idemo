/**
 * <p>Title:UnderlinePen.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 * @version 
 */
package designpattern.prototype.message;

import designpattern.prototype.framework.Product;

/**
 * <p>Title:UnderlinePen</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年8月30日
 *
 */
public class UnderlinePen implements Product {
    private char ulchar;
    /**
     * 
     * @param ulchar
     */
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    /*
     * (non-Javadoc)
     * <p>Title:use</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.prototype.framework.Product#use(java.lang.String)
     */
    public void use(String string) {
        int length = string.getBytes().length;
        System.out.println("\"" + string + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
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
