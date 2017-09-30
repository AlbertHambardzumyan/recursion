package koch_curve_fractal;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

class Fractal extends JFrame {

    private static final int WIDTH = 420; // define width of GUI
    private static final int HEIGHT = 470; // define height of GUI
    private static final int MIN_LEVEL = 0, MAX_LEVEL = 15;
    private JLabel levelJLabel;
    private FractalJPanel drawSpace;

    // set up GUI
    Fractal() {
        super("Fractal");

        // set up control panel
        JPanel controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());

        // set up color button and register listener
        JButton changeColorJButton = new JButton("Color");
        controlJPanel.add(changeColorJButton);
        changeColorJButton.addActionListener(
                event -> {
                    Color color = JColorChooser.showDialog(Fractal.this, "Choose a color", Color.RED);

                    // set default color, if no color is returned
                    if (color == null) color = Color.RED;

                    drawSpace.setColor(color);
                    repaint();
                }
        );

        // set up decrease level button to add to control panel and register listener
        JButton decreaseLevelJButton = new JButton("Decrease Level");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(
                event -> {
                    int level = drawSpace.getLevel();
                    --level;

                    // modify level if possible
                    if (level >= MIN_LEVEL && level <= MAX_LEVEL) {
                        levelJLabel.setText("Level: " + level);
                        drawSpace.setLevel(level);
                        repaint();
                    }
                }
        );

        // set up increase level button to add to control panel and register listener
        JButton increaseLevelJButton = new JButton("Increase Level");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(
                event -> {
                    int level = drawSpace.getLevel();
                    ++level;

                    // modify level if possible
                    if (level >= MIN_LEVEL && level <= MAX_LEVEL) {
                        levelJLabel.setText("Level: " + level);
                        drawSpace.setLevel(level);
                        repaint();
                    }
                }
        );


        // set up levelJLabel to add to controlJPanel
        levelJLabel = new JLabel("Level: 0");
        controlJPanel.add(levelJLabel);

        drawSpace = new FractalJPanel(0);

        // create mainJPanel to contain controlJPanel and drawSpace
        JPanel mainJPanel = new JPanel();
        mainJPanel.add(controlJPanel);
        mainJPanel.add(drawSpace);
        add(mainJPanel); // add JPanel to JFrame
        setSize(WIDTH, HEIGHT); // set size of JFrame
        setVisible(true); // display JFrame
    }
}