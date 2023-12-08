import java.awt.*;
import java.applet.*;


/*<applet code="AppletHisto.class" width="800" height="600">  
</applet>   */


public class AppletHisto extends Applet {
    
    public void paint(Graphics g) {
        g.drawLine(60, 10, 60, 250);
        g.drawLine(60, 250, 350, 250);
        
        g.fillRect(90, 91, 25, 160);
        g.fillRect(130, 121, 25, 130);
        g.fillRect(170, 61, 25, 190);
        
        g.drawString("85", 92, 85);
        g.drawString("80", 132, 115);
        g.drawString("90", 172, 55);
        
        g.drawString("2010", 87, 262);
        g.drawString("2011", 123, 262);
        g.drawString("2012", 167, 262);
    }
}