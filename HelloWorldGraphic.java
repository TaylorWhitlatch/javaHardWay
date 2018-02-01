import java.awt.*;
import javax.swing.JFrame;

public class HelloWorldGraphic  extends Canvas{
	public void paint(Graphics g){
		g.setColor(Color.cyan);
		g.fillRect(25,25,140,40);
		g.setColor(Color.blue);
		g.drawRect(25,25,140,40);
		g.setColor(Color.black);
		g.drawString("Hello, World!", 50,50);
		g.setColor(Color.yellow);
		g.fillOval(25,75,140,40);
		g.setColor(Color.red);
		g.drawOval(25,75,140,40);
		g.setColor(Color.black);
		g.drawString("Welcome to Java",50,100);

	}

	public static void main(String[] args){
		HelloWorldGraphic c = new HelloWorldGraphic();
		JFrame f = new JFrame();
		f.add(c);
		f.setSize(150,50);
		f.setVisible(true);

	}
}
