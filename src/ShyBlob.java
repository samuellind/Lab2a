;
public class ShyBlob extends Blob {
	int xCoord, yCoord;
	double a = (Math.random()+1)*500;
	public ShyBlob(int x, int y) {
		super(x, y); 
		xCoord = x;
		yCoord = y;
	}	public void mousePressed(java.awt.event.MouseEvent e){
		super.mousePressed(e);
		this.setLocation(xCoord + 100, yCoord);
	}

	public void mouseReleased(java.awt.event.MouseEvent e){
		super.mouseReleased(e);
		this.setLocation(xCoord,yCoord);
	}
}
