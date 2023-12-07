import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="face.class" width="400" height="400">
</applet> */

public class face extends Applet {

    public void init() {

    }

    public void start() {
        // You can leave this method empty if you don't need specific actions here
    }

    public void paint(Graphics g) {
               // Draw the face (circle)
        g.drawOval(100, 100, 200, 200);

        // Draw the eyes (circles)
        g.drawOval(150, 150, 30, 30);
        g.drawOval(220, 150, 30, 30);

        // Draw the nose (triangle)
        int[] noseX = {200, 220, 180};
        int[] noseY = {180, 200, 200};
        g.drawPolygon(noseX, noseY, 3);

        // Draw the mouth (ellipse)
        g.drawArc(150, 220, 100, 50, 180, 180);
    }
}
