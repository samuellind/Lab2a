/**
 * TalkativeBlob.java by Sanders and van Dam.
 * Models a talkative blob which extends a blob with the
 * capability of displaying a message when the mouse is pressed.
 */
import wheels.users.*;
public class TalkativeBlob extends Blob {
	private ConversationBubble _bubble;
	public TalkativeBlob(int x, int y, String speech) {
		super(x, y);
		_bubble = new ConversationBubble(speech);
		_bubble.setLocation(x-100, y-100);
		_bubble.hide();
	}
	public void mousePressed(java.awt.event.MouseEvent e){
		super.mousePressed(e);
		_bubble.show();
	}
	public void mouseReleased(java.awt.event.MouseEvent e){
		super.mouseReleased(e);
		_bubble.hide();
	}
}