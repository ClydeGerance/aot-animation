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
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {

    private int width;
    private int height;
    private Color bgColor;
    public ArrayList<DrawingObject> drawSky;
    public ArrayList<DrawingObject> drawClouds;
    public ArrayList<DrawingObject> drawSmoke;
    public ArrayList<DrawingObject> drawTitan;
    public ArrayList<DrawingObject> drawWall;
    public ArrayList<DrawingObject> drawEren;
    public ArrayList<DrawingObject> drawLand;
    public ArrayList<DrawingObject> drawFlower;
    public ArrayList<DrawingObject> drawWallDetail;

    public SceneCanvas(int w, int h, Color bgc) {
        width = w;
        height = h;
        bgColor = bgc;
        setPreferredSize(new Dimension(width, height));

        //sky
        drawSky = new ArrayList<DrawingObject>();
        drawSky.add(new Sky(0,0,1000));

        //clouds
        drawClouds = new ArrayList<DrawingObject>();
        drawClouds.add(new Clouds(50,60,50));
        drawClouds.add(new Clouds(250,80,70));
        drawClouds.add(new Clouds(520,100,95));
        drawClouds.add(new Clouds(850,45,50));
        drawClouds.add(new Clouds(1050,80,80));

        //smoke
        drawSmoke = new ArrayList<DrawingObject>();

        drawSmoke.add(new Smoke(0,265,60));
        drawSmoke.add(new Smoke(100,265,50));
        drawSmoke.add(new Smoke(200,265,65));
        drawSmoke.add(new Smoke(400,265,60));
        drawSmoke.add(new Smoke(900,265,50));
        drawSmoke.add(new Smoke(1000,265,65));

        drawSmoke.add(new Smoke(-50,265,55));
        drawSmoke.add(new Smoke(500,265,50));
        drawSmoke.add(new Smoke(600,265,65));
        drawSmoke.add(new Smoke(700,265,55));
        drawSmoke.add(new Smoke(800,265,60));
        drawSmoke.add(new Smoke(300,265,55));

        //titan
        drawTitan = new ArrayList<DrawingObject>();
        drawTitan.add(new Titan());

        //wall
        drawWall = new ArrayList<DrawingObject>();
        drawWall.add(new Wall());

        //land
        drawLand = new ArrayList<DrawingObject>();
        drawLand.add(new Land(0,720,1000));

        //flower
        drawFlower = new ArrayList<DrawingObject>();
        drawFlower.add(new Flower(50,750,15));
        drawFlower.add(new Flower(950,725,12));
        drawFlower.add(new Flower(80,750,14));
        drawFlower.add(new Flower(45,725,10));
        drawFlower.add(new Flower(920,750,15));
        drawFlower.add(new Flower(220,740,12));
        drawFlower.add(new Flower(680,750,14));
        drawFlower.add(new Flower(850,725,10));
        drawFlower.add(new Flower(780,750,15));
        drawFlower.add(new Flower(800,740,12));
        drawFlower.add(new Flower(132,725,14));
        drawFlower.add(new Flower(900,750,10));
        drawFlower.add(new Flower(250,750,12));
        drawFlower.add(new Flower(320,740,14));
        drawFlower.add(new Flower(670,725,10));

        //walldetail
        drawWallDetail = new ArrayList<DrawingObject>();
        drawWallDetail.add(new WallDetail(50,450,70));

        //eren
        drawEren = new ArrayList<DrawingObject>();
        drawEren.add(new Eren());

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(bgColor);
        g2d.fill(background);


        for (int i = 0; i < drawSky.size(); i++) {
            drawSky.get(i).draw(g2d);
        }

        for (int i = 0; i < drawClouds.size(); i++) {
            drawClouds.get(i).draw(g2d);

        }

        for (int i = 0; i < drawSmoke.size(); i++) {
            drawSmoke.get(i).draw(g2d);
        }

        for (int i = 0; i < drawTitan.size(); i++) {
            drawTitan.get(i).draw(g2d);
        }

        for (int i = 0; i < drawWall.size(); i++) {
            drawWall.get(i).draw(g2d);
        }

        for (int i = 0; i < drawLand.size(); i++) {
            drawLand.get(i).draw(g2d);
        }

        for (int i = 0; i < drawFlower.size(); i++) {
            drawFlower.get(i).draw(g2d);
        }

        for (int i = 0; i < drawWallDetail.size(); i++) {
            drawWallDetail.get(i).draw(g2d);
        }

        for (int i = 0; i < drawEren.size(); i++) {
            drawEren.get(i).draw(g2d);
        }

    }

    public ArrayList<DrawingObject> getSky() {
        return drawSky;
    }
    public ArrayList<DrawingObject> getClouds() {
        return drawClouds;
    }
    public ArrayList<DrawingObject> getSmoke() {
        return drawSmoke;
    }
    public ArrayList<DrawingObject> getTitan() {
        return drawTitan;
    }
    public ArrayList<DrawingObject> getWall() {
        return drawWall;
    }
    public ArrayList<DrawingObject> getLand() {
        return drawLand;
    }
    public ArrayList<DrawingObject> getWallDetail() {
        return drawWallDetail;
    }
    public ArrayList<DrawingObject> getEren() {
        return drawEren;
    }
}