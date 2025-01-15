
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        CreateGameWindow();
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
        GameCanvas.startGameThread();
    }
}
