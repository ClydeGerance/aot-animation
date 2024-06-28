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

public class Land implements DrawingObject {

	private double x,y,size;
	private Rectangle land1,land2,land3;
	private Line landOutline;

	//instantiates x and y coordinates, and size
	public Land (double x, double y, double size){
		this.x=x;
		this.y=y;
		this.size=size;
	}

	//method to draw out my sakura shape with scalable measurements
	@Override
	public void draw(Graphics2D g2d) {

		land1 = new Rectangle(x,y,(size),new Color(0,130,0));
		land2 = new Rectangle(x,y+10,(size),new Color(0,150,0));
		land3 = new Rectangle(x,y+20,(size),new Color(0,180,0));
		landOutline = new Line(0,720, 1280, 720, new BasicStroke(5f),new Color(0,0,0));
		landOutline.draw(g2d);
		land1.draw(g2d);
		land2.draw(g2d);
		land3.draw(g2d);
	}

	//to move the sakuras up
	public void moveH(){}
	public void moveV(){}
}