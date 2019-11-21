package designpattern.factory.framework;

/**
 * @author XuelinR
 *	Factory Method 工厂抽象类,此处使用了template method 模式
 */
public abstract class Factory {
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
}
