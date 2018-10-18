package week5_6;


import javax.swing.*;
import java.awt.*;

public class Diagram {
    /**
     * Main Frame
     * @param abc
     */
    public static void main(String[] abc) {

            JFrame frame = new JFrame();
            frame.setTitle("Test");

            Layer object = new Layer();
            // add draw method to frame
            frame.add(object);
            // call drawing method
            //object.drawing();
            frame.setVisible(true);
            frame.setSize(600,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


