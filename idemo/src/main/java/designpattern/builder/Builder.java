/**
 * <p>Title:Builder.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.builder;

/**
 * <p>Title:Builder</p>
 * <p>Description:Builder pattern 此类是一个声明了编写文档的方法的抽象类。
 * makeTitle、makeString、makeItems方法分别是编写标题、字符串、条目的方法。
 * close方法是完成文档编写的方法。
 * </p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeTitem(String[] items);
    public abstract void close();
}
