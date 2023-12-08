import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="MyApplet.class" width="300" height="200">
    <param name="num1" value="5">
    <param name="num2" value="10">
    <param name="num3" value="8">
   </applet>
*/

public class MyApplet extends Applet {
    private String message;

    @Override
    public void init() {
        // Retrieve the parameters named "num1", "num2", and "num3" from the HTML code
        int num1 = Integer.parseInt(getParameter("num1"));
        int num2 = Integer.parseInt(getParameter("num2"));
        int num3 = Integer.parseInt(getParameter("num3"));

        // Compare the numbers and create a message
        message = "The largest number is: " + findLargest(num1, num2, num3);
    }

    // Method to find the largest of three numbers
    private int findLargest(int a, int b, int c) {
        // Using nested ternary operators to find the maximum
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the message on the applet window
        g.drawString(message, 20, 20);
    }
}
