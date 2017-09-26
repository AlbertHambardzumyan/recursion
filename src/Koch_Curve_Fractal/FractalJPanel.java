package Koch_Curve_Fractal;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel {
    private Color color;
    private int level; // stores current level of fractal
    private static final int WIDTH = 420; // defines width of JPanel
    private static final int HEIGHT = 400; // defines height of JPanel

    // set the initial fractal level to the value specified and set up JPanel specifications
    FractalJPanel(int currentLevel) {
        color = Color.RED;
        level = currentLevel;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // start drawing the fractal
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw fractal pattern
        g.setColor(color);
        drawFractal(level, 100, 90, 290, 200, g);
    }

    // draw fractal recursively
    private void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g) {
        if (level == 0) g.drawLine(xA, yA, xB, yB); // base case: draw a line connecting two given points
        else { // recursion step: determine new points, draw next level

            // calculate midpoint between (xA, yA) and (xB, yB)
            int xC = (xA + xB) / 2;
            int yC = (yA + yB) / 2;

            // calculate the fourth point (xD, yD) which forms an isosceles right triangle between (xA, yA) and (xC, yC)
            // where the right angle is at (xD, yD)
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;

            // recursively draw the Fractal
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }
    }

    // set the drawing color to c
    void setColor(Color c) {
        color = c;
    }

    // set the new level of recursion
    void setLevel(int currentLevel) {
        level = currentLevel;
    }

    // returns level of recursion
    int getLevel() {
        return level;
    }
}
