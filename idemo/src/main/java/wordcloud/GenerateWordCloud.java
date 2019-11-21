/**
 * <p>Title:GenerateWordCloud.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 * @version 
 */
package wordcloud;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.nlp.tokenizers.ChineseWordTokenizer;
import com.kennycason.kumo.palette.ColorPalette;

import utils.ColorPaletteUtil;

/**
 * <p>Title:GenerateWordCloud</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 *
 */
public class GenerateWordCloud {
    public static void main(String[] args) {
        final Font[] FONTS = new Font[] { 
                new Font("Lucida Sans", Font.PLAIN, 10), 
                new Font("Comic Sans", Font.PLAIN, 10),
                new Font("Yu Gothic Light", Font.PLAIN, 10), 
                new Font("Meiryo", Font.PLAIN, 10) 
              };
        final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
        //frequencyAnalyzer.setWordFrequenciesToReturn(100);
        //frequencyAnalyzer.setMinWordLength(2);
        //frequencyAnalyzer.setMaxWordLength(4);
        //frequencyAnalyzer.setCharacterEncoding("gbk");
        //中文解析器
        frequencyAnalyzer.setWordTokenizer(new ChineseWordTokenizer());
        //frequencyAnalyzer.setStopWords(loadStopWords());
        try {
            final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(GenerateWordCloud.class.getResourceAsStream("text/text2"));
            //词云图像素大小
            final Dimension dimension = new Dimension(599, 599);
            final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
            wordCloud.setPadding(2);
            //wordCloud.setBackground(new PixelBoundryBackground(GenerateWordCloud.class.getResource("backgrounds/technologyBackground.jpg").getPath()));
            //背景图层设置（圆形）
            wordCloud.setBackground(new CircleBackground(299));
            //设置背景色
            wordCloud.setBackgroundColor(new Color(255,255,255));
            wordCloud.setFontScalar(new LinearFontScalar(10, 40));
            wordCloud.setFontScalar(new SqrtFontScalar(12, 45));
            wordCloud.setColorPalette(ColorPaletteUtil.getColorPalette(1));
            wordCloud.build(wordFrequencies); 
            wordCloud.setKumoFont(new KumoFont(FONTS[1]));
            //wordCloud.writeToFile("d:/keji-wordcloud.jpg");
            JLabel label = new JLabel(new ImageIcon(wordCloud.getBufferedImage()));
            
            JFrame frame = new JFrame("KUMO词云");
            frame.setSize(699, 699); 
            frame.add(label);
            frame.setFont(FONTS[1]);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setBackground(new Color(0xDA70D6));
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * <p>Title:loadStopWords</p>
     * <p>Description:</p>
     * @return
     */
    private Collection<String> loadStopWords() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
