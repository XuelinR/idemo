/**
 * <p>Title:CompositeTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.composite.Directory;
import designpattern.composite.File;


/**
 * <p>Title:CompositeTest</p>
 * <p>Description:组合模式测试</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class CompositeTest {
    @Test
    public void compositeTest() {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();
            
            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("Dictionary.html", 100));
            yuki.add(new File("Compsite.java", 200));
            hanako.add(new File("memo.text", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootdir.printList();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
