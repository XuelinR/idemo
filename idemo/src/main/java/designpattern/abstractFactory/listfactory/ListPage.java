/**
 * <p>Title:ListPage.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.listfactory;

import java.util.Iterator;

import designpattern.abstractFactory.factory.Item;
import designpattern.abstractFactory.factory.Page;


/**
 * <p>Title:ListPage</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class ListPage extends Page {

    /**
     * @param title
     * @param author
     */
    public ListPage(String title, String author) {
        super(title, author);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * <p>Title:makeHTML</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.abstract_factory.factory.Page#makeHTML()
     */
    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator<?> iterator = content.iterator();
        while(iterator.hasNext()) {
           Item item = (Item)iterator.next(); 
           buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address></address>\n");
        buffer.append("</body></html>\n");
        
        return buffer.toString();
    }

}
