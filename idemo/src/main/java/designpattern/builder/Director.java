/**
 * <p>Title:Director.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.builder;


/**
 * <p>Title:Director</p>
 * <p>Description:编写文档</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeTitem(new String[] {"早上好","下午好"});
        builder.makeString("晚上");
        builder.makeTitem(new String[] {"晚上好","晚安","再见"});
        builder.close();
    }
}
