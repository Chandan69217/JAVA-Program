import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class lineex2 extends Applet implements MouseListener
{
    boolean f = true;
    int x1,x2,y1,y2;

    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    { 
        f=true;
    }
    public void mousePressed(MouseEvent e)
    {
         f=false;
    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    
    public void init()
    {
      addMouseListener(this);
    }
    public void paint(Graphics g)
    {
       do
       {
         x1=(int)(Math.random()*(this.getWidth()));
         x2=(int)(Math.random()*(this.getWidth()));
         y1=(int)(Math.random()*(this.getHeight()));
         y2=(int)(Math.random()*(this.getHeight()));
         g.drawLine(x1,y1,x2,y2);
       }while(f==true);
    }
    
}
