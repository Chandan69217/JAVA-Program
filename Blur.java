import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Blur{

    private static JFrame MyFrame = new JFrame("BLUR", null);

    public static void main(String agrg[]){
   MyFrame.getContentPane().setBackground(new Color(134,232,12));
   MyFrame.setGlassPane(new BlurGlass(MyFrame));
   MyFrame.setFocusable(false);
   MyFrame.getGlassPane().setVisible(true);
   MyFrame.setVisible(true);
    }
}


class BlurGlass extends JComponent {
    private JFrame f;
    public BlurGlass(JFrame f) {
        this.f = f;
        setOpaque(false);
        setFocusable(false);
        addMouseListener(new MouseAdapter(){});
        addMouseMotionListener(new MouseMotionAdapter(){});
    }
    
    public void paintComponent(Graphics g) {
        int w = f.getWidth();
        int h = f.getHeight();
        setLocation(0,0);
        setSize(w,h);
        g.setColor(new Color(0,0,0,1.0f));
        g.fillRect(0,0,w,h);
    }
}
