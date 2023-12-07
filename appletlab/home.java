//write code for draw picture of home using applet
import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="home.class" width="600" height="600">
</applet> */

public class home extends Applet {

    public void init() {

    }

    public void start() {
        
    }

    public void paint(Graphics g) {
      // Draw the house structure (rectangle)
        g.drawRect(100, 200, 200, 150);

        // Draw the roof (triangle)
        int[] roofX = {100, 200, 300};
        int[] roofY = {200, 100, 200};
        g.drawPolygon(roofX, roofY, 3);

        // Draw the door (rectangle)
        g.drawRect(170, 250, 60, 100);

        // Draw the window (rectangle)
        g.drawRect(250, 250, 40, 40);

        // Draw the sun (circle)
        g.drawOval(350, 50, 50, 50);
    }
}

//output is availabe as picture
