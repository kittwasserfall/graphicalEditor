package UserInterface;

import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import Images.ImageEntity;

public class ImageContainer extends JPanel {

    private BufferedImage bufferedImage;
    
    public ImageContainer() { }
    
    public void LoadImage(ImageEntity imageEntity) {
    	bufferedImage = imageEntity.image;
    	
    }

    // TODO: убрать, если это не нужно
    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }*/
}