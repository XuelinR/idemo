/**
 * <p>Title:VisitorTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.visitor.Directory;
import designpattern.visitor.File;
import designpattern.visitor.ListVisitor;



/**
 * <p>Title:VisitorTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public class VisitorTest {
    @Test
    public void visitorTest() {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.accept(new ListVisitor());
        
        System.out.println("");
        System.out.println("Making user entries...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomaura = new Directory("tomaura");
        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomaura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Comosite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomaura.add(new File("game.doc", 400));
        tomaura.add(new File("junk.doc", 500));
        rootdir.accept(new ListVisitor());
    }
}
