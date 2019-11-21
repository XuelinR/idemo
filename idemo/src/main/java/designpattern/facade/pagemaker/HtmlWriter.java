/**
 * <p>Title:HtmlWriter.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 * @version 
 */
package designpattern.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * <p>Title:HtmlWriter</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 *
 */
public class HtmlWriter {
    private Writer writer;
    /**
     * 
     */
    public HtmlWriter(Writer writer) {
        // TODO Auto-generated constructor stub
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>"+title+"</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>"+title+"</h1>\n");
        
    }
    public void paragraph(String msg) throws IOException {
        writer.write("<p>"+msg+"</p>\n");
    }
    public void link(String href,String caption) throws IOException {
        paragraph("<a href=\""+href+"\">"+caption+"</a>");
    }
    public void mailto(String mailaddr,String username) throws IOException {
        link("mailto:"+mailaddr, username);
    }
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
