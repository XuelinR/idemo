/**
 * <p>Title:CreateThreads.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月29日
 * @version 
 */
package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * <p>Title:CreateThreads</p>
 * <p>Description:线程的实现方式</p>
 * @author XuelinR
 * @date 2019年5月29日
 *
 */
public class CreateThreads {
    //valatile 保证变量的可见性
    private static volatile boolean stopRep;
   
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread mt = new MyThread();
        mt.start();
        //createThreadMethod1();
        //createThreadMethod2();
        //创建线程
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("千年乌龟",1000);
        Race rabbit = new Race("小兔子",500);
        //获取值
        Future<Integer> r1 = executor.submit(tortoise);
        Future<Integer> r2 = executor.submit(rabbit);
        Thread.sleep(2000);
        tortoise.setFlag(false);
        rabbit.setFlag(false);
        int num1 = r1.get();
        int num2 = r2.get();
        System.out.println("千年乌龟跑了<"+num1+">步");
        System.out.println("小兔子跑了<"+num2+">步");
        executor.shutdown();
    }
    private static void createThreadMethod1() throws InterruptedException {
        System.out.println("1"+stopRep);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("**************");
                int i = 0;
                while(!stopRep) {
                    System.out.print(i);
                    if(i%2==0) {
                        System.out.println();
                    }
                    i++;
                }
            }
        });
        t.start();
        TimeUnit.SECONDS.sleep(1);
        stopRep = true;
        System.out.println("2"+stopRep);
    }
    private static void createThreadMethod2() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("************************");
                }
            }
        };
        executor.execute(runnable);
        executor.shutdown();
    }
}
/**
 * <p>Title:Race</p>
 * <p>Description:比赛类</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
class Race implements Callable<Integer>{
    private String name;//名称
    private long time;//用时
    private Boolean flag = true;//控制循环
    private int step = 0;//步数
    public Race() {
    }

    /**
     * @param name
     */
    public Race(String name) {
        super();
        this.name = name;
    }

    /**
     * @param name
     * @param time
     */
    public Race(String name, long time) {
        super();
        this.name = name;
        this.time = time;
    }

    /* (non-Javadoc)
     * <p>Title:call</p>
     * <p>Description:线程体，步数递增</p>
     * @see java.util.concurrent.Callable#call()
     */
    @Override
    public Integer call() throws Exception {
        while (flag) {
           Thread.sleep(time);
           step++;
        }
        return step;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * @return the flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * @return the step
     */
    public int getStep() {
        return step;
    }

    /**
     * @param step the step to set
     */
    public void setStep(int step) {
        this.step = step;
    }
    
    
}
/**
 * <p>Title:MyThread</p>
 * <p>Description:创建线程之继承</p>
 * @author XuelinR
 * @date 2019年5月30日
 *
 */
class MyThread extends Thread {
    /* (non-Javadoc)
     * <p>Title:run</p>
     * <p>Description:</p>
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        System.out.println("我是线程体。");
    }
}
