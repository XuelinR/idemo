package designpattern.singleton;

/**
 * @author XuelinR
 *  单例模式
 *  创建步骤：a、私有的静态属性；b、构造器私有化；c、对外提供公共的静态的访问方法。
 *  1、懒汉式
 */
public class Singleton {
    //私有的静态属性
	private static Singleton singleton = null;
	//构造器私有化
	private Singleton() {
	}
	
	//提供对外的公共访问方法，这里要确保在多线程访问时的安全性
	public static Singleton getSingleton() {
	    if(null == singleton) {
	        synchronized(Singleton.class){
	            if(null == singleton) {
	                singleton = new Singleton();
	            }
	        }
	    }
		return singleton;
	}
}
/**
 * 
 * <p>Title:Singleton2</p>
 * <p>Description:单例模式之饿汉式</p>
 * @author XuelinR
 * @date 2019年5月30日
 * 2、饿汉式
 */
class Singleton2 {
    //私有的静态属性，这里一开始就创建对象
    private static Singleton2 singleton = new Singleton2();
    //构造器私有化
    private Singleton2() {}
    //对外提供公共的访问方法
    public static Singleton2 getInstence() {
        return singleton;
    }
}
/**
 * <p>Title:Singleton3</p>
 * <p>Description:单例模式之饿汉式内部类</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
class Singleton3 {
    //创建私有的静态的内部类，延迟加载，确保在使用对象时加载，提高性能
    private static class SingletonHoder{
        private static Singleton3 singleton = new Singleton3();
    }
    //构造器私有化
    private Singleton3() {}
    //对外提供公共的静态的访问方法
    public static Singleton3 getInstence() {
        return SingletonHoder.singleton;
    }
}
