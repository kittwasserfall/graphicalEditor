package Images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


// RIKARYU: ��� �����-������� ������ java.awt.image.BufferedImage
public class ImageEntity {
	// TODO: ������� private
	public BufferedImage image;
	
	public ImageEntity() {};
	
	public void OpenImage(String fileName) {
    	try {                
    		image = ImageIO.read(new File(fileName));
	    } 
    	catch (IOException ex) {
            // TODO: ���������� log4Java � ������� �������
	    }
    }
}