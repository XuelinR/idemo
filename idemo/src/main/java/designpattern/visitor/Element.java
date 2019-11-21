/**
 * <p>Title:Element.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月6日
 * @version 
 */
package designpattern.visitor;

/**
 * <p>Title:Element</p>
 * <p>Description:接受访问者的接口</p>
 * @author XuelinR
 * @date 2018年9月6日
 *
 */
public interface Element {
    public abstract void accept(Visitor visitor);
}
