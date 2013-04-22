/**
 * Snowman.java by Sanders and van Dam.
 * Models a simple snowman.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;
public class Snowman implements Draggable {
	private Ellipse _head, _body, _leftEye, _rightEye;
	private Part _part1, _part2, _part3, _part4, _part5;
	private java.awt.Point _lastMousePosition;
	private java.awt.Color color = java.awt.Color.BLACK;
	int x,y,_x=10,_y=240;
	private Hat _hat;
	public Snowman() {
		_part1 = new Part(100,100,10,300,java.awt.Color.white, this);
		_part2 = new Part(80,80,20,240,java.awt.Color.white, this);
		_part3 = new Part(15,15,35,265,java.awt.Color.darkGray, this);
		_part4 = new Part(15,15,70,265,java.awt.Color.darkGray, this);
		this.setOutline(java.awt.Color.black, 2);
		_hat = new Hat(color);
	}
	public void setOutline (java.awt.Color color, int thickness) {
		_part1.setFrameColor(color);
		_part1.setFrameThickness(thickness);
		_part2.setFrameColor(color);
		_part2.setFrameThickness(thickness);
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		_lastMousePosition = e.getPoint();
		this.setColor(java.awt.Color.blue);
	}
	public void mouseDragged(java.awt.event.MouseEvent e) {
		java.awt.Point currentPoint = e.getPoint();
		int diffX = currentPoint.x - _lastMousePosition.x;
		int diffY = currentPoint.y - _lastMousePosition.y;
		this.setLocation(_x + diffX,_y + diffY);
		_lastMousePosition = currentPoint;
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		this.setColor(java.awt.Color.black);
	}
	@Override
	public void setColor(Color aColor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLocation(int x, int y) {
		_x = x;
		_y = y;
		_part1.setLocation(x, y + 60);
		_part2.setLocation(x + 10, y);
		_part3.setLocation(x+25, y+25);
		_part4.setLocation(x+60,y+25);
	}
}