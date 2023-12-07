import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="home.class" width="300" height="300">
</applet> */

public class home extends Applet {

    public void init() {

    }

    public void start() {
        // You can leave this method empty if you don't need specific actions here
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to applet", 150, 150);
    }
}
