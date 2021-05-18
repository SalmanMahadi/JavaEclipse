/**
 * Provides a test application window with a panel.
 * 
 * @author Björn Gottfried
 * 
 * @version 1.0
 */

package DrawingTool_00;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDrawingTool_00 {
	private JFrame applicationFrame;
	
	public TestDrawingTool_00(String title) {
		applicationFrame = new JFrame(title);
		Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
		applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
		applicationFrame.setVisible(true);
	}
	
	public void addACanvas(JPanel p) {
		applicationFrame.add(p);
	}
	
	public static void main(String[] args) {
		TestDrawingTool_00 anApplication = new TestDrawingTool_00("A drawing tool");
		anApplication.addACanvas(new DrawingArea());
	}
}