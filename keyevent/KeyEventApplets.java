

/*<applet code="KeyEventApplet.class" width="300" height="100"> </applet>*/
import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventApplets extends Applet implements KeyListener {

    private String keyEventText = "Press a key";

    @Override
    public void init() {
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is called when a key is typed (pressed and released).
        keyEventText = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is called when a key is pressed.
        keyEventText = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is called when a key is released.
        keyEventText = "Key Released: " + e.getKeyChar();
        repaint();
    }

    @Override
    public void paint(java.awt.Graphics g) {
        // Display the key event text on the applet.
        g.drawString(keyEventText, 20, 20);
    }
}
