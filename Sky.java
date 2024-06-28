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

public class Sky implements DrawingObject {

    private double x,y,size;
    private Rectangle sky1,sky2,sky3;
    private Color color;

    //instantiates x and y coordinates, and size
    //Also includes scalable measurements of the clouds
    public Sky(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;

        sky1 = new Rectangle(x, y, (size), new Color(171,205,239));
        sky2 = new Rectangle(x, y + 30, (size), new Color(161,202,241));
        sky3 = new Rectangle(x, y + 60, (size), new Color(155,196,226));

    }
    //method to draw the cloud
    @Override
    public void draw(Graphics2D g2d) {

        sky1.draw(g2d);
        sky2.draw(g2d);
        sky3.draw(g2d);
    }

    public void moveH(){}
    public void moveV(){}


}