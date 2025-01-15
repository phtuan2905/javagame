
import javax.swing.JFrame;

import canvas.GameCanvas;

public class App {
    public static void main(String[] args) throws Exception {
        CreateGameWindow();
        while (true) {
            System.out.println("loop mian");
        }
    }

    static void CreateGameWindow() {
        JFrame gameWindow = new JFrame("Sea Horse Game");
        gameWindow.setSize(800, 600);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLocationRelativeTo(null);
        // gameWindow.setResizable(false);
        GameCanvas newGameCanvas = new GameCanvas();
        gameWindow.add(newGameCanvas);
        gameWindow.setVisible(true);
        newGameCanvas.startGameThread();
    }
}
