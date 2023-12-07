import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="face2.class" width="400" height="400">
</applet> */

public class face2 extends Applet {

    public void init() {

    }

    public void start() {
        // You can leave this method empty if you don't need specific actions here
    }

    public void paint(Graphics g) {
        // Draw the face (circle)
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);
        g.fillOval(68, 81,10,10);
        g.fillOval(121, 81,10,10);
        g.drawOval(85, 100, 30, 30);
        g.fillArc(60, 125,80, 40, 180, 180);
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
