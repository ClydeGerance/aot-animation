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

public class Flower implements DrawingObject {

    private double x;
    private double y;
    private double size;
    	private Circle outLine1,outLine2,outLine3,outLine4,outLine5;
	private Circle flower1,flower2,flower3,flower4,flower5;
	private Square innerS1,innerS2,innerS3,innerS4,innerS5;

    //instantiates x and y coordinates, and size
    public Flower (double x, double y, double size){
        this.x=x;
        this.y=y;
        this.size=size;
    }

    //method to draw out my sakura shape with scalable measurements
    @Override
    public void draw(Graphics2D g2d) {
        outLine1 = new Circle(x+(size*.2),y-(size*.1),(size-(size*.4)),Color.BLACK);
        outLine2 = new Circle(x-(size*.1),y+(size*.2),(size-(size*.4)),Color.BLACK);
        outLine3 = new Circle(x+(size*.5),y+(size*.2),(size-(size*.4)),Color.BLACK);
        outLine4 = new Circle(x+(size*.07),y+(size*.47),(size-(size*.4)),Color.BLACK);
        outLine5 = new Circle(x+(size*.35),y+(size*.47),(size-(size*.4)),Color.BLACK);

        flower1 = new Circle(x+(size*.25),y,(size-(size*.5)),new Color (255,255,0));
        flower2 = new Circle(x,y+(size*.25),(size-(size*.5)),new Color (255,255,0));
        flower3 = new Circle(x+(size*.5),y+(size*.25),(size-(size*.5)),new Color (255,255,0));
        flower4 = new Circle(x+(size*.125),y+(size*.47),(size-(size*.5)),new Color (255,255,0));
        flower5 = new Circle(x+(size*.37),y+(size*.47),(size-(size*.5)),new Color (255,255,0));

        innerS1 = new Square(x+(size*.4),y+(size*.25),(size-(size*.80)),new Color(250,218,94));
        innerS2 = new Square(x+(size*.3),y+(size*.375),(size-(size*.80)),new Color(250,218,94));
        innerS3 = new Square(x+(size*.5),y+(size*.375),(size-(size*.80)),new Color(250,218,94));
        innerS4 = new Square(x+(size*.35),y+(size*.5),(size-(size*.80)),new Color(250,218,94));
        innerS5 = new Square(x+(size*.45),y+(size*.5),(size-(size*.80)),new Color(250,218,94));

        outLine1.draw(g2d);
        outLine2.draw(g2d);
        outLine3.draw(g2d);
        outLine4.draw(g2d);
        outLine5.draw(g2d);
        flower1.draw(g2d);
        flower2.draw(g2d);
        flower3.draw(g2d);
        flower4.draw(g2d);
        flower5.draw(g2d);
        innerS1.draw(g2d);
        innerS2.draw(g2d);
        innerS3.draw(g2d);
        innerS4.draw(g2d);
        innerS5.draw(g2d);
    }

    //to move the sakuras up
    public void moveH(){}
    public void moveV(){}

}