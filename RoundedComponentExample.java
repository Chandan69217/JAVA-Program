import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

class RoundedComponent extends JComponent {
    private int arcWidth;
    private int arcHeight;

    public RoundedComponent(int arcWidth, int arcHeight) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        
        // Create a rounded rectangle shape with the specified arc width and height
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, arcWidth, arcHeight);
        
        // Set the clip region to the rounded rectangle
        g2d.setClip(roundedRectangle);
        
        // Paint the component as usual
        super.paintComponent(g2d);
        
        // Reset the clip region
        g2d.setClip(null);
    }
}
public class RoundedComponentExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rounded Component Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        RoundedComponent roundedComponent = new RoundedComponent(20, 20); // Set the corner radius
        roundedComponent.setBackground(Color.BLUE);
        roundedComponent.setPreferredSize(new Dimension(200, 100));
        
        frame.add(roundedComponent);
        frame.pack();
        frame.setVisible(true);
    }
}
