import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsExample extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel actionLabel;

    public MouseEventsExample() {
        super("Mouse Events Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display mouse actions
        actionLabel = new JLabel("Mouse Actions: ");
        actionLabel.setHorizontalAlignment(JLabel.CENTER);
        add(actionLabel, BorderLayout.CENTER);

        // Add both mouse listener and mouse motion listener to the frame
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        updateLabel("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        updateLabel("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        updateLabel("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        updateLabel("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        updateLabel("Mouse Exited");
    }

    // MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {
        updateLabel("Mouse Moved");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        updateLabel("Mouse Dragged");
    }

    private void updateLabel(String text) {
        actionLabel.setText("Mouse Actions: " + text);
    }

    public static void main(String[] args) {
        
            MouseEventsExample example = new MouseEventsExample();
            example.setVisible(true);
      
    }
}
