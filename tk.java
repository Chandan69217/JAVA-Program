import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class   design   implements KeyListener,TextListener,FocusListener
{
 Frame f1;
 TextField  t1;
 TextArea   ta;
 int fs=5;
 design()
 {
  f1=new Frame("Keyboard handling");
  f1.setBounds(100,100,777,555);
  f1.setLayout(null);
  t1=new TextField();
  f1.add(t1);
  t1.setBounds(50,50,400,40);
  ta=new TextArea();
  f1.add(ta);
  ta.setBounds(50,100,500,400);
  t1.addKeyListener(this);
  t1.addTextListener(this);
  ta.addKeyListener(this);
  ta.addTextListener(this);
  t1.addFocusListener(this);
  ta.addFocusListener(this);
  f1.setBackground(Color.yellow);
  f1.setVisible(true);
 }
 public void focusLost(FocusEvent e)
 {
  if(e.getSource()==t1)
     t1.setBackground(Color.red);
  else if(e.getSource()==ta)
         ta.setBackground(Color.red);
 }
 public void focusGained(FocusEvent e)
 {
 if(e.getSource()==t1)
     t1.setBackground(Color.green);
  else if(e.getSource()==ta)
         ta.setBackground(Color.green);
 }
 public void textValueChanged(TextEvent e)
 {
  if(e.getSource()==ta)
  {
   int tc=(ta.getText()).length();
   f1.setTitle("Total character="+Integer.toString(tc));
   ta.setFont(new Font("arial",Font.BOLD,fs));
   fs=(fs+1)%40+5;
  }
  else if(e.getSource()==t1)
  {
  }
 }
 public void keyReleased(KeyEvent e)
 {
 }
 public void keyPressed(KeyEvent e)
 {
 char  x;
 int av;
 x=e.getKeyChar();
 av=e.getKeyCode();
 JOptionPane.showMessageDialog(f1,"character="+x+" value="+av);
 }
 public void keyTyped(KeyEvent e)
 {
 }
 }
 class   tk
 {
  public static void main(String x[])
  {
   new design();
  }
  }
