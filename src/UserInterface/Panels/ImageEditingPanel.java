package UserInterface.Panels;

import javax.swing.JPanel;

import UserInterface.ImageContainer;

public class ImageEditingPanel extends JPanel{
	private ImageContainer beforeImage;
	private ImageContainer afterImage;
	
	public ImageEditingPanel() {
		beforeImage = new ImageContainer();
		afterImage = new ImageContainer();
			
	}
}
