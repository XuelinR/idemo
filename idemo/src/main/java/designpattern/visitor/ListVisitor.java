/**
 * <p>Title:ListVisitor.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

import java.util.Iterator;

/**
 * <p>Title:ListVisitor</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";

    /* (non-Javadoc)
     * <p>Title:visit</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.visitor.Visitor#visit(com.rxl.design_pattern.visitor.Directory)
     */
    @Override
    public void visit(Directory directory) {
        // TODO Auto-generated method stub
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<?> iterator = directory.iterator();
        while(iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }

    /* (non-Javadoc)
     * <p>Title:visit</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.visitor.Visitor#visit(com.rxl.design_pattern.visitor.File)
     */
    @Override
    public void visit(File file) {
        // TODO Auto-generated method stub
        System.out.println(currentdir + "/" + file);
    }

}
