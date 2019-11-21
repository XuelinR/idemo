/**
 * <p>Title:Strategy.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.strategy;

/**
 * <p>Title:Strategy</p>
 * <p>Description:定义猜拳策略的抽象方法的接口。</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public interface Strategy {
    public abstract Hand nextHand();//获取下一局要出的手势
    public abstract void study(boolean win);//学习上一局的手势是否获胜了
}
