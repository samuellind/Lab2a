import wheels.users.*;
import java.awt.*;
public class HappyBlob extends TalkativeBlob {
	private Line _vertLine1, _horizLine, _vertLine2;
	private Color _color = java.awt.Color.BLACK;
	public HappyBlob(int x, int y, String speech) {
		super(x, y,speech);
		_vertLine1 = new Line();
		_vertLine1.setColor(_color);
		_vertLine1.setPoints(120, 120, 100, 100);
		_vertLine2 = new Line();
		_vertLine2.setColor(_color);
		_vertLine2.setPoints(100,120,120,140);
		_horizLine = new Line();
		_horizLine.setColor(_color);
		_horizLine.setPoints(120, 120, 100,120 );
		

}
	public void mousePressed(java.awt.event.MouseEvent e){
		super.mousePressed(e);
		
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		super.mouseReleased(e);
	}
}
