/**
 * <p>Title:ListLink.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.listfactory;

import designpattern.abstractFactory.factory.Link;

/**
 * <p>Title:ListLink</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class ListLink extends Link {

    /**
     * @param caption
     * @param url
     */
    public ListLink(String caption, String url) {
        super(caption, url);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * <p>Title:makeHTML</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.abstract_factory.factory.Item#makeHTML()
     */
    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        return " <li><a href=\"" +url+ "\">"+caption+"</a></li>\n";
    }

}
