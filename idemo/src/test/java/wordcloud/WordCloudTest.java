/**
 * <p>Title:WordCloudTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 * @version 
 */
package wordcloud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Dimension;
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.junit.Test;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.RectangleBackground;

/**
 * <p>Title:WordCloudTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 *
 */
public class WordCloudTest {

    public static final List<WordFrequency> WORD_FREQUENCIES = Arrays.asList(new WordFrequency("apple", 22), 
            new WordFrequency("baby", 3), 
            new WordFrequency("back", 15), 
            new WordFrequency("bear", 9), 
            new WordFrequency("boy", 26)); 
    
    @Test 
    public void testWriteToStreamAsPNG() throws Exception { 
    
        final WordCloud wordCloud = new WordCloud(new Dimension(200,200), CollisionMode.PIXEL_PERFECT); 
        wordCloud.build(WORD_FREQUENCIES); 
        wordCloud.setPadding(2); 
        wordCloud.setBackground(new RectangleBackground(new Point(100, 100), new Dimension(200,200))); 
        
        
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); 
        wordCloud.writeToStreamAsPNG(byteArrayOutputStream); 
        
        final byte[] bytes = byteArrayOutputStream.toByteArray(); 
        assertNotEquals(0, bytes.length); 
        
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes); 
        final ImageInputStream imageInputStream = ImageIO.createImageInputStream(byteArrayInputStream); 
        final Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(imageInputStream); 
        assertTrue(imageReaders.hasNext()); 
        final ImageReader imageReader = imageReaders.next(); 
        assertEquals("png", imageReader.getFormatName()); 
    } 
}
