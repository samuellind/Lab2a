/**
 * Winky.java by Sanders and van Dam.
 * Models a winking blob which extends a blob with the
 * capability of winking when the mouse is pressed.
 */
import wheels.users.*;
public class Winky extends Blob {
	public Winky (int x, int y) {
		super(x, y);
	}
	public void mousePressed(java.awt.event.MouseEvent e){
		super.mousePressed(e);
		/*_leftEye.setSize(30, 5);
		_leftEye.setLocation(_leftEye.getLocation().x,						//
				_leftEye.getLocation().y+15);*/
		_rightEye.setSize(30, 5);
		_rightEye.setLocation(_rightEye.getLocation().x,
				_rightEye.getLocation().y+15);
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		super.mouseReleased(e);
		/*_leftEye.setSize(30, 30);
		_leftEye.setLocation(_leftEye.getLocation().x,							//
				_leftEye.getLocation().y-15);*/
		_rightEye.setSize(30, 30);
		_rightEye.setLocation(_rightEye.getLocation().x,
				_rightEye.getLocation().y-15);
	}
}