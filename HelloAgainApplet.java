import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.applet.Applet;

public class HelloAgainApplet extends Applet{
	Font f = new Font("TimesRoman", Font.BOLD, 36);

	public void paint(Graphics g){
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Hello again!", 5, 50);
	}
}