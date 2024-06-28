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

public class Eren implements DrawingObject {

    private double x,y,size;
    private Color color;
    int xVelocity = 1;
    int yVelocity = 1;

    public Eren() {

        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d) {
    // hair
        
    Path2D.Double hair = new Path2D.Double();
    hair.moveTo(x+522.3,y+486.8);
    hair.curveTo(x+494,y+478.6,x+498,y+498.1,x+465,y+522.8);
    hair.curveTo(x+466.5,y+524.8,x+471.9,y+526.15,x+475.7,y+526.3);
    hair.curveTo(x+464.5,y+535.4,x+479.3,y+543.5,x+467.2,y+554.15);
    hair.curveTo(x+472.6,y+556.2,x+477.35,y+554.5,x+481.2,y+550.9);
    hair.curveTo(x+479.6,y+592.5,x+566,y+625,x+585.2,y+554.8);
    hair.curveTo(x+587.2,y+558.1,x+590,y+560.6,x+594.7,y+561.2);
    hair.curveTo(x+586.4,y+551.3,x+593.3,y+546.4,x+587.5,y+540.2);
    hair.curveTo(x+591.3,y+541.1,x+594.5,y+541,x+597.6,y+539.6);
    hair.curveTo(x+582.4,y+528.9,x+598.8,y+520.2,x+583.1,y+514);
    hair.curveTo(x+586.17,y+513.25,x+589.17,y+511.7,x+591.15,y+508.7);
    hair.curveTo(x+561.2,y+498.25,x+564,y+476.7,x+533.2,y+483.5);
    hair.curveTo(x+534.9,y+481.2,x+539.25,y+478.25,x+542.3,y+476.75);
    hair.curveTo(x+535.6,y+475.9,x+524.7,y+475.7,x+522.3,y+486.8);
    g2d.setColor(new Color(86,50,13));
    g2d.fill(hair);
    
    Path2D.Double hairL = new Path2D.Double();
    hairL.moveTo(x+522.3,y+486.8);
    hairL.curveTo(x+494,y+478.6,x+498,y+498.1,x+465,y+522.8);
    hairL.curveTo(x+466.5,y+524.8,x+471.9,y+526.15,x+475.7,y+526.3);
    hairL.curveTo(x+464.5,y+535.4,x+479.3,y+543.5,x+467.2,y+554.15);
    hairL.curveTo(x+472.6,y+556.2,x+477.35,y+554.5,x+481.2,y+550.9);
    hairL.curveTo(x+479.6,y+592.5,x+566,y+625,x+585.2,y+554.8);
    hairL.curveTo(x+587.2,y+558.1,x+590,y+560.6,x+594.7,y+561.2);
    hairL.curveTo(x+586.4,y+551.3,x+593.3,y+546.4,x+587.5,y+540.2);
    hairL.curveTo(x+591.3,y+541.1,x+594.5,y+541,x+597.6,y+539.6);
    hairL.curveTo(x+582.4,y+528.9,x+598.8,y+520.2,x+583.1,y+514);
    hairL.curveTo(x+586.17,y+513.25,x+589.17,y+511.7,x+591.15,y+508.7);
    hairL.curveTo(x+561.2,y+498.25,x+564,y+476.7,x+533.2,y+483.5);
    hairL.curveTo(x+534.9,y+481.2,x+539.25,y+478.25,x+542.3,y+476.75);
    hairL.curveTo(x+535.6,y+475.9,x+524.7,y+475.7,x+522.3,y+486.8);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(hairL);
    
    // pants
    
    Path2D.Double pants = new Path2D.Double();
    pants.moveTo(x+568,y+680.3);
    pants.curveTo(x+550.9,y+677.1,x+515,y+675.4,x+501.4,y+680.5);
    pants.curveTo(x+502.6,y+695,x+503.7,y+709.2,x+504.8,y+722);
    pants.curveTo(x+510.9,y+725.5,x+522.8,y+725.8,x+528.2,y+723.7);
    pants.curveTo(x+524.2,y+673.1,x+542,y+672.5,x+546,y+722.8);
    pants.curveTo(x+551.6,y+724,x+565,y+724.8,x+569.6,y+720.6);
    pants.curveTo(x+565.2,y+704.4,x+571.2,y+695,x+568,y+680.3);
    g2d.setColor(new Color(176,143,101));
    g2d.fill(pants);
       
    Path2D.Double pantsL = new Path2D.Double();
    pantsL.moveTo(x+568,y+680.3);
    pantsL.curveTo(x+550.9,y+677.1,x+515,y+675.4,x+501.4,y+680.5);
    pantsL.curveTo(x+502.6,y+695,x+503.7,y+709.2,x+504.8,y+722);
    pantsL.curveTo(x+510.9,y+725.5,x+522.8,y+725.8,x+528.2,y+723.7);
    pantsL.curveTo(x+524.2,y+673.1,x+542,y+672.5,x+546,y+722.8);
    pantsL.curveTo(x+551.6,y+724,x+565,y+724.8,x+569.6,y+720.6);
    pantsL.curveTo(x+565.2,y+704.4,x+571.2,y+695,x+568,y+680.3);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(pantsL);
    
    // swords
    Path2D.Double handle = new Path2D.Double();
    handle.moveTo(x+484,y+678.7);
    handle.curveTo(x+479.6,y+674.9,x+476.6,y+671,x+471.9,y+665.3);
    handle.curveTo(x+471.5,y+675.5,x+460.6,y+672,x+476.3,y+684.4);
    handle.curveTo(x+478.7,y+683.1,x+480.6,y+681.5,x+484,y+678.7);
    g2d.setColor(Color.BLACK);
    g2d.fill(handle);
    
    Path2D.Double sword1 = new Path2D.Double();
    sword1.moveTo(x+469.5,y+674.9);
    sword1.curveTo(x+469.9,y+674.7,x+374.5,y+749.2,x+374.6,y+749.3);
    sword1.curveTo(x+386.4,y+758.8,x+428.4,y+720.2,x+477.8,y+681.4);
    sword1.curveTo(x+474.6,y+679.1,x+472.2,y+676.9,x+469.5,y+674.9);
    g2d.setColor(new Color(166,166,166));
    g2d.fill(sword1);
    
    Path2D.Double sword1L = new Path2D.Double();
    sword1L.moveTo(x+469.5,y+674.9);
    sword1L.curveTo(x+469.9,y+674.7,x+374.5,y+749.2,x+374.6,y+749.3);
    sword1L.curveTo(x+386.4,y+758.8,x+428.4,y+720.2,x+477.8,y+681.4);
    sword1L.curveTo(x+474.6,y+679.1,x+472.2,y+676.9,x+469.5,y+674.9);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(sword1L);

    Path2D.Double sword2 = new Path2D.Double();
    sword2.moveTo(x+563,y+660.1);
    sword2.curveTo(x+563.2,y+660.7,x+668.7,y+742,x+668.6,y+742);
    sword2.curveTo(x+658.8,y+752.1,x+578.3,y+685.4,x+567.8,y+677.4);
    sword2.curveTo(x+566,y+670.4,x+565,y+665.4,x+563,y+660.1);
    g2d.setColor(new Color(166,166,166));
    g2d.fill(sword2);
    
    Path2D.Double sword2L = new Path2D.Double();
    sword2L.moveTo(x+563,y+660.1);
    sword2L.curveTo(x+563.2,y+660.7,x+668.7,y+742,x+668.6,y+742);
    sword2L.curveTo(x+658.8,y+752.1,x+578.3,y+685.4,x+567.8,y+677.4);
    sword2L.curveTo(x+566,y+670.4,x+565,y+665.4,x+563,y+660.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(sword2L);
    
    //hand
    
    Path2D.Double hand = new Path2D.Double();
    hand.moveTo(x+492.2,y+668);
    hand.curveTo(x+484.5,y+684.8,x+467.7,y+678,x+480.2,y+659);
    hand.curveTo(x+484.9,y+661.2,x+488.3,y+665.2,x+492.2,y+668);
    g2d.setColor(new Color(223,201,182));
    g2d.fill(hand);
    
    Path2D.Double handL = new Path2D.Double();
    handL.moveTo(x+492.2,y+668);
    handL.curveTo(x+484.5,y+684.8,x+467.7,y+678,x+480.2,y+659);
    handL.curveTo(x+484.9,y+661.2,x+488.3,y+665.2,x+492.2,y+668);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));   
    g2d.draw(handL);
    
