import java.awt.*;
import java.applet.*;

public class BoxCircleAnimation extends Applet implements Runnable {
    Thread thread;
    int delay;
    int pos = 1;
    int flag = 0;

    public void start() {
        thread = new Thread(this);
        thread.start();
        delay = 100;
    }

    public void run() {
        while (Thread.currentThread() == thread) {
            repaint();
            if (flag == 0) {
                pos = pos + 10;
            } else {
                pos = pos - 10;
            }

            if (pos >= 300)
                flag = 1;

            if (pos <= 10)
                flag = 0;

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(100, pos, 30, 30);
        g.setColor(Color.red);
        g.fillOval(pos, 100, 30, 30);
    }

    public void stop() {
        thread = null;
    }
}
/*
 * <applet code=BoxCircleAnimation.class width=300 height=300>
 * </applet>
 */