import wheels.users.Ellipse;

public class SurpriseBlob extends TalkativeBlob {
	private Ellipse _mouth;
	public SurpriseBlob(int x, int y, String speech)
	{
		super(x,y,speech);
		_mouth = new Ellipse();
		_mouth.hide();
		_mouth.setSize(30,7);
		_mouth.setFillColor(java.awt.Color.DARK_GRAY);
		_mouth.setLocation(x+40,y+60);
	}
	
	public void mousePressed(java.awt.event.MouseEvent e){
		super.mousePressed(e);
		_mouth.show();
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		super.mouseReleased(e);
		_mouth.hide();
	}
	
	
}
