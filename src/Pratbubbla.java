import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import wheels.users.*;


public class Pratbubbla extends ConversationBubble implements Draggable {
	private java.awt.Point _lastMousePosition; 
	public Pratbubbla(String astring){
		super(astring);
		_lastMousePosition = new Point();
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		_lastMousePosition = e.getPoint();
		this.setFrameColor(java.awt.Color.BLUE);
	}
	public void mouseDragged(java.awt.event.MouseEvent e) {
		java.awt.Point currentPoint = e.getPoint();
		int diffX = currentPoint.x - _lastMousePosition.x;
		int diffY = currentPoint.y - _lastMousePosition.y;
		this.setLocation(this.getLocation().x + diffX,
				this.getLocation().y + diffY);
		_lastMousePosition = currentPoint;
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		this.setFrameColor(java.awt.Color.BLACK);
	}
}
