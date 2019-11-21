/**
 * <p>Title:HTMLBuilder.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>Title:HTMLBuilder</p>
 * <p>Description:用于编写html文档</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;
    
    /* (non-Javadoc)
     * <p>Title:makeTitle</p>
     * <p>Description:HTML文档标题</p>
     * @see com.rxl.design_pattern.builder.Builder#makeTitle(java.lang.String)
     */
    @Override
    public void makeTitle(String title) {
        // TODO Auto-generated method stub
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    /* (non-Javadoc)
     * <p>Title:makeString</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.builder.Builder#makeString(java.lang.String)
     */
    @Override
    public void makeString(String str) {
        // TODO Auto-generated method stub
        writer.append("<p>" +str+ "</p>");
    }

    /* (non-Javadoc)
     * <p>Title:makeTitem</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.builder.Builder#makeTitem(java.lang.String[])
     */
    @Override
    public void makeTitem(String[] items) {
        // TODO Auto-generated method stub
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    /* (non-Javadoc)
     * <p>Title:close</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.builder.Builder#close()
     */
    @Override
    public void close() {
        // TODO Auto-generated method stub
        writer.println("</body></html>");
        writer.close();
    }
    public String getResult() {
        return fileName;
    }
}
