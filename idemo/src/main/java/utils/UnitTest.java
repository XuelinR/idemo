/**
 * <p>Title:UnitTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年1月30日
 * @version 
 */
package utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;

import org.xml.sax.InputSource;

import rx.internal.util.unsafe.MpmcArrayQueue;

/**
 * <p>Title:UnitTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年1月30日
 * String 类不能被继承，因为String类被final修饰
 */
public class UnitTest {
    public static void main(String[] args) {
        System.out.println(parseUri("aa bb cc"));
        String web_root = System.getProperty("user.dir") + File.separator + "webapp";
        System.out.println(web_root);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(new Date());
        System.out.println(System.currentTimeMillis());
         /*char []c = {'a'};
        //0000 0001  
        //0000 0011 
        //0000 0010 ^(异或)对应位相同为0不同为1  |(或)对应位都是0为0，否则为1   &(与)对应位都是1为1，否则为0
        //System.out.println(1^3);
        int h = 0;
        String key = "aaa"; //0110 0001  0110 0001  0110 0001
        System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
        System.out.println(h);
        System.out.println(h>>>16);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null,"");
        map.put(null, "123");
        map.put(1, null);
        map.put(2,"456");
        System.out.println("map:"+map+",size:"+map.size());
       System.out.println("双亲委派机制");
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //System.out.println(System.getProperty("java.class.path"));
        FileSystemClassLoader loader = new FileSystemClassLoader("d://");
        try {
            Class<?> c = loader.loadClass("HelloWorld");
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int a = -1;
        System.out.println(a^0xff);
        */
        
       /* long l_start = System.currentTimeMillis();
        //Date startDate = new Date(l_start);
        System.out.println(l_start);
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l_end = System.currentTimeMillis();
        //Date endDate = new Date(l_end);
        System.out.println(l_end);
        double times = (l_end - l_start)/1000.00;
        System.out.println("耗时："+times+"秒！");*/
        
        
        /*Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            
            @Override
            public void run() {
                System.out.println("I am a task!");
            }
        }, new Date(System.currentTimeMillis()+1000),1000);
        
        TestThread tt = new TestThread();
        Thread proxy = new Thread(tt);
        proxy.start();*/
        /*Animal ad = new D og();
        Dog d = new Dog();
        ad = (Dog)ad;
        System.out.println(ad == d);
        System.out.println(ad.equals(d));
        
        
        //System.out.println(d instanceof Object);
        Object o = new Object();
        byte b = '_'+' ';//-128~127
        short s = -32768;//-32768~32767
        char c1 = 'a';
        char c2 = 'a';
        int i = '2';
        long l = '@';
        float f = ' ';
        double d = '1';
        boolean bb = true;
        System.out.println(c1 == c2);//true
        String a1 = "1122";
        String a2 = new String("1122");
        System.out.println(a1 == a2);//false
        System.out.println(a1.equals(a2));//true
        */
    }
    
    private static String parseUri(String requsetString) {
        int index1, index2;
        index1 = requsetString.indexOf(' ');
        if (index1 != -1) {
            index2 = requsetString.indexOf(' ', index1 + 1);
            if (index2 > index1) {
                return requsetString.substring(index1 + 1, index2);
            }
        }
        return null;
    }
}

class Animal {
    /**
     * 
     */
    public Animal() {
        System.out.println("构造器");
    }
    public String type;
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    public String test(int key) {
        switch (key) {
        case 1:
            System.out.println(key);
            break;

        default:
            break;
        }
        return ""+key;
    }
}

class Dog extends Animal {
    public void eat() {
        super.test(1);
        System.out.println("dog eat bond");
    }
}
/**
 * <p>Title:TestThread</p>
 * <p>Description:实现接口Runnable</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
class TestThread implements Runnable {

    /* (non-Javadoc)
     * <p>Title:run</p>
     * <p>Description:</p>
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        System.out.println("我是线程体。");
    }
    
}
/**
 * <p>Title:MyThread</p>
 * <p>Description:实现Callable接口，有返回值</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
class MyThread implements Callable<String>{
    /* (non-Javadoc)
     * <p>Title:call</p>
     * <p>Description:</p>
     * @see java.util.concurrent.Callable#call()
     */
    @Override
    public String call() throws Exception {
        System.out.println("我是线程体。");
        return null;
    }
 
}

class FileSystemClassLoader extends ClassLoader{
    private String rootDir;

    /**
     * @param rootDir
     */
    public FileSystemClassLoader(String rootDir) {
        super();
        this.rootDir = rootDir;
    }
    /* (non-Javadoc)
     * <p>Title:findClass</p>
     * <p>Description:</p>
     * @see java.lang.ClassLoader#findClass(java.lang.String)
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);
        if (c!=null) {
            return c;
        } else {
          ClassLoader parent = this.getParent();
          try {
            c = parent.loadClass(name);
          } catch (Exception e) {
            e.printStackTrace();
          }
          if (c!=null) {
              return c;
          } else {
              byte[] classData = getClassData(name);
              if (classData==null) {
                throw new ClassNotFoundException();
              } else {
                c = defineClass(name, classData, 0,classData.length);
              }
          }
        }
        return super.findClass(name);
    }
    private byte[] getClassData(String className) {
        String path = rootDir + "/" + className.replace('.', '/') + ".class";
        path = "HelloWorld.class";
        InputStream is = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            is = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int temp = 0;
            while((temp=is.read(buffer))!=-1) {
                baos.write(buffer,0,temp);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return null;
    }
}


interface A{
    public void  aa();
    public String bb();
    
}
//接口可以继承接口
interface B extends A {
    C c = new C() {
        
        @Override
        public String bb() {
            // TODO Auto-generated method stub
            return null;
        }
    };
}
//抽象类可以实现接口
abstract class  C implements A {
    /* (non-Javadoc)
     * <p>Title:aa</p>
     * <p>Description:</p>
     * @see utils.A#aa()
     */
    @Override
    public void aa() {
        
    }
}
/**
 * 
 * <p>Title:D</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 * 如果一个类中有抽象方法，那么这个类一定是抽象类，但抽象类中不一定有抽象方法
 */
 abstract class D extends C {
     void dd() {};
}
//抽象类只能被继承，从而重写其中的方法
class E extends D {
    /* (non-Javadoc)
     * <p>Title:dd</p>
     * <p>Description:</p>
     * @see utils.D#dd()
     */
    @Override
    void dd() {
        // TODO Auto-generated method stub
        super.dd();
    }

    /* (non-Javadoc)
     * <p>Title:bb</p>
     * <p>Description:</p>
     * @see utils.A#bb()
     */
    @Override
    public String bb() {
        // TODO Auto-generated method stub
        return null;
    }
}