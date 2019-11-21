/**
 * <p>Title:IOUtils.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月5日
 * @version 
 */
package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <p>Title:IOUtils</p>
 * <p>Description:输入输出流</p>
 * @author XuelinR
 * @date 2019年6月5日
 *
 */
public class IOUtils {

    /**
     * <p>Title:main</p>
     * <p>Description:</p>
     * @param args
     */
    public static void main(String[] args) {
        //copyFile();
        //new File("C:\\Users\\admin\\Desktop\\work_record.docx").delete();
        
        File f = new File("C:\\Users\\admin\\Desktop\\誉萃人员表账号代码.xlsx");
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(f);
            os = new FileOutputStream(f);//第二个参数为true时表示追加写入文件，默认为false
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=is.read(bytes))!=-1) {
                System.out.println("======================");
                System.out.println(new String(bytes,0,len));
            }
            //byte[] b = {'H','e','l','l','o','W','o','l','d','!'};
            //String str = "字节流操作，用对应的实现类去向文件写入自定义或读取的内容。";
            //byte[] data = str.getBytes();
            //os.write(bytes);
            //os.flush();
            System.out.println("写入文件成功！");
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (null!=os) {
                    os.close();
                }
                if (is!=null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        System.out.println(f.getAbsolutePath());
//        System.out.println(File.pathSeparator);//路径分隔符
//        System.out.println(File.separator);
    }
    /**
     * <p>Title:copyFile</p>
     * <p>Description:拷贝文件</p>
     */
    private static void copyFile() {
        
        File file = new File("C:\\Users\\admin\\Desktop\\工作备忘录.txt");
        File out = new File("C:\\Users\\admin\\Desktop\\work_record.txt");
        
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(out);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=is.read(bytes))!=-1){
                os.write(bytes, 0, len);
            }
            os.flush();
            System.out.println("拷贝成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is!=null) {
                    is.close();
                }
                if (os!=null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
