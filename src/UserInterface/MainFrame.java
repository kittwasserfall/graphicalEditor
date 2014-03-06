package UserInterface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import UserInterface.Panels.*;

public class MainFrame extends JFrame {
	
	/*private TextPanel textPanel;
	private Toolbar toolbar;*/
	
	//private JButton fileOpenButton;
	private JMenuBar menuBar;
	private ImageEditingPanel imageEditingPanel;
	private NavigatorPanel navigatorPanel; 
	private HistoryPanel historyPanel;
	private HistogramPanel histogramPanel;
	
	public MainFrame() {
		super("Graphical Editor");

		setLayout(new BorderLayout()); // VERBOSE: установка разметки основного окна
		setSize(500, 600); // VERBOSE: установка размера основного окна 

		//fileOpenButton = new JButton("Open ImageEntity");
		
		navigatorPanel = new NavigatorPanel();
		historyPanel = new HistoryPanel();
		
		//add(fileOpenButton, );
		
		/*textPanel = new TextPanel();
		btn = new JButton("Click");
		toolbar = new Toolbar();
		
		toolbar.setTextPanel(textPanel);
		
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("Hello\n");
			}
			
		});*/
		
		// добавление панелей
		/*add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);*/
		
		//add(imageContainer, BorderLayout.CENTER);
		add(navigatorPanel, BorderLayout.EAST);
		
		//GraphicEditor.imagesInWork.images[0].OpenImage("E:\\lightroom2.jpg");
	
        menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(154, 165, 127));
        menuBar.setPreferredSize(new Dimension(200, 30));
        setJMenuBar(menuBar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO: закомментить
		// pack(); TODO: это зачем?
		setVisible(true);	
	}
}
