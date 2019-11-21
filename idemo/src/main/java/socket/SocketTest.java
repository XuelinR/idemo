/**
 * <p>Title:SocketTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 * @version 
 */
package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * <p>Title:SocketTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 *
 */
public class SocketTest {

    /**
     * <p>Title:main</p>
     * <p>Description:</p>
     * @param args
     */
    public static void main(String[] args) {
        download();
        try {
            InetAddress address = InetAddress.getLocalHost();
            String name = address.getHostName();
            String ip = address.getHostAddress();
            System.out.println(name);
            System.out.println(ip);
            System.out.println("***********************************");
            InetAddress address2 = InetAddress.getByName("10.104.11.37");
            System.out.println(address2.getHostName());
            InetSocketAddress isAddress = new InetSocketAddress("127.0.0.1", 9999);
            System.out.println(isAddress.getHostName());
            System.out.println("***********************************");
            
            URL url = new URL("http://www.baidu.com:80/index.html#bb?uname=xiaownag");
            String ptl = url.getProtocol();
            System.out.println("协议："+ptl);
            System.out.println("域名："+url.getHost());
            System.out.println("端口："+url.getPort());
            System.out.println("相对路径："+url.getPath());
            System.out.println("资源："+url.getFile());
            System.out.println("锚点："+url.getRef());
            System.out.println("查询："+url.getQuery());
            System.out.println(url.getUserInfo());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        
        
    }

    /**
     * <p>Title:downloa</p>
     * <p>Description:</p>
     */
    private static void download() {
        File out = new File("C:\\Users\\admin\\Desktop\\work_record.html");
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        OutputStream os = null;
        try {
            URL url = new URL("http://www.baidu.com");
            is = url.openStream();
            isr = new InputStreamReader(is,"utf-8");
            br = new BufferedReader(isr);
            os = new FileOutputStream(out);
            bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
            /*byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=is.read(bytes))!=-1) {
                os.write(bytes, 0, len);
            }
            os.flush();
            */
            String msg = null;
            while ((msg=br.readLine())!=null) {
                bw.append(msg);
                bw.newLine();
            }
            bw.flush();
            System.out.println("**********下载成功！******************");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br!=null) {
                    br.close();
                }
                if (isr!=null) {
                    isr.close();
                }
                if (is!=null) {
                    is.close();
                }
                if (os!=null) {
                    os.close();
                }
                if (bw!=null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
