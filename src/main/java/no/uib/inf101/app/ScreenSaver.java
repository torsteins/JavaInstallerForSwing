package no.uib.inf101.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ScreenSaver extends JPanel {
    public static final Dimension defaultDimension = new Dimension(300, 150);
    private double x = 0.5;

    public ScreenSaver() {
        this.setPreferredSize(defaultDimension);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> x -= 0.1;
                    case KeyEvent.VK_RIGHT -> x += 0.1;
                }
                ScreenSaver.this.repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval((int) (x * getWidth())-25, 75, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("Move dot with left and right arrow keys", 10, 20);

    }
}
