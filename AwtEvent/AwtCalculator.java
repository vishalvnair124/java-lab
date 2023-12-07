import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtCalculator extends Frame implements ActionListener {
    // Components
    TextField textField;
    Button[] numberButtons;
    Button[] operatorButtons;
    Button equalButton;

    // Variables
    double num1, num2, result;
    char operator;

    public AwtCalculator() {
        // Frame setup
        setTitle("AWT Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());

        // Text Field
        textField = new TextField();
        // Set the width to 400 and height to 100
        textField.setPreferredSize(new Dimension(400, 100));
        add(textField, BorderLayout.NORTH);

        // Number Buttons
        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Operator Buttons
        operatorButtons = new Button[4];
        operatorButtons[0] = new Button("+");
        operatorButtons[1] = new Button("-");
        operatorButtons[2] = new Button("*");
        operatorButtons[3] = new Button("/");
        for (Button operatorButton : operatorButtons) {
            operatorButton.addActionListener(this);
        }

        // Equal Button
        equalButton = new Button("=");
        equalButton.addActionListener(this);

        // "C" Button
        Button clearButton = new Button("C");
        clearButton.addActionListener(this);

        // Panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add components to the panel
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(operatorButtons[0]);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(operatorButtons[1]);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(operatorButtons[2]);
        buttonPanel.add(clearButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(equalButton);
        buttonPanel.add(operatorButtons[3]);
        

        // Add button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Window listener for closing the frame
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9')) {
            textField.setText(textField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            textField.setText("");  // Clear the text
            num1 = num2 = result = 0;
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;
        } else {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new AwtCalculator();
    }
}
