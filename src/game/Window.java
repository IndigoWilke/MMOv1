package game;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        this.setPreferredSize(new Dimension(400, 400));
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // define the position
        int locX = 50;
        int locY = 200;

        // draw a line (there is no drawPoint..)
        g.drawLine(locX, locY, locX, locY);
        repaint();
    }

    public static void main(String[] args) {
        Window test = new Window();

    }
}