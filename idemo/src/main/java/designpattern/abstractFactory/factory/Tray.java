/**
 * <p>Title:Tray.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.abstractFactory.factory;

import java.util.ArrayList;

/**
 * <p>Title:Tray</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> trArrayList = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        trArrayList.add(item);
    }
}
