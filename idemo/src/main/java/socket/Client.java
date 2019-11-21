/**
 * <p>Title:Client.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 * @version 
 */
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * <p>Title:Client</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 *
 */
public class Client {
    /**
     * <p>Title:createServer</p>
     * <p>Description:</p>
     * @throws IOException 
     */
    private static DatagramSocket createServer() throws IOException {
        System.out.println("**********************客户端服务已启动 **************************************");
        // 创建服务端
        DatagramSocket cserver = new DatagramSocket(8888);

        //cserver.close();
        return cserver;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            DatagramSocket cserver = new DatagramSocket(8888);
            System.out.println("请输入：");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String read = scanner.nextLine();
                byte[] data = read.getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8800));
                cserver.send(packet);
                System.out.println("客户端输入："+read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
