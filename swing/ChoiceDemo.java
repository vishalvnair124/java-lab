/*
 * 
 * import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class ChoiceDemo extends Frame implements ActionListener,ItemListener{
double radius;
JTextField textfield;
JLabel l2;
Choice ch;
String selected;
ChoiceDemo(){
	
	ch =new Choice();
	ch.add("MM");
	ch.add("CM");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	JLabel l1=new JLabel("Enter the Radius :");
    JButton b=new JButton("calculate");
     textfield = new JTextField(30);
    add(l1);
    add(textfield);add(ch);
    add(b);
     l2=new JLabel("");
    add(l2);    
    b.addActionListener(this);
    
    ch.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie){
 selected=ch.getSelectedItem();
System.out.println(selected);	
} 
public void actionPerformed(ActionEvent ae){
	radius= Double.parseDouble(textfield.getText());
	double area=Math.PI*radius*radius;
	l2.setText("Area :"+area);	
}
public static void main(String args[]){
 ChoiceDemo c=	new ChoiceDemo();
 c.setBounds(30,30,600,600);
 c.setVisible(true);
}}
*/


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class ChoiceDemo extends Frame implements ActionListener{
double num1,num2;
JTextField textfield1,textfield2,textfield3;
JLabel l1,l2,l3;
JButton b1,b2;
ChoiceDemo(){
	
	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	l1=new JLabel("Enter the first number  :");
	l2=new JLabel("Enter the second number :");
    b1=new JButton("+");
    b2=new JButton("-");
    textfield1 = new JTextField(30);
    textfield2 = new JTextField(30);
    textfield3 = new JTextField(30);
    add(l1);
    add(textfield1);
    add(l2);
    add(textfield2);
    add(b1); 
    add(b2);
    l3=new JLabel("ANSWER :");
    add(l3);   
    add(textfield3); 
    b1.addActionListener(this);
    b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
	double answer=0.0;
	String command=ae.getActionCommand();
	num1= Double.parseDouble(textfield1.getText());
	num2= Double.parseDouble(textfield2.getText());
	switch(command.charAt(0)){
		case '+':
		     answer=num1+num2;
              break;		
		case '-':
		     answer=num1-num2;
		      break;
		
	}
	textfield3.setText(String.valueOf(answer));	
}
public static void main(String args[]){
 ChoiceDemo c=	new ChoiceDemo();
 c.setBounds(30,30,600,600);
 c.setVisible(true);
}}
