import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.StringTokenizer;
class  str  implements ActionListener
{
 Frame f1;
 List ls2;
 TextArea  ta;
 JButton b1,b2;
 str()
 {
 f1=new Frame("STRING TOKEN EXAMPLE");
 f1.setBounds(100,100,677,555);
 f1.setBackground(Color.cyan);
 f1.setLayout(null);
 ta=new TextArea();
 f1.add(ta);
 ta.setBounds(50,50,300,200);
 ls2=new List();
 f1.add(ls2);
 ls2.setBounds(380,50,200,400);
 f1.add(b1=new JButton("FIND"));
 b1.setBounds(50,270,100,30);
 f1.add(b2=new JButton("EXIT"));
 b2.setBounds(160,270,100,30);
 b1.addActionListener(this);
 b2.addActionListener(this);
 f1.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
     find();
  else if(e.getSource()==b2)
        System.exit(0);
 }
void find()
{
 String   s,s1;
 int  n;
 s=ta.getText();
 StringTokenizer   s2=new StringTokenizer(s,"\n");
 n=s2.countTokens();
 ls2.removeAll();
 while(s2.hasMoreTokens())
 {
  s1=s2.nextToken();
  ls2.add(s1);
 }
 JOptionPane.showMessageDialog(f1,"Total token="+n);
}

}
class   strtoken
{
 public static void main(String x[])
 {
  new str();
 }
}
