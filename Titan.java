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

public class Titan implements DrawingObject {

    private double x,y,size;
    private Color color;
    int xVelocity = 1;
    int yVelocity = 1;

   
    public Titan() {
        this.x = x;
        this.y = y+300;
    }
    
    public void draw(Graphics2D g2d) {
    
    //body
        
    Path2D.Double body = new Path2D.Double();
    body.moveTo(391,y+314);
    body.curveTo(430,y+242.6,553.5,y+217,597.7,y+311);
    body.curveTo(558.3,y+336,440.6,y+325.5,391,y+314);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(body);
    
    Path2D.Double bodyL = new Path2D.Double();
    bodyL.moveTo(391,y+314);
    bodyL.curveTo(430,y+242.6,553.5,y+217,597.7,y+311);
    bodyL.curveTo(558.3,y+336,440.6,y+325.5,391,y+314);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(bodyL);
    
    
    //head

    Path2D.Double head = new Path2D.Double();
    head.moveTo(597,y+82);
    head.curveTo(461,y-19,315,y+125.5,420,y+247);
    head.curveTo(498.5,y+298,648.6,y+289.2,608.7,y+202.5);
    head.curveTo(614,y+197.9,618.3,y+184,615.7,y+176.5);
    head.curveTo(624.4,y+172.6,627.3,y+155.2,616.6,y+147);
    head.curveTo(622,y+135,611,y+91.5,597,y+82);
    g2d.setColor(new Color(248,237,197));
    g2d.fill(head);
    
    Path2D.Double headL = new Path2D.Double();
    headL.moveTo(597,y+82);
    headL.curveTo(461,y-19,315,y+125.5,420,y+247);
    headL.curveTo(498.5,y+298,648.6,y+289.2,608.7,y+202.5);
    headL.curveTo(614,y+197.9,618.3,y+184,615.7,y+176.5);
    headL.curveTo(624.4,y+172.6,627.3,y+155.2,616.6,y+147);
    headL.curveTo(622,y+135,611,y+91.5,597,y+82);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(headL);
        
        
    //eyes
        
    Path2D.Double eyes = new Path2D.Double();
    eyes.moveTo(622,y+158);
    eyes.curveTo(587.4,y+187.5,504.7,y+191.5,478,y+151.4);
    eyes.curveTo(413.4,y+139.7,453.3,y+257.6,537,y+213.4);
    eyes.curveTo(538.3,y+221,550.3,y+225.5,555.3,y+227);
    eyes.curveTo(561.1,y+224.2,567.6,y+217.8,570.5,y+214.2);
    eyes.curveTo(572.7,y+217.3,598.2,y+236.2,612.5,y+211.4);
    eyes.curveTo(605.2,y+200.9,617.4,y+195.4,615.9,y+176.6);
    eyes.curveTo(623.1,y+172.6,625.7,y+159.5,622,y+158);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(eyes);
    
    Path2D.Double n = new Path2D.Double();
    n.moveTo(552.4,y+174.1);
    n.curveTo(535.1,y+214.5,534.7,y+218.5,554.6,y+225.8);
    n.curveTo(578.4,y+212.7,565.6,y+210.2,551.3,y+172.4);
    g2d.setColor(new Color(248,237,197));
    g2d.fill(n);
        
    Path2D.Double eyesL = new Path2D.Double();
    eyesL.moveTo(622,y+158);
    eyesL.curveTo(587.4,y+187.5,504.7,y+191.5,478,y+151.4);
    eyesL.curveTo(413.4,y+139.7,453.3,y+257.6,537,y+213.4);
    eyesL.curveTo(538.3,y+221,550.3,y+225.5,555.3,y+227);
    eyesL.curveTo(561.1,y+224.2,567.6,y+217.8,570.5,y+214.2);
    eyesL.curveTo(572.7,y+217.3,598.2,y+236.2,612.5,y+211.4);
    eyesL.curveTo(605.2,y+200.9,617.4,y+195.4,615.9,y+176.6);
    eyesL.curveTo(623.1,y+172.6,625.7,y+159.5,622,y+158);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(eyesL);
    
    Line2D.Double line1 = new Line2D.Double(570.5,y+214.2,541.9,y+151);
    g2d.setColor(Color.BLACK);
    g2d.draw(line1);
    
    Line2D.Double line2 = new Line2D.Double(537,y+213.4,561.8,y+156.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(line2);
        
    Path2D.Double eb1 = new Path2D.Double();
    eb1.moveTo(524.6,y+177.9);
    eb1.curveTo(484.3,y+170.5,485.2,y+142.4,459.7,y+150.9);
    eb1.curveTo(424.7,y+166.6,454.3,y+228.2,514.1,y+205);
    eb1.curveTo(522,y+199.1,526.4,y+187.6,524.6,y+177.9);
    g2d.setColor(Color.BLACK);
    g2d.fill(eb1);
        
    Path2D.Double eb2 = new Path2D.Double();
    eb2.moveTo(570.2,y+179.7);
    eb2.curveTo(565.5,y+195.2,579.1,y+221.1,609,y+205);
    eb2.curveTo(618,y+191.9,616.7,y+181.2,616.2,y+177);
    eb2.curveTo(622.3,y+174,624.6,y+166.6,623.8,y+161.6);
    eb2.curveTo(607.2,y+158.5,608.3,y+173.8,570.2,y+179.7);
    g2d.setColor(Color.BLACK);
    g2d.fill(eb2);
    
    Ellipse2D.Double c = new Ellipse2D.Double(456.8,y+176,20,20);
    g2d.setColor(Color.WHITE);
    g2d.fill(c);

    Ellipse2D.Double c1 = new Ellipse2D.Double(576.2,y+186,15,15);
    g2d.setColor(Color.WHITE);
    g2d.fill(c1);
        
    
    //mouth
          
    Path2D.Double mC = new Path2D.Double();
    mC.moveTo(580.5,y+261.4);
    mC.curveTo(624.3,y+224.6,477.4,y+216.3,492,y+267.2);
    mC.curveTo(506.1,y+266,548,y+255.4,580.5,y+261.4);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(mC);
    
    Path2D.Double tC = new Path2D.Double();
    tC.moveTo(582.4,y+243);
    tC.curveTo(565.5,y+243,525,y+244.2,501,y+243.2);
    tC.curveTo(495.7,y+249.8,493.6,y+255,493.3,y+260.9);
    tC.curveTo(516,y+262.4,557,y+255.9,580.7,y+259.9);
    tC.curveTo(582.5,y+253.8,585.1,y+246,582.4,y+243);
    g2d.setColor(Color.WHITE);
    g2d.fill(tC);
    
    Path2D.Double lineC = new Path2D.Double();
    lineC.moveTo(499.6,y+242.8);
    lineC.curveTo(519,y+245,559,y+244,584.6,y+243.3);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineC);
    
    Path2D.Double lineC1 = new Path2D.Double();
    lineC1.moveTo(494.3,y+251.4);
    lineC1.curveTo(520.7,y+253.4,560.2,y+250.8,584,y+251.4);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineC1);
        
