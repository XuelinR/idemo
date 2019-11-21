/**
 * <p>Title:Border.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.decorator;

/**
 * <p>Title:Border</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public abstract class Border extends Display {
    protected Display display;//表示被装饰物
    protected Border(Display display) {//在生成实例时通过参数指定被装饰物
        this.display = display;
    }
}
