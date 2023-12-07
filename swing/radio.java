
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
/*<applet code="radio.class" height=400 width=300> </applet> */
public class radio extends JApplet implements ActionListener
{
    JRadioButton b1,b2,b3;
     JLabel label;
    public void init()
    {   getContentPane().setBackground(Color.RED);
        ButtonGroup b= new ButtonGroup();
        b1=new JRadioButton("Red",true);
        b1.setBounds(30,40,50,40);
        b1.addActionListener(this);
        b2=new JRadioButton("Green");
        b2.setBounds(90,40,70,40);
        b2.addActionListener(this);
        b3=new JRadioButton("Blue");
        b3.setBounds(170,40,60,40);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        b.add(b1);
        b.add(b2);
        b.add(b3);
        setLayout(null);
         label =new JLabel();
        label.setText("Selected color RED");
        label.setBounds(100, 200, 200, 20);
        add(label);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(b1.isSelected())
        {   
            label.setText("Selected color RED");
            getContentPane().setBackground(Color.RED);
        }
        if(b2.isSelected())
        {    label.setText("Selected color GREEN");
            getContentPane().setBackground(Color.GREEN);
        }
        if(b3.isSelected())
        {    label.setText("Selected color BLUE");
            getContentPane().setBackground(Color.BLUE);
        }
    }
}