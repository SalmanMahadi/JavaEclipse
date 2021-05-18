/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Björn Gottfried
 * @version 1.0
 */

package DrawingTool_00;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		pen.drawLine(100, 100, 800, 800);
		
		pen.setColor(Color.blue); // a color constant
		pen.drawRect(10, 10, 200, 300);
	
		pen.setColor(Color.decode("#7a5230")); // HEX representation
		pen.fillOval(300, 234, 800, 100);
		
		pen.setColor(new Color(255,100,100)); // RGB representation
		pen.drawString("Hello World", 666, 280);
		
	    // Drawing a polygon	
		int xPoly[] = {150, 250, 325, 375, 450, 275, 100};
	    int yPoly[] = {150, 100, 125, 225, 250, 375, 300};
	    int numberofpoints = 7;
	
        pen.setColor(Color.blue);
  
        // draw the polygon using drawPolygon function
        pen.drawPolygon(xPoly, yPoly, numberofpoints);
	}
}