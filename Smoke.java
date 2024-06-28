
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

public class Smoke implements DrawingObject {

    private double x,y,size;
    private Ellipse smoke1,smoke2,smoke3,smoke4,smoke5;
    private Ellipse smokeOutline1,smokeOutline2,smokeOutline3,smokeOutline4,smokeOutline5;
    private Color color;
    //    private boolean sideways = false;
    int xVelocity = 10;
    int yVelocity = 1;

    //instantiates x and y coordinates, and size
    //Also includes scalable measurements of the clouds
    public Smoke(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;

    }

    //method to draw the cloud
    @Override
    public void draw(Graphics2D g2d) {
        smokeOutline1 = new Ellipse( (x+size*-.3)-3,y-size*-.3,(size*.8)+5,(size*.5)+5,Color.BLACK);
        smokeOutline2 = new Ellipse(x-2,y-2,size+7,size+7,Color.BLACK);
        smokeOutline3 = new Ellipse((x+size*.35)-2,(y-size*.3)-2,(size*1.75)+7,(size*1.4)+7,Color.BLACK);
        smokeOutline4 = new Ellipse((x+size*1.5),(y+size*.15),(size*.9)+5,(size*.9)+5,Color.BLACK);
        smokeOutline5 = new Ellipse(x+size*2,(y+size*.5)-2,(size*.8)+5,(size*.5)+5,Color.BLACK);


        smoke1 = new Ellipse(x+size*-.3,y-size*-.3,size*.8,size*.5,new Color(53,56,57));
        smoke2 = new Ellipse(x,y,size,size,new Color(53,56,57));
        smoke3 = new Ellipse(x+size*.35,y-size*.3,size*1.75,size*1.4,new Color(53,56,57));
        smoke4 = new Ellipse(x+size*1.5,y+size*.15,size*.9,size*.9,new Color(53,56,57));
        smoke5 = new Ellipse(x+size*2,y+size*.5,size*.8,size*.5,new Color(53,56,57));

        smokeOutline1.draw(g2d);
        smokeOutline2.draw(g2d);
        smokeOutline3.draw(g2d);
        smokeOutline4.draw(g2d);
        smokeOutline5.draw(g2d);
        smoke1.draw(g2d);
        smoke2.draw(g2d);
        smoke3.draw(g2d);
        smoke4.draw(g2d);
        smoke5.draw(g2d);

    }

    public void moveH(){

        if (x<=400) {
            x = x - xVelocity;

        }
        if (x<=400 && x == -100){
            x = 400;
        }

        if(x>400){
            x = x + xVelocity;
        }
        if(x>400 && x==1020){
            x = 450;
        }
    }
    public void moveV(){}


}