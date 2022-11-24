import  java.applet.*;
import java.awt.*;
import java.awt.event.*;
public  class  app2 extends Applet implements ItemListener
{ List  ls2,ls3;
  String   fn="arial";
  int   fs=10;
 public void init()
 {
  this.setBackground(Color.yellow);
  this.setForeground(Color.red);
  this.setLayout(null);
  ls2=new List();
  ls3=new List();
  this.add(ls2);
  this.add(ls3);
  ls2.setBounds(100,200,200,150);
  ls3.setBounds(350,200,100,150);
  ls2.addItemListener(this);
  ls3.addItemListener(this);
  GraphicsEnvironment   gc=GraphicsEnvironment.getLocalGraphicsEnvironment();
  String   ffn[]=gc.getAvailableFontFamilyNames();
  ls2.removeAll();
  ls3.removeAll();
  for(int i=0;i<ffn.length;i++)
  {
   ls2.add(ffn[i]);
   ls3.add(Integer.toString(10+i));
  }
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(e.getSource()==ls2)
     {
      fn=ls2.getSelectedItem();
      repaint();
     }
  else if(e.getSource()==ls3)
  {
   fs=Integer.parseInt(ls3.getSelectedItem());
   repaint();
  }
 }
 public  void paint(Graphics  g)
 {

  g.setFont(new Font(fn,Font.BOLD|Font.ITALIC,fs));
  g.drawString("Babu Log",100,100);
 }
}