    // top
        
    Path2D.Double top = new Path2D.Double();
    top.moveTo(x+560.6,y+593);
    top.curveTo(x+542.4,y+585.1,x+526.9,y+585.6,x+510.6,y+593.2);
    top.curveTo(x+510.6,y+595.8,x+510.7,y+598.6,x+511,y+601);
    top.curveTo(x+501.8,y+601.55,x+492.1,y+610.9,x+494.5,y+632.1);
    top.curveTo(x+491.54,y+631.2,x+492.5,y+634.45,x+492.96,y+636.8);
    top.curveTo(x+490.28,y+638.1,x+489.6,y+638.87,x+490.2,y+642.04);
    top.curveTo(x+487.9,y+646.65,x+483.1,y+653.2,x+479.7,y+657.7);
    top.curveTo(x+481.5,y+662.75,x+488.7,y+670.8,x+492.3,y+670.7);
    top.curveTo(x+500.8,y+663.3,x+505.1,y+657,x+510.1,y+647.8);
    top.curveTo(x+505.9,y+660.7,x+504.3,y+666.1,x+502.2,y+683.05);
    top.curveTo(x+521.6,y+681.8,x+552.05,y+682.2,x+569.8,y+684);
    top.curveTo(x+574,y+674,x+576.1,y+664.7,x+575.3,y+657.3);
    top.curveTo(x+588,y+645.4,x+573.6,y+603.2,x+559,y+599.9);
    top.curveTo(x+559.4,y+598.4,x+559.8,y+596.6,x+560.6,y+593);
    g2d.setColor(new Color(87,21,17));
    g2d.fill(top);
    
