package Abstraction6;

public abstract class Instruments {
public abstract void Play();
	
}
class Piano extends Instruments{
	public void Play() {
	System.out.println("Piano is Playing tan tan tan");
	
}
}
class Flute extends Instruments{
	public void Play() {
		System.out.println("Flute is Playing toot toot toot toot");
	}
	}
class Guitar extends Instruments{
	public void Play() {
		System.out.println("Guitar is Playing tin tin tin");
	}
}
public class Instrument{
	
	public static void main(String[] args) {
		Instruments in=new Instruments();
		in.Play();
	}
}