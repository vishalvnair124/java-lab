import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="EmployeeDetailsApplet.class" width="400" height="400">  
</applet>*/

public class EmployeeDetailsApplet extends Applet implements ActionListener {
    private TextField nameField, ageField, qualificationField, genderField;
    private Button submitButton;
    private Panel cardPanel;
    private CardLayout cardLayout;

    public void init() {
        // Initialize components
        nameField = new TextField(20);
        ageField = new TextField(20);
        qualificationField = new TextField(20);
        genderField = new TextField(20);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Create card layout and panel
        cardLayout = new CardLayout();
        cardPanel = new Panel();
        cardPanel.setLayout(cardLayout);

        // Create card for entering details
        Panel detailsCard = new Panel(new GridLayout(5,2)); 
        detailsCard.add(new Label("Name: "));
        detailsCard.add(nameField);
        detailsCard.add(new Label("Age: "));
        detailsCard.add(ageField);
        detailsCard.add(new Label("Qualification: "));
        detailsCard.add(qualificationField);
        detailsCard.add(new Label("Gender: "));
        detailsCard.add(genderField);
        detailsCard.add(new Label(""));
        detailsCard.add(submitButton);

        cardPanel.add(detailsCard, "Details");

        // Create card for displaying details
        Panel displayCard = new Panel();
        cardPanel.add(displayCard, "Display");

        add(cardPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get entered details
            String name = nameField.getText();
            String age = ageField.getText();
            String qualification = qualificationField.getText();
            String gender = genderField.getText();

            // Display details on the next card
            Panel displayCard = new Panel(new FlowLayout());
            displayCard.add(new Label("Name: " + name));
            displayCard.add(new Label("Age: " + age));
            displayCard.add(new Label("Qualification: " + qualification));
            displayCard.add(new Label("Gender: " + gender));

            cardPanel.add(displayCard, "Display");
            cardLayout.show(cardPanel, "Display");
        }
    }
}
