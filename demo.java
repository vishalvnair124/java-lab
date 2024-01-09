import java.awt.*;
import java.awt.event.*;


class demo extends Frame implements ItemListener {
    demo() {
        setBounds(100, 100, 500, 500);
        Label label = new Label("                                                               ");
        Choice c = new Choice();
        c.add("hello");
        c.add("hai");
        c.add("he");
        add(label);
        add(c);
        Button button=new Button("hello");
        add(button);
        
        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
            System.out.println(c.getSelectedIndex());
            System.out.println(c.getSelectedItem());
          
            }

        });

        setLayout(new GridLayout(1,2));
    }

    public static void main(String vidhal[]) {
        System.out.println("hello ");
        try { int h =System.in.read();System.out.println(h);}catch(Exception ex){}
         
        new demo().setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {

    }

}