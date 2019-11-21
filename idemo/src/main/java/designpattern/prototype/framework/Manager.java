package designpattern.prototype.framework;

import java.util.HashMap;
/**
 * <p>Title:Manager</p>
 * <p>Description:Prototype 模式</p>
 * @author XuelinR
 * @date 2018年8月30日
 *
 */
public class Manager {
    private HashMap<String,Product> showcase = new HashMap<>();
    public void register(String name,Product product) {
        showcase.put(name, product);
    }
    public Product create(String productName) {
        Product product = (Product)showcase.get(productName);
        return product.createClone();
    }
}
