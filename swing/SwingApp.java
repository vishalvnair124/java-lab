import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code="SwingApp.class" width="800" height="600">  
</applet>   */

public class SwingApp extends JApplet implements ItemListener {
    String m1 = "";
    Choice ch;
    Label label = new Label("SELECT ONE :");
    public void init() {
        setLayout(new FlowLayout()); 
        ch = new Choice();
        ch.add("select");
        ch.add("Line");
        ch.add("Circle");
        ch.add("Rectangle");
        ch.addItemListener(this);
        add(label);
        add(ch);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g); // Ensure the background is painted

        if (ch.getSelectedItem().equals("Line")) {
            m1 = "Current selection is " + ch.getSelectedItem();
            g.drawString(m1, 100, 100);
            g.drawLine(50, 150, 400, 450);
        } else if (ch.getSelectedItem().equals("Circle")) {
            m1 = "Current selection is " + ch.getSelectedItem();
            g.drawString(m1, 100, 100);
            g.drawOval(50, 150, 200, 200);
        } else if (ch.getSelectedItem().equals("Rectangle")) {
            m1 = "Current selection is " + ch.getSelectedItem();
            g.drawString(m1, 100, 100);
            g.drawRect(50, 150, 200, 250);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingApp");
        SwingApp applet = new SwingApp();
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}