    Path2D.Double hC = new Path2D.Double();
    hC.moveTo(574,y+260.7);
    hC.curveTo(577.4,y+249,574.7,y+239.3,571.7,y+234.7);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hC);
        
    Path2D.Double hC1 = new Path2D.Double();
    hC1.moveTo(555.2,y+259);
    hC1.curveTo(557.8,y+249,556.2,y+240,554.2,y+233.3);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hC1);
        
    Path2D.Double hC2 = new Path2D.Double();
    hC2.moveTo(534.3,y+260.2);
    hC2.curveTo(533.4,y+249.3,534.7,y+243,535.8,y+233.9);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hC2);
        
    Path2D.Double hC3 = new Path2D.Double();
    hC3.moveTo(512.4,y+263);
    hC3.curveTo(513.1,y+251,513.7,y+245.7,515.2,y+237);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hC3);
    
    Path2D.Double mCL = new Path2D.Double();
    mCL.moveTo(580.5,y+261.4);
    mCL.curveTo(624.3,y+224.6,477.4,y+216.3,492,y+267.2);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(mCL);
        
    //
    
    Path2D.Double mL = new Path2D.Double();
    mL.moveTo(479.4,y+265.6);
    mL.curveTo(500.7,y+232.7,449.4,y+220.7,442.7,y+194.8);
    mL.curveTo(426.8,y+236.5,446.4,y+262.3,479.4,y+265.6);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(mL);
        
    Path2D.Double tL = new Path2D.Double();
    tL.moveTo(436.8,y+219.6);
    tL.curveTo(455.3,y+251.3,494,y+225,482,y+259.3);
    tL.curveTo(447.3,y+249,438,y+251.8,436.8,y+219.6);
    g2d.setColor(Color.WHITE);
    g2d.fill(tL);
        
    Path2D.Double lineL = new Path2D.Double();
    lineL.moveTo(436.8,y+219.6);
    lineL.curveTo(455.3,y+251.3,494,y+225,482,y+259.3);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineL);
    
    Path2D.Double lineL1 = new Path2D.Double();
    lineL1.moveTo(439.3,y+233.8);
    lineL1.curveTo(452.6,y+242.4,467.1,y+249.5,482.4,y+250);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineL1);
        
    Path2D.Double lineL2 = new Path2D.Double();
    lineL2.moveTo(481.1,y+258.1);
    lineL2.curveTo(466.4,y+256.8,455.4,y+252.7,445.4,y+247);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineL2);
        
    Path2D.Double hL = new Path2D.Double();
    hL.moveTo(475,y+264.2);
    hL.curveTo(474.1,y+257.8,474.4,y+246.8,477.4,y+235.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hL);
        
    Path2D.Double hL1 = new Path2D.Double();
    hL1.moveTo(457.6,y+257.7);
    hL1.curveTo(455.1,y+250.6,457,y+235.6,461.5,y+222.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hL1);
        
    Path2D.Double hL2 = new Path2D.Double();
    hL2.moveTo(442,y+242.9);
    hL2.curveTo(442.2,y+232.9,441.7,y+219.9,449.3,y+205.2);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(hL2);
    
    //  

    Path2D.Double mLL = new Path2D.Double();
    mLL.moveTo(479.4,y+265.6);
    mLL.curveTo(500.7,y+232.7,449.4,y+220.7,442.7,y+194.8);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(mLL);
        
    Path2D.Double mR = new Path2D.Double();
    mR.moveTo(590,y+262.3);
    mR.curveTo(591,y+234.6,610.5,y+228.6,613.5,y+219.9);
    mR.curveTo(618.3,y+233.9,608.5,y+260.5,590,y+262.3);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(mR);
                 
    Path2D.Double tR = new Path2D.Double();
    tR.moveTo(613.7,y+232.7);
    tR.curveTo(592.9,y+244.8,590.8,y+249.3,591.9,y+260.3);
    tR.curveTo(604.3,y+259.1,613.7,y+248.7,613.7,y+232.7);
    g2d.setColor(Color.WHITE);
    g2d.fill(tR);
    
    Path2D.Double lineR = new Path2D.Double();
    lineR.moveTo(595.2,y+243.8);
    lineR.curveTo(604.4,y+239,610.5,y+235.6,615.4,y+230.3);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineR);
    
    Path2D.Double lineR1 = new Path2D.Double();
    lineR1.moveTo(592.3,y+253);
    lineR1.curveTo(603.8,y+248.8,608.6,y+245.6,615,y+238.7);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(2));
    g2d.draw(lineR1);
        
    Path2D.Double mRL = new Path2D.Double();
    mRL.moveTo(590,y+262.3);
    mRL.curveTo(591,y+234.6,610.5,y+228.6,613.5,y+219.9);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(mRL);
    
    
    Path2D.Double uL = new Path2D.Double();
    uL.moveTo(609.4,y+250.1);
    uL.curveTo(602.2,y+257.6,594.1,y+261.4,584.4,y+264.5);
    uL.curveTo(566.1,y+255.4,521.6,y+259.9,500.6,y+267.4);
    uL.curveTo(463.4,y+265.1,424.2,y+257.6,441.4,y+196.1);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(uL);
        
    
    //ear 
        
    Path2D.Double ear = new Path2D.Double();
    ear.moveTo(436,y+253.2);
    ear.curveTo(410.6,y+219.3,441.9,y+219,426.7,y+192.8);
    ear.curveTo(430.7,y+182.5,455.8,y+166.6,411.6,y+148.8);
    ear.curveTo(381.7,y+163,388.7,y+207.3,417.5,y+218.7);
    ear.curveTo(446.2,y+206.5,379,y+187.7,409.2,y+161);
    ear.curveTo(445.7,y+180,406.8,y+175.4,420.2,y+195.7);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(ear);
    
    Path2D.Double earL = new Path2D.Double();
    earL.moveTo(420.7,y+178.8);
    earL.curveTo(414.8,y+165,406.8,y+175.4,409.7,y+183);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(earL);
        
    
    //flesh
    
    Path2D.Double f = new Path2D.Double();
    f.moveTo(464.5,y+140.5);
    f.curveTo(455,y+60.3,369.6,y+137.7,442,y+154);
    f.curveTo(442.4,y+149.3,459,y+140.5,464.5,y+140.5);
    g2d.setColor(new Color(215,97,75));
    g2d.fill(f);
        
    Path2D.Double fL = new Path2D.Double();
    fL.moveTo(464.5,y+140.5);
    fL.curveTo(455,y+60.3,369.6,y+137.7,442,y+154);
    fL.curveTo(442.4,y+149.3,459,y+140.5,464.5,y+140.5);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(fL);
    
    // wrinkles
    
    Path2D.Double w = new Path2D.Double();
    w.moveTo(498.2,y+119);
    w.curveTo(506.5,y+128,507.3,y+130,517.6,y+143.4);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w);
    
    Path2D.Double w1 = new Path2D.Double();
    w1.moveTo(514.2,y+109.6);
    w1.curveTo(520.7,y+124,521.8,y+128.5,527.3,y+142);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w1);
    
    Path2D.Double w2 = new Path2D.Double();
    w2.moveTo(534.2,y+110.5);
    w2.curveTo(538.6,y+120.4,541.5,y+132.4,542.7,y+142);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w2);
    
    Path2D.Double w3 = new Path2D.Double();
    w3.moveTo(551.5,y+113.5);
    w3.curveTo(552.8,y+122.2,552.7,y+131.8,552.4,y+140.2);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w3);
        
    Path2D.Double w4 = new Path2D.Double();
    w4.moveTo(570.3,y+112.4);
    w4.curveTo(571.3,y+123.8,568.6,y+131.5,562.2,y+144.4);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w4);
    
    Path2D.Double w5 = new Path2D.Double();
    w5.moveTo(588,y+120);
    w5.curveTo(585.8,y+128.4,582.3,y+136,573.4,y+145.4);
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(w5);
            
    }
    



    public void moveH(){}

    public void moveV(){
        if (y<-10) {
            yVelocity = yVelocity * -1;
        }

        else if (y == -10) {
            y=y;
        }
        else {
            y = y - yVelocity;
        }
    }
}