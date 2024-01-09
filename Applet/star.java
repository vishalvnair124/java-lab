import java.applet.Applet;
import java.awt.*;
/*<applet code="star.class" height=400 width=400></applet> */
public class star extends Applet {

    public void paint(Graphics g) {
        int[] xPoints = {200, 250, 400, 270, 370, 200, 30, 130, 0, 150};
        int[] yPoints = {0, 100, 100, 160, 300, 200, 300, 160, 100, 100};
        int numPoints = 10;
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, numPoints);
    }
}