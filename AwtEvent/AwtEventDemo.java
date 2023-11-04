import java.awt.*;
import java.awt.event.*;

class AwtEventDemo extends Frame implements ActionListener {

	TextField textField;

	AwtEventDemo()
	{
		// Component Creation
		textField = new TextField();

		// setBounds method is used to provide 
		// position and size of the component
		textField.setBounds(60, 50, 180, 25);
		Button button = new Button("click Here");
		button.setBounds(100, 120, 80, 30);

		// Registering component with listener
		// this refers to current instance
		button.addActionListener(this);

		// add Components
		add(textField);
		add(button);

		// set visibility
		setSize(300, 300);
		setLayout(null); // not recommended, but used here for simplicity
		setVisible(true);
       
	}

	// implementing method of actionListener
	public void actionPerformed(ActionEvent e)
	{
		// Setting text to field
		textField.setText("HELLO WORLD!");
	}

	public static void main(String[] args)
	{
		new AwtEventDemo();
	}
    
}
