import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class Part extends Ellipse implements Draggable{
	
	private Ellipse _part;
	private Snowman _snowman;
	private java.awt.Color color = java.awt.Color.BLACK;
	
	public Part(int x, int y, int xCoord, int yCoord, java.awt.Color aColor, Snowman aSnowman)
	{
		_snowman = aSnowman;
		super.setColor(aColor);
		super.setSize(x, y);
		super.setLocation(xCoord, yCoord);
	}

	public void mouseDragged(MouseEvent e) {
		_snowman.mouseDragged(e);
	//	System.out.println("DU TRYCKER!!!");
	}

	public void mousePressed(MouseEvent e) {
		_snowman.mousePressed(e);
	//	System.out.println("DU HAR TRYCKT!!!");
	}

	public void mouseReleased(MouseEvent e) {
		_snowman.mouseReleased(e);
		//System.out.println("DU HAR SLÄPPT!");
	}


}
