import java.awt.*;
import java.awt.event.*;

class AwtSwap extends Frame {
    AwtSwap(String s) {
        super(s);
        Label l1 = new Label("Text 1");
        add(l1);
        TextField t1 = new TextField("Enter the 1 text", 10);
        add(t1);
        Label l2 = new Label("Text 2");
        add(l2);
        TextField t2 = new TextField("Enter the 2 text", 10);
        add(t2);
        Button b1 = new Button("Swap");
        add(b1);
        b1.setBounds(10, 10, 10, 5);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String temp =t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
    }

    public static void main(String args[]) {
        Frame f = new AwtSwap("hello world");
        f.setVisible(true);
        f.setBounds(100, 100, 350, 300);
        f.setLayout(new FlowLayout());

    }

}