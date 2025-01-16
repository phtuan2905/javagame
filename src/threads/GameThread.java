package threads;

import canvas.GameCanvas;

public class GameThread implements Runnable {
    Thread gameThread;
    public GameCanvas gameCanvas;
    int maxFPS = 60;

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        long timePerFrame = 1000000000 / 60;
        while (gameThread != null) {
            long startFrameTime = System.nanoTime();
            Update();
            gameCanvas.Repaint();
            try {
                long remainFrameTime = timePerFrame - (System.nanoTime() - startFrameTime);
                if (remainFrameTime < 0) {
                    remainFrameTime = 0;
                }
                Thread.sleep(remainFrameTime / 1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void Update() {

    }
}
