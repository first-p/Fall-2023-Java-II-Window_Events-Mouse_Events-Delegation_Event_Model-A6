/*File Proj06 Copyright 2020 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a program dealing with window events,
mouse events, and the Delegation Event Model.
Revised 10/29/22
************************************************************/
// Student must not modify the code in this file.
import java.awt.*;
public class Proj06 {
    public static void main(String[] args){
        Proj06Runner theRunner = new Proj06Runner();
        //IMPORTANT Your runner class must contain a method named
        // getFrame that returns a reference to the Frame object
        // in which you will display the coordinates.
        Frame theFrame = theRunner.getFrame();
        System.out.println(
                "The Frame width = " + theFrame.getWidth());
        System.out.println(
                "The Frame height = " + theFrame.getHeight());
        Insets theInsets = theFrame.getInsets();
        System.out.println(
                "Top border = " + theInsets.top + " pixels");
        System.out.println(
                "Left border = " + theInsets.left + " pixels");
        System.out.println(
                "Right border = " + theInsets.right + " pixels");
        System.out.println(
                "Bottom border = " + theInsets.bottom + " pixels");
    }//end main
}//end class Proj06
//========================================================//