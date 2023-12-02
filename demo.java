import java.awt.*;
import java.awt.event.*;

class demo extends Frame implements ActionListener{
    demo() {
     setBounds(100,100,500,500);
     Button b1 =new Button("vishal");
     add(b1);
     b1.addActionListener(this);
    }
    
    public static void main(String vidhal[]) {
        System.out.println("hello ");
        new demo().setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        System.out.print("hai");
    }
}