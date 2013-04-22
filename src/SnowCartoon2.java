import wheels.users.*;

public class SnowCartoon2 extends Frame {
	
	private Pratbubbla _pratbubbla;
	private Snowman _snowman;
	private Sun _sun;
	
	public SnowCartoon2()
	{
		_sun = new Sun(50,50);
		_snowman = new Snowman();
		_pratbubbla = new Pratbubbla("HAHAHAHA");
	}
	
	public static void main(String[] args) {
		SnowCartoon2 snowCartoon = new SnowCartoon2();
	}

}
