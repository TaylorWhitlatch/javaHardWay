import javax.swing.JFrame ; // I m p o r t c l a s s n a m e s
import java.awt.Graphics ;
import java.awt.Canvas ;
public class HelloWorldSwing extends Canvas // C l a s s h e a d e r
{
// S t a r t o f b o d y
	public void paint ( Graphics g )
// T h e p a i n t m e t h o d
{
	g.drawString("Hello, World!",10, 10);
	g.fillRect( 25, 25, 140, 40);
} // E n d o f p a i n t

	public static void main ( String [] args ){
		HelloWorldSwing c = new HelloWorldSwing() ;
		JFrame f = new JFrame() ;
		f.add(c) ;
		f.setSize( 150, 50 ) ;
		f.setVisible(true) ;
}
}