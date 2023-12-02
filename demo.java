import java.awt.*;
import java.awt.event.*;

class demo extends Frame implements ItemListener {
    demo() {
        setBounds(100, 100, 500, 500);
        Label label =new Label("                                                               ");
       
        Checkbox c1 = new Checkbox("hello",false);
        Checkbox c2 = new Checkbox("hai",!true);
        add(c1);
        add(c2);
         add(label);
        c1.addItemListener( new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
         label.setText("C++ Checkbox: "  + (e.getStateChange()==1?"checked":"unchecked")); 
     }   
                
        });
        c2.addItemListener(this);
        setLayout(new FlowLayout());
    }

    public static void main(String vidhal[]) {
        System.out.println("hello ");
        new demo().setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
       
     }   
 
}