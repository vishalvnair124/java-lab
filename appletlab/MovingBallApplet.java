import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* <applet code="MovingBallApplet.class" width="300" height="300">
</applet> */

public class MovingBallApplet extends Applet implements Runnable {
    private int x = 50;
    private int y = 50;
    private int xSpeed = 5;

    @Override
    public void init() {
        // Initialization code, if needed
    }

    @Override
    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            moveBall();
            repaint();  // Redraw the applet
            try {
                Thread.sleep(100);  // Adjust the speed of the ball
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveBall() {
        x += xSpeed;

        // If the ball hits the right edge, reset its position to the left edge
        if (x >= getWidth()) {
            x = 0;
        }
    }

    @Override
    public void paint(Graphics g) {
        // Set the color of the ball
        g.setColor(Color.BLUE);

        // Draw the ball
        g.fillOval(x, y, 50, 50);
    }
}
