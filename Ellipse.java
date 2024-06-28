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

public class Ellipse implements DrawingObject {

	private double x,y;
	private double size1,size2;
	private Color color;

	//instantiates x and y coordinates, size 1 and size2, and color
	public Ellipse (double x, double y, double size1, double size2, Color color){
		this.x=x;
		this.y=y;
		this.size1=size1;
		this.size2=size2;
		this.color=color;
	}

	//method to draw ellipse shape
	@Override
	public void draw(Graphics2D g2d) {
		Ellipse2D.Double ellipse = new Ellipse2D.Double(x,y,size1,size2);
		g2d.setColor(color);
		g2d.fill(ellipse);
	}

	public void moveH(){}
	public void moveV(){}


}