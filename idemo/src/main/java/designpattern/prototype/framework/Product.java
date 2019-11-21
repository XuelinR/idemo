package designpattern.prototype.framework;
/**
 * <p>Title:Product</p>
 * <p>Description:Prototype模式</p>
 * @author XuelinR
 * @date 2018年8月30日
 *
 */
public interface Product extends Cloneable {
    public abstract void use(String string);
    public abstract Product createClone();
}
