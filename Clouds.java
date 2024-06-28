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

Bro Code. (2020, September 10). Java 2D animation. www.youtube.com. https://www.youtube.com/watch?v=tHNWIWxRDDA

StackOverflow. (2011). How to set a Timer in Java? Stack Overflow. https://stackoverflow.com/questions/4044726/how-to-set-a-timer-in-java

Tabnine. (n.d.). javax.swing.JComponent.requestFocusInWindow java code examples | Tabnine. www.tabnine.com. Retrieved March 9, 2023, from https://www.tabnine.com/code/java/methods/javax.swing.JComponent/requestFocusInWindow
*/

import java.awt.*;
import java.awt.geom.*;

public class Clouds implements DrawingObject {
    private double x,y,size;
    private Ellipse cloud1,cloud2,cloud3,cloud4,cloud5;
    private Ellipse cloudOutline1,cloudOutline2,cloudOutline3,cloudOutline4,cloudOutline5;
    int xVelocity = 1;
    int yVelocity = 1;


    //instantiates x and y coordinates, and size
    //Also includes scalable measurements of the clouds
    public Clouds(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    //method to draw the cloud
    @Override
    public void draw(Graphics2D g2d) {
        //cloud_outline
        cloudOutline1 = new Ellipse( (x+size*-.3)-3,y-size*-.3,(size*.8)+5,(size*.5)+5,Color.BLACK);
        cloudOutline2 = new Ellipse(x-2,y-2,size+7,size+7,Color.BLACK);
        cloudOutline3 = new Ellipse((x+size*.35)-2,(y-size*.3)-2,(size*1.75)+7,(size*1.4)+7,Color.BLACK);
        cloudOutline4 = new Ellipse((x+size*1.5),(y+size*.15),(size*.9)+5,(size*.9)+5,Color.BLACK);
        cloudOutline5 = new Ellipse(x+size*2,(y+size*.5)-2,(size*.8)+5,(size*.5)+5,Color.BLACK);
        //white_cloud
        cloud1 = new Ellipse(x+size*-.3,y-size*-.3,size*.8,size*.5,Color.WHITE);
        cloud2 = new Ellipse(x,y,size,size,Color.WHITE);
        cloud3 = new Ellipse(x+size*.35,y-size*.3,size*1.75,size*1.4,Color.WHITE);
        cloud4 = new Ellipse(x+size*1.5,y+size*.15,size*.9,size*.9,Color.WHITE);
        cloud5 = new Ellipse(x+size*2,y+size*.5,size*.8,size*.5,Color.WHITE);

        cloudOutline1.draw(g2d);
        cloudOutline2.draw(g2d);
        cloudOutline3.draw(g2d);
        cloudOutline4.draw(g2d);
        cloudOutline5.draw(g2d);
        cloud1.draw(g2d);
        cloud2.draw(g2d);
        cloud3.draw(g2d);
        cloud4.draw(g2d);
        cloud5.draw(g2d);
    }

    public void moveH(){
        if (x < x-10 || x > x+10) {
            xVelocity = xVelocity *-1;
        }
        if (x < -300){
            x = 1020;
        }
        x=x - xVelocity;
    }
    public void moveV(){}

}