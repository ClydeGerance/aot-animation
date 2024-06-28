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

public class Line implements DrawingObject {

	private double x,y,x2,y2;
	private Stroke thickness;
	private Color color;
	private int delayStart;

	//instantiates x and y coordinates, x2 and y2 coordinates, thickness and color
	public Line (double x, double y, double x2, double y2, Stroke thickness, Color color) {
		this.x=x;
		this.y=y;
		this.x2=x2;
		this.y2=y2;
		this.thickness=thickness;
		this.color=color;
	}
	
	//method to draw lines
	@Override
	public void draw(Graphics2D g2d) {
		Line2D.Double line = new Line2D.Double(x,y,x2,y2);
		g2d.setStroke(thickness);
		g2d.setColor(color);
		g2d.draw(line);
	}

	public void moveH(){}
	public void moveV(){}

}
