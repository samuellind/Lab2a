/**
 * Blob.java by sanders and van Dam.
 * Models a blob.
 */
import wheels.users.*;
public class Blob extends Ellipse {
	protected Ellipse _leftEye, _rightEye;
	public Blob(int x, int y) {
		super(x, y);
		this.setSize(100, 100);
		_leftEye = new Ellipse(java.awt.Color.black);
		_rightEye = new Ellipse(java.awt.Color.black);
		_leftEye.setSize(30, 30);
		_rightEye.setSize(30, 30);
		this.setLocation(x, y);
	}
	public void setLocation(int x, int y) {
		super.setLocation(x, y);
		if (_leftEye != null)
			_leftEye.setLocation(this.getLocation().x+22,
					this.getLocation().y+10);
		if (_rightEye != null)
			_rightEye.setLocation(this.getLocation().x+47,
					this.getLocation().y+10);
	}
	public void mousePressed(java.awt.event.MouseEvent e){
		this.setFillColor(java.awt.Color.blue);
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		this.setFillColor(java.awt.Color.red);
	}
}