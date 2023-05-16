import java.awt.*;
import java.applet.*;

public class appletdemo extends Applet
{
	public void paint(Graphics g){
		g.drawOvel(20,20,200,120);
		g.setColor(Color.green);
		g.fillOver(70,30,100,100);
	}
}