/**
 * <p>Title:QRCodeTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 * @version 
 */
package QRCode;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

/**
 * <p>Title:QRCodeTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 *
 */
public class QRCodeTest {

    /**
     * <p>Title:setUp</p>
     * <p>Description:</p>
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * <p>Title:tearDown</p>
     * <p>Description:</p>
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMatrixToImageWriter() {
        try {
            String contents = "https://pan.baidu.com/s/1-KoaRqyOVUCEkf5-R-J9kQ";
            int width = 300;
            int height = 300;
            Hashtable<EncodeHintType, String> hints = new Hashtable<>();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height,hints);
            //String format = "gif";
            //File outputFile = new File("d:"+File.separator+"QRCode.gif");
            //MatrixToImageWriter.writeToFile(matrix, format, outputFile);
            
            BufferedImage image = MatrixToImageWriter.toBufferedImage(matrix);
            System.out.println(image);
            JLabel label = new JLabel(new ImageIcon(image));
            
            JFrame frame = new JFrame("二维码");
            frame.setSize(400, 400); 
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (Exception e) {
            fail("Not yet implemented");
        }
    }

}
