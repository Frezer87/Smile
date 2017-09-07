import java.awt.Graphics;

		import javax.swing.*;

public class Smile extends JApplet{
	public void paint(Graphics convas) {
		convas.drawOval(200,200,400,400);
		convas.fillOval(320, 340, 40, 40);
		convas.fillOval(460, 340, 40, 40);
		convas.drawArc(260, 400, 280, 120, 180, 180);

	}
}
