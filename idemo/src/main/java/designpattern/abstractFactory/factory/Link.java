/**
 * <p>Title:Link.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.factory;

/**
 * <p>Title:Link</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
