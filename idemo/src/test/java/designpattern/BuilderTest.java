/**
 * <p>Title:BuilderTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern;

import designpattern.builder.Director;
import designpattern.builder.HTMLBuilder;
import designpattern.builder.TextBuilder;

/**
 * <p>Title:BuilderTest</p>
 * <p>Description:Builder pattern test</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class BuilderTest {
    /*@Test
    public void builderTest(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "文件编写完成。");
            
        } else {
            usage();
            System.exit(0);
        }
    }*/
    
    public static void main(String[] args) {
        System.out.println("args = " + args + ",size = "+args.length);
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "文件编写完成。");
            
        } else {
            usage();
            System.exit(0);
        }
        
    }
    public static void usage() {
        System.out.println("Usage:java Main plain      编写纯文本文档");
        System.out.println("Usage:java Main html       编写html文档");
    }
}
