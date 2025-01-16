package canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import seahorse.SeaHorse;

public class GameCanvas extends JPanel {
    SeaHorse seaHorse1 = new SeaHorse();
    public GameCanvas() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true);
    }

    public void Repaint() {
        repaint();
    }

    public void paintComponent(Graphics grp) {
        super.paintComponent(grp);

        Graphics2D grp2d = (Graphics2D)grp;

        grp2d.setColor(Color.WHITE);
        grp2d.fillRect(seaHorse1.x, seaHorse1.y, 50, 50);
        seaHorse1.Move();
        grp2d.dispose();
    }
}
