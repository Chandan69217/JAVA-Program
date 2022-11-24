import java.awt.*;
import java.awt.event.*;
class   design   implements MouseListener,MouseMotionListener,MouseWheelListener
{
 Frame f1;
 int w=20,h=20;
 design()
 {
  f1=new Frame("Mouse handling");
  f1.setBounds(100,100,777,555);
  f1.addMouseListener(this);
  f1.addMouseMotionListener(this);
  f1.addMouseWheelListener(this);
  f1.setVisible(true);
 }
 public void mouseWheelMoved(MouseWheelEvent e)
 {

  w=w%1250+1;
  h=h%750+1;
  f1.setBounds(1,1,w,h);
 }
 public void mouseDragged(MouseEvent e)
 {

 }
 public void mouseMoved(MouseEvent e)
 {
 f1.setBackground(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));

 }
 public void mouseClicked(MouseEvent e)
 {

 }
 public void mousePressed(MouseEvent e)
 {
  f1.setBackground(Color.yellow);
 }
 public void mouseExited(MouseEvent e)
 {
  f1.setBackground(Color.red);
 }
 public void mouseReleased(MouseEvent e)
 {
  f1.setBackground(Color.PINK);
 }
public void mouseEntered(MouseEvent e)
 {
  f1.setBackground(Color.green);
 }
}
class  mouselis
{
 public static void main(String x[])
 {
  new design();
  }
  }