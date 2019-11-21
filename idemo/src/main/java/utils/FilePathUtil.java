/**
 * <p>Title:FilePathUtil.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 * @version 
 */
package utils;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>Title:FilePathUtil</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 *
 */
public class FilePathUtil {

    /**
     * <p>Title:getFilePath</p>
     * <p>Description:</p>
     * @return
     */
    public URL getFileUrl(String name) {
        return this.getClass().getResource(name);
    }
    /**
     * 
     */
    public String getFilePath(String name) {
        return this.getFileUrl(name).getPath();
    }
    
    public static void main(String[] args) {
       // Arrays.asList("a","b","c","d","e").forEach(x -> System.out.println(x));
        //Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
