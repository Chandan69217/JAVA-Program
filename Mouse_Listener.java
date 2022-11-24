import java.awt.event.*;
import java.awt.*;

class Mouse_Design implements MouseListener,MouseMotionListener,MouseWheelListener
{   int w = 50,h=50;
    Frame f1;
    Mouse_Design()
    {
       f1 = new Frame();
       f1.setBounds(200,100,800,700);
       f1.addMouseListener(this);
       f1.addMouseMotionListener(this);
       f1.addMouseWheelListener(this);
       f1.setVisible(true);
    }
    public void mouseWheelMoved(MouseWheelEvent e)
    { 
      w = w+1;
      h = h+1;
      f1.setBounds(100,200,w,h);

    }
    public void mouseExited(MouseEvent e)
    {
         f1.setBackground(Color.RED);
    }

    public void mouseEntered(MouseEvent e)
    {
          f1.setBackground(Color.GREEN);
    }

    public void mouseReleased(MouseEvent e)
    {
         f1.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e)
    {
        f1.setBackground(Color.BLUE);
    }

    public void mouseClicked(MouseEvent e)
    {
       f1.setBackground(Color.BLACK);
    }

    public void mouseMoved(MouseEvent e)
    {
       f1.setBackground(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
    }

    public void mouseDragged(MouseEvent e)
    {

    }

}

class Mouse_Listener
{
    public static void main(String agrs[])
    {
        new Mouse_Design();
    }
}