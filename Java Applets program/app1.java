import  java.applet.*;
import java.awt.*;
import java.awt.event.*;
public  class  app1 extends Applet
{public void init()
 {
  this.setBackground(Color.yellow);
  this.setForeground(Color.red);
 }
 public  void paint(Graphics  g)
 {

  g.setFont(new Font("arial",Font.BOLD|Font.ITALIC,30));
  g.drawString("Babu Log",100,100);
 }
}
