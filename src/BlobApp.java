/**
 * BlobApp.java by Sanders and van Dam.
 * An interactive program that displays two blobs that responds
 * to mouse presses and mouse release.
 */
import wheels.users.*;
public class BlobApp extends Frame {
	private Winky _winky;
	private TalkativeBlob _talky;
	private SurpriseBlob _mouth;										//
	private HappyBlob _happiy;											//
	private ShyBlob _shyly;												//
	public BlobApp() {
		_winky = new Winky(300, 300);
		_talky = new TalkativeBlob(400, 200, "I'm so Happy!");
		_mouth = new SurpriseBlob(300,150, "HAHAHA");							//
		_happiy = new HappyBlob(100,70, "Hairy Potter");						//
		_shyly = new ShyBlob(300, 0);											//
	}
	public static void main (String[] argv) {
		BlobApp app = new BlobApp();
	}
}