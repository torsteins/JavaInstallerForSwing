package no.uib.inf101.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovingDot extends JPanel {
    private int x = 150;

    public MovingDot() {
        this.setPreferredSize(new Dimension(300, 150));
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> x -= 10;
                    case KeyEvent.VK_RIGHT -> x += 10;
                }
                MovingDot.this.repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x-25, 75, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("Move dot with left and right arrow keys", 10, 20);
    }
}
