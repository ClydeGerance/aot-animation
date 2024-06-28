/**
 This is a template for a Java file.
 @author Clyde Lester M. Gerance (185503)
 @version March 9, 2023
 **/
/*
I have not discussed the Java language code in my program
with anyone other than my instructor or the teaching assistants
assigned to this course.
I have not used Java language code obtained from another student,
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program
was obtained from another source, such as a textbook or website,
that has been clearly noted with a proper citation in the comments
of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Wall implements DrawingObject {

    private double x,y,z;
    private Color color;
   
    public Wall() {

        this.x = x;
    }
    
    public void draw(Graphics2D g2d) {
    
    //wall
    
    Rectangle2D.Double w = new Rectangle2D.Double(-20,300,1064,500);
    g2d.setColor(new Color(192, 192, 192));
    g2d.fill(w);
    
    Rectangle2D.Double w1 = new Rectangle2D.Double(-20,310,1064,500);
    g2d.setColor(new Color(132, 136, 132));
    g2d.fill(w1);
    
    Rectangle2D.Double w2 = new Rectangle2D.Double(-20,320,1064,500);
    g2d.setColor(new Color(113, 121, 126));
    g2d.fill(w2);
    
//    Path2D.Double
    Line2D.Double wallLine = new Line2D.Double(-20,300,1044,300);
    g2d.setStroke(new BasicStroke(3));
    g2d.setColor(Color.BLACK);
    g2d.draw(wallLine);
    
    //details
    Rectangle2D.Double dF1 = new Rectangle2D.Double(312,550,400,10);
    g2d.setColor(new Color(192, 192, 192));
    g2d.fill(dF1);
    
    Rectangle2D.Double dF2 = new Rectangle2D.Double(312,560,400,10);
    g2d.setColor(new Color(132, 136, 132));
    g2d.fill(dF2);
    
    Line2D.Double d1 = new Line2D.Double(312,550,712,550);
    g2d.setStroke(new BasicStroke(3));
    g2d.setColor(Color.BLACK);
    g2d.draw(d1);
        
    Line2D.Double d2 = new Line2D.Double(312,580,712,580);
    g2d.setStroke(new BasicStroke(3));
    g2d.setColor(Color.BLACK);
    g2d.draw(d2);
        
    //foundation
    
    Rectangle2D.Double fL1 = new Rectangle2D.Double(272,250,40,500);
    g2d.setColor(new Color(192, 192, 192));
    g2d.fill(fL1);
    
    Rectangle2D.Double fM1 = new Rectangle2D.Double(272,260,40,500);
    g2d.setColor(new Color(132, 136, 132));
    g2d.fill(fM1);
    
    Rectangle2D.Double fD1 = new Rectangle2D.Double(272,270,40,500);
    g2d.setColor(new Color(113, 121, 126));
    g2d.fill(fD1);
    
    Rectangle2D.Double fLine1 = new Rectangle2D.Double(272,250,40,500);
    g2d.setStroke(new BasicStroke(3));
    g2d.setColor(Color.BLACK);
    g2d.draw(fLine1);  
        
    //
    Rectangle2D.Double fL2 = new Rectangle2D.Double(712,250,40,500);
    g2d.setColor(new Color(192, 192, 192));
    g2d.fill(fL2);
    
    Rectangle2D.Double fM2 = new Rectangle2D.Double(712,260,40,500);
    g2d.setColor(new Color(132, 136, 132));
    g2d.fill(fM2);
    
    Rectangle2D.Double fD2 = new Rectangle2D.Double(712,270,40,500);
    g2d.setColor(new Color(113, 121, 126));
    g2d.fill(fD2);
    
    Rectangle2D.Double fLine2 = new Rectangle2D.Double(712,250,40,500);
    g2d.setStroke(new BasicStroke(3));
    g2d.setColor(Color.BLACK);
    g2d.draw(fLine2);  

        
    // windows
        
    Rectangle2D.Double windC = new Rectangle2D.Double(492,400,40,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(windC); 
    
    Rectangle2D.Double windL1 = new Rectangle2D.Double(422,400,40,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(windL1); 
    
    Rectangle2D.Double windL2 = new Rectangle2D.Double(352,400,40,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(windL2); 
    
    Rectangle2D.Double windR1 = new Rectangle2D.Double(562,400,40,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(windR1); 
    
    Rectangle2D.Double windR2 = new Rectangle2D.Double(632,400,40,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(windR2); 
    
    }
    public void moveH(){}

    public void moveV(){}

}