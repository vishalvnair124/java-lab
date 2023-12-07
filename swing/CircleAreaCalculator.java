import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CircleAreaCalculator extends JFrame {
    private JTextField radiusTextField;
    private JLabel resultLabel;

    public CircleAreaCalculator() {
        // Set up the JFrame
        setTitle("Circle Area Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        // Create components
        JLabel radiusLabel = new JLabel("Enter Radius:");
        radiusTextField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("");
        // Set layout
        setLayout(new GridLayout(4,0) );

        // Add components to the frame
        add(radiusLabel);
        add(radiusTextField);
        add(calculateButton);
        add(resultLabel);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        try {
            // Get the radius from the text field
            double radius = Double.parseDouble(radiusTextField.getText());

            // Calculate the area of the circle
            double area = Math.PI * Math.pow(radius, 2);

            // Display the result
            resultLabel.setText("Area: " + String.format("%.2f", area));
        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid number
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
       
                new CircleAreaCalculator().setVisible(true);
        
    }
}
