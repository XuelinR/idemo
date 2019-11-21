/**
 * <p>Title:ColorPaletteUtil.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 * @version 
 */
package utils;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.kennycason.kumo.palette.ColorPalette;

/**
 * <p>Title:ColorPaletteUtil</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年12月26日
 *
 */
public class ColorPaletteUtil {
    public static ColorPalette getColorPalette(int number) {
        final List<Color> colors = new ArrayList<>();
        switch (number) {
        //红色、橙色、黄色、绿色、青色、紫色、
        case 1:
            colors.add(new Color(0xFF0000));
            colors.add(new Color(0xFFA500));
            colors.add(new Color(0xFFFF00));
            colors.add(new Color(0x00FF00));
            colors.add(new Color(0x00FFFF));
            colors.add(new Color(0x0000FF));
            colors.add(new Color(0xA020F0));
            break;
        //蓝绿色、绿色、黄色、印度红、暗紫色、天蓝色
        case 2:
            colors.add(new Color(0x00FFFF));
            colors.add(new Color(0x00FF00));
            colors.add(new Color(0xFFFF00));
            colors.add(new Color(0xFF6A6A));
            colors.add(new Color(0x9400D3));
            colors.add(new Color(0x87CEFF));
            break;
        //白色、黑色、灰色、暗金色、赭色、中紫色
        case 3:
            colors.add(new Color(0xFFFFFF));
            colors.add(new Color(0x000000));
            colors.add(new Color(0xBEBEBE));
            colors.add(new Color(0x8B658B));
            colors.add(new Color(0x8B4726));
            colors.add(new Color(0x5D478B));
            break;
        //纯红色、纯粉色、纯橘色、纯绿色、纯黄色、纯蓝色
        case 4:
            colors.add(new Color(0xFF0000));
            colors.add(new Color(0xFFC0CB));
            colors.add(new Color(0xFFA500));
            colors.add(new Color(0x00FF00));
            colors.add(new Color(0xFFFF00));
            colors.add(new Color(0x0000FF));
            break;
        //浅绿色、深棕色、深红色、深蓝色、橘黄色、品红色
        default:
            colors.add(new Color(0x90EE90));
            colors.add(new Color(0x8B008B));
            colors.add(new Color(0x8B0000));
            colors.add(new Color(0x00008B));
            colors.add(new Color(0xFFA500));
            colors.add(new Color(0xFF00FF));
            break;
        }
        return new ColorPalette(colors);
    }
}