    Path2D.Double topL = new Path2D.Double();
    topL.moveTo(x+560.6,y+593);
    topL.curveTo(x+542.4,y+585.1,x+526.9,y+585.6,x+510.6,y+593.2);
    topL.curveTo(x+510.6,y+595.8,x+510.7,y+598.6,x+511,y+601);
    topL.curveTo(x+501.8,y+601.55,x+492.1,y+610.9,x+494.5,y+632.1);
    topL.curveTo(x+491.54,y+631.2,x+492.5,y+634.45,x+492.96,y+636.8);
    topL.curveTo(x+490.28,y+638.1,x+489.6,y+638.87,x+490.2,y+642.04);
    topL.curveTo(x+487.9,y+646.65,x+483.1,y+653.2,x+479.7,y+657.7);
    topL.curveTo(x+481.5,y+662.75,x+488.7,y+670.8,x+492.3,y+670.7);
    topL.curveTo(x+500.8,y+663.3,x+505.1,y+657,x+510.1,y+647.8);
    topL.curveTo(x+505.9,y+660.7,x+504.3,y+666.1,x+502.2,y+683.05);
    topL.curveTo(x+521.6,y+681.8,x+552.05,y+682.2,x+569.8,y+684);
    topL.curveTo(x+574,y+674,x+576.1,y+664.7,x+575.3,y+657.3);
    topL.curveTo(x+588,y+645.4,x+573.6,y+603.2,x+559,y+599.9);
    topL.curveTo(x+559.4,y+598.4,x+559.8,y+596.6,x+560.6,y+593);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(topL);
    
