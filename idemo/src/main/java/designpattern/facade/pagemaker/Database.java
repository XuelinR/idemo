/**
 * <p>Title:Database.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 * @version 
 */
package designpattern.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <p>Title:Database</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 *
 */
public class Database {
    private Database() {}
    public static Properties getProperties(String dbname) {
        String filename = "D:\\WorkSpace2018\\designPatternDemo\\src\\main\\java\\com\\rxl\\design_pattern\\facade\\" + dbname + ".txt";
        //String filename = "..\\"+dbname+".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("Warning: " + filename + " is not found.");
        }
        return properties;
    }
}
