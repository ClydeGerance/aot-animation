/**
 This is a template for a Java file.
 @author Clyde Lester M. Gerance (185503)
 @version March 9, 2023
 **/
/*`
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

public class WallDetail implements DrawingObject {

    private double x,y,size;

    private Rectangle wall1,wall2,wall3,wall4,wall5,wall6;
    private Line landOutline;

    //instantiates x and y coordinates, and size
    public WallDetail (double x, double y, double size){
        this.x=x;
        this.y=y;
        this.size=size;
    }

    //method to draw out my sakura shape with scalable measurements
    @Override
    public void draw(Graphics2D g2d) {

        wall1 = new Rectangle(x+25,y-10,(size),new Color(178, 190, 181));
        wall2 = new Rectangle(x-20,y+10,(size),new Color(169, 169, 169));
        wall3 = new Rectangle(x+60,y+45,(size),new Color(128, 128, 128));
        wall4 = new Rectangle(x+780,y+50,(size),new Color(128, 128, 128));
        wall5 = new Rectangle(x+725,y+25,(size),new Color(178, 190, 181));
        wall6 = new Rectangle(x+810,y+10,(size),new Color(169, 169, 169));
        wall1.draw(g2d);
        wall2.draw(g2d);
        wall3.draw(g2d);
        wall4.draw(g2d);
        wall5.draw(g2d);
        wall6.draw(g2d);
        wall6.draw(g2d);
    }

    //to move the sakuras up
    public void moveH(){}
    public void moveV(){}

}