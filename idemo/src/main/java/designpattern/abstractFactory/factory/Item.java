/**
 * <p>Title:Item.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.factory;

/**
 * <p>Title:Item</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
