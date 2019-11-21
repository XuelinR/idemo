/**
 * <p>Title:AbstractFactoryTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern;

import designpattern.abstractFactory.factory.Factory;
import designpattern.abstractFactory.factory.Link;
import designpattern.abstractFactory.factory.Page;
import designpattern.abstractFactory.factory.Tray;

/**
 * <p>Title:AbstractFactoryTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage:java Main class.name.of.ConctrateFactory");
            System.out.println("Example 1:java Main listfactory.ListFactory");
            System.out.println("Example 2:java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");
        
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        
        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);
        Tray trayahoo = factory.createTray("Yahoo!");
        trayahoo.add(us_yahoo);
        trayahoo.add(jp_yahoo);
        Tray trayserch = factory.createTray("检索引擎");
        trayserch.add(trayahoo);
        trayserch.add(excite);
        trayserch.add(google);
        
        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(trayserch);
        page.output();
    }
}
