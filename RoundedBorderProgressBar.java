import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedBorderProgressBar extends JProgressBar {

    private int cornerRadius = 50;

    public RoundedBorderProgressBar() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the rendering hints to make the border smooth
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        int width = getWidth();
        int height = getHeight();

        // Create a rounded rectangle for the progress bar
        RoundRectangle2D.Float background = new RoundRectangle2D.Float(
                0, 0, width, height, cornerRadius, cornerRadius);

        // Fill the background with the progress bar's background color
        g2d.setColor(getBackground());
        g2d.fill(background);

        // Calculate the width of the filled progress
        int progressBarWidth = (int) (width * getPercentComplete());

        // Create a rounded rectangle for the filled progress
        RoundRectangle2D.Float progress = new RoundRectangle2D.Float(
                0, 0, progressBarWidth, height, cornerRadius, cornerRadius);

        // Fill the progress with the progress bar's foreground color
        g2d.setColor(getForeground());
        g2d.fill(progress);

        g2d.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded Border ProgressBar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);

            RoundedBorderProgressBar progressBar = new RoundedBorderProgressBar();
            progressBar.setStringPainted(true);
            progressBar.setString("50%");
            progressBar.setForeground(Color.BLUE);
            progressBar.setBackground(Color.WHITE);
            progressBar.setValue(50);

            frame.add(progressBar);
            frame.setVisible(true);
        });
    }
}
