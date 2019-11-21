/**
 * <p>Title:Server.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 * @version 
 */
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>Title:Server</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月6日
 *
 */
public class Server {
    /**
     * <p>Title:createServer</p>
     * <p>Description:</p>
     * @throws IOException 
     */
    private static void createServer(int port) throws IOException {
        
        System.out.println("************************服务端服务已启动*****************************");
        //创建服务端
        DatagramSocket server = new DatagramSocket(port);
        //准备接收容器
        byte[] container = new byte[1024];
        
        DatagramPacket packet = new DatagramPacket(container, container.length);
        int len = packet.getLength();
        while (len>0) {
            server.receive(packet);
            byte[] data = packet.getData();
            System.out.println(new String(data,0,len));
        }
        
        //server.close();
        
    }
    
   public static void main(String[] args) {
       try {
        createServer(8800);
        ServerSocket server = new ServerSocket(8888);
        Socket s = server.accept();//阻塞式接受
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
