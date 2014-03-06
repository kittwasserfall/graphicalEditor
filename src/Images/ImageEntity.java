package Images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


// RIKARYU: это класс-обертка вокруг java.awt.image.BufferedImage
public class ImageEntity {
	// TODO: сделать private
	public BufferedImage image;
	
	public ImageEntity() {};
	
	public void OpenImage(String fileName) {
    	try {                
    		image = ImageIO.read(new File(fileName));
	    } 
    	catch (IOException ex) {
            // TODO: подключить log4Java и сделать логгинг
	    }
    }
}