package canvas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GameCanvas extends JPanel implements Runnable {
    Thread gameThread;

    public GameCanvas() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null) { 
            System.out.println("loop");
        }
    }
}