    // boots
        
    Path2D.Double boot1 = new Path2D.Double();
    boot1.moveTo(x+528.4,y+714.6);
    boot1.curveTo(x+525.6,y+723.5,x+503.9,y+724.3,x+503.3,y+713.1);
    boot1.curveTo(x+495.2,y+714.5,x+507.1,y+727.6,x+506.5,y+746.7);
    boot1.curveTo(x+490.3,y+757.7,x+499.2,y+774.6,x+527.5,y+758.7);
    boot1.curveTo(x+523.5,y+743,x+537.3,y+710.4,x+528.4,y+714.6);
    g2d.setColor(Color.BLACK);
    g2d.fill(boot1);
    
    Path2D.Double boot2 = new Path2D.Double();
    boot2.moveTo(x+569.7,y+714.1);
    boot2.curveTo(x+564.5,y+722.9,x+550.5,y+724.9,x+543.3,y+714);
    boot2.curveTo(x+535.1,y+715.7,x+555.2,y+732.5,x+547,y+757.3);
    boot2.curveTo(x+535.6,y+769.5,x+581.5,y+770.8,x+571.9,y+754.8);
    boot2.curveTo(x+565.4,y+742.1,x+578.4,y+707.6,x+569.7,y+714.1);
    g2d.setColor(Color.BLACK);
    g2d.fill(boot2);
        
    // logo
    
    Path2D.Double logo = new Path2D.Double();
    logo.moveTo(x+557.7,y+606.8);
    logo.curveTo(x+550.2,y+603,x+535.8,y+602.6,x+526.6,y+605);
    logo.curveTo(x+524.4,y+630.8,x+524.6,y+631,x+542.7,y+637.1);
    logo.curveTo(x+558.7,y+632.4,x+558.3,y+632.3,x+557.7,y+606.8);
    g2d.setColor(Color.WHITE);
    g2d.fill(logo);
    
    Path2D.Double logoL = new Path2D.Double();
    logoL.moveTo(x+557.7,y+606.8);
    logoL.curveTo(x+550.2,y+603,x+535.8,y+602.6,x+526.6,y+605);
    logoL.curveTo(x+524.4,y+630.8,x+524.6,y+631,x+542.7,y+637.1);
    logoL.curveTo(x+558.7,y+632.4,x+558.3,y+632.3,x+557.7,y+606.8);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(logoL);
    
    Path2D.Double crossH = new Path2D.Double();
    crossH.moveTo(x+526,y+617.1);
    crossH.curveTo(x+537.9,y+616.4,x+547.1,y+616.8,x+556.5,y+618.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(crossH);
    
    Path2D.Double crossV = new Path2D.Double();
    crossV.moveTo(x+541.5,y+635.5);
    crossV.curveTo(x+541.6,y+636,x+542.2,y+603.2,x+542.3,y+603);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(crossV);
    
    Path2D.Double s1 = new Path2D.Double();
    s1.moveTo(x+548.9,y+636.3);
    s1.curveTo(x+541.6,y+625.7,x+536.2,y+617.6,x+525.5,y+602.7);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(s1);
    
    Path2D.Double s2 = new Path2D.Double();
    s2.moveTo(x+536.3,y+634);
    s2.curveTo(x+536.4,y+633.5,x+557.8,y+603.6,x+557.8,y+604.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(s2);
    
    Line2D.Double h1 = new Line2D.Double(x+537.7,y+633.1,x+533.5,y+637.8);
    g2d.setStroke(new BasicStroke(5));
    g2d.draw(h1);
    
    Line2D.Double h2 = new Line2D.Double(x+549.6,y+637.8,x+545.5,y+632.6);
    g2d.setStroke(new BasicStroke(5));
    g2d.draw(h2);
    }
    public void moveV(){}

    public void moveH(){
        if (x>=90 || x<-100) {
            xVelocity = xVelocity *-1;
        }
        x=x - xVelocity;
    }

}