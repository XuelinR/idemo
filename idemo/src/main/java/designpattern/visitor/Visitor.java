/**
 * <p>Title:Visitor.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

/**
 * <p>Title:Visitor</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public abstract class Visitor {
    public abstract void visit(Directory directory);
    public abstract void visit(File file);
}
