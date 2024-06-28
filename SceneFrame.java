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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class SceneFrame {

    private JFrame frame;
    private JButton button;
    private SceneCanvas sceneCanvas;
    private Timer timer1=null;
    private Timer timer2=null;
    private Timer timer3=null;
    private Timer timer4=null;

    public SceneFrame()     {
    
        frame = new JFrame();
        button = new JButton("SHINZOU WO SASAGEYO!");
        sceneCanvas = new SceneCanvas(1024,768,new Color(135,206,235));

        timer1 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                for (int i=0; i<sceneCanvas.drawTitan.size(); i++) {
                    sceneCanvas.getTitan().get(i).moveV();
                    sceneCanvas.repaint();
                }
            }
        });

        timer2 = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < sceneCanvas.drawEren.size(); i++) {
                    sceneCanvas.getEren().get(i).moveH();
                    sceneCanvas.repaint();
                }
            }

        });

        timer3 = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                for (int i=0; i<sceneCanvas.drawSmoke.size(); i++) {
                    sceneCanvas.getSmoke().get(i).moveH();;
                    sceneCanvas.repaint();
                }
            }
        });

        timer4 = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                for (int i=0; i<sceneCanvas.drawClouds.size(); i++) {
                    sceneCanvas.getClouds().get(i).moveH();
                    sceneCanvas.repaint();
                }
            }
        });
    }
    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Midterm Project- Gerance, Clyde Lester - 185503");
        
        cp.add(sceneCanvas, BorderLayout.CENTER);
        cp.add(button,BorderLayout.NORTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void setUpButtonListener() {
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);
    }
    
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timer1.start();
            timer2.start();
            timer3.start();
            timer4.start();
            playSound();
        }

    }

    //Method to play sound
    public void playSound() {
        try{
            File file = new File("AOT.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e){
        }
    }

        
   
    
}