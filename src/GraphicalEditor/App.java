package GraphicalEditor;

import javax.swing.SwingUtilities;
import UserInterface.MainFrame;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ProgramManager programManager = new ProgramManager();
			}
		});
	}
}