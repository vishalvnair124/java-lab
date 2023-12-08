import java.awt.*;

/*<applet code="OlympicRings.class" width="800" height="600">  
</applet>   */


public class OlympicRings extends java.applet.Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(50, 50, 100, 100); // Blue ring

        g.setColor(Color.BLACK);
        g.drawOval(160, 50, 100, 100); // Black ring

        g.setColor(Color.RED);
        g.drawOval(270, 50, 100, 100); // Red ring

        g.setColor(Color.YELLOW);
        g.drawOval(105, 100, 100, 100); // Yellow ring

        g.setColor(Color.GREEN);
        g.drawOval(215, 100, 100, 100); // Green ring
    }
}
