/**
 * <p>Title:ListTray.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.listfactory;

import java.util.Iterator;

import designpattern.abstractFactory.factory.Item;
import designpattern.abstractFactory.factory.Tray;


/**
 * <p>Title:ListTray</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class ListTray extends Tray {

    /**
     * @param caption
     */
    public ListTray(String caption) {
        super(caption);
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
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption +"\n");
        buffer.append("<ul>\n");
        Iterator<?> iterator = trArrayList.iterator();
        while (iterator.hasNext()) {
            Item item = (Item)iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

}
