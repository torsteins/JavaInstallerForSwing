package no.uib.inf101.app;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.io.IOException;

public class Main {

    static final String APP_NAME = "Sample App";

    public static void main(String[] args) throws IOException {
        // Set the name of the app on macOS menu bar (if applicable)
        System.setProperty("apple.awt.application.name", APP_NAME);

        // Create the main frame (a window)
        JFrame frame = new JFrame();
        frame.setContentPane(new MovingDot());

        // Configure the window
        frame.setTitle(APP_NAME); // text in title bar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(ImageIO.read(
                Main.class.getResourceAsStream("app-icon400.png")
        )); // icon in title bar (applies for Windows only)
        frame.pack(); // set size of frame to fit its content
        frame.setLocationRelativeTo(null); // center the frame on screen

        // Show the frame
        frame.setVisible(true);

    }
}