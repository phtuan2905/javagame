
import javax.swing.JFrame;

import canvas.GameCanvas;
import threads.GameThread;

public class App{
    public static void main(String[] args) throws Exception {
        CreateGameWindow();
    }

    static void CreateGameWindow() {
        JFrame gameWindow = new JFrame("Sea Horse Game");
        gameWindow.setSize(1200, 720);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setResizable(false);

        GameCanvas newGameCanvas = new GameCanvas();
        gameWindow.add(newGameCanvas);

        GameThread newGameThread = new GameThread();
        newGameThread.gameCanvas = newGameCanvas;
        newGameThread.startGameThread();

        gameWindow.setVisible(true);
    }
}
