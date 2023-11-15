/****************************************
 File: Proj06runner.java
 Author: Fred Butoma
 Purpose: Proj06Runner.java is a class that implements a JFrame window
 and event handling for user interation with window itself as well as
 mouse events inside the window
 ****************************************/

import java.awt.*;
import java.awt.event.*;

public class Proj06Runner {
    MyFrame displayWindow;

    // Constructor for Proj06Runner
    public Proj06Runner() {
        // Create a new MyFrame object, set size, title, make it visible
        //and add event listeners for the window as well as mouse events
        displayWindow = new MyFrame();
        displayWindow.setSize(300, 100);
        displayWindow.setTitle("Fred Butoma");
        displayWindow.setVisible(true);

        // Instantiate and register a Listener object to terminate
        // the program when the user closes the Frame.
        displayWindow.addWindowListener(new WProc1());

        // Instantiate and register a Listener object that will
        // process mouse events to determine and display the
        // coordinates when the user presses the mouse button.
        displayWindow.addMouseListener(new MouseProc(displayWindow));
    }//end constructor

    // This method returns the frame
    public Frame getFrame() {
        return displayWindow;
    }//end getFrame()

    // Inner class MyFrame to override the paint method
    class MyFrame extends Frame {
        int clickX;
        int clickY;

        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.drawString("" + clickX + ", " + clickY, clickX, clickY);
        }//end paint
    }//end class MyFrame

    // Inner class MouseProc to handle mouse events
    class MouseProc extends MouseAdapter {
        MyFrame refToWin;

        //save a reference to the source
        MouseProc(MyFrame inWin) {
            refToWin = inWin;
        }//end constructor

        public void mousePressed(MouseEvent e) {
            //Get X and Y coordinates of mouse pointer and store
            // in an instance variable of the Frame object
            refToWin.clickX = e.getX();
            refToWin.clickY = e.getY();

            //Force the Frame object to be repainted in order to
            // display the coordinate information.
            refToWin.repaint();
        }//end mousePressed()
    }//end class MouseProc

    // Inner class WProc1 to handle window closing events
    class WProc1 extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }//end windowClosing
    }//end class WProc1

}//end public class Proj06Runner

