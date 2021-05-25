package edu.zerlinda.pic;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZerlindaLi create at 2020/12/24 10:55
 * @version 1.0.0
 * @description Test1
 */
public class Test1 {

        public static void main(String[]args) throws IOException {
            File file = new File("D:\\图片处理\\24bit.bmp");
            Image img = ImageIO.read(file);
            BufferedImage tag = new BufferedImage(img.getWidth(null), img.getHeight(null),    BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(img.getScaledInstance(img.getWidth(null), img.getHeight(null), Image.SCALE_SMOOTH), 0, 0, null);
            FileOutputStream out = new FileOutputStream("D:\\图片处理\\bmp2jpg.jpg");
            // JPEGImageEncoder可适用于其他图片类型的转换
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(tag);
            out.close();
        }
}
