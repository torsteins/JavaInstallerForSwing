package no.uib.inf101.app;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent window = new ScreenSaver();
        frame.setContentPane(window);
        frame.pack();
        frame.setVisible(true);
    }
}