/**
 * <p>Title:ListFactory.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.listfactory;

import designpattern.abstractFactory.factory.Factory;
import designpattern.abstractFactory.factory.Link;
import designpattern.abstractFactory.factory.Page;
import designpattern.abstractFactory.factory.Tray;

/**
 * <p>Title:ListFactory</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class ListFactory extends Factory {

    /* (non-Javadoc)
     * <p>Title:createLink</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.abstract_factory.factory.Factory#createLink(java.lang.String, java.lang.String)
     */
    @Override
    public Link createLink(String caption, String url) {
        // TODO Auto-generated method stub
        return new ListLink(caption,url);
    }

    /* (non-Javadoc)
     * <p>Title:createTray</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.abstract_factory.factory.Factory#createTray(java.lang.String)
     */
    @Override
    public Tray createTray(String caption) {
        // TODO Auto-generated method stub
        return new ListTray(caption);
    }

    /* (non-Javadoc)
     * <p>Title:createPage</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.abstract_factory.factory.Factory#createPage(java.lang.String, java.lang.String)
     */
    @Override
    public Page createPage(String title, String author) {
        // TODO Auto-generated method stub
        return new ListPage(title,author);
    }

}
