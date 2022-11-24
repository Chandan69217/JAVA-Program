import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;
 
 
 class CountDesign extends TimerTask  implements ActionListener 
{
    Frame f1;
    Label l1;
    JTextField t1;
    JButton b1,b2,b3;
    int count=0;

    CountDesign()
    { f1 = new Frame();
      f1.setTitle("AWT Counter");  
      f1.setSize(500, 100);    
      f1.setLayout(new FlowLayout());
      l1 = new Label("Counter"); 
      f1.add(l1);       
      t1 = new JTextField(Integer.toString(count),10);
      t1.setEditable(false);       
      f1.add(t1);   
      b1 = new JButton("Count Up");   
      b1.addActionListener(this); 
      f1.add(b1);     
      f1.add(b2 = new JButton("Count Down"));
      b2.addActionListener(this);
      f1.add(b3 = new JButton("Reset"));
      b3.addActionListener(this);   
      f1.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e)
     {   if(e.getSource()==b1)
         {
            ++count;
            t1.setText(count +"");
         }
         else if(e.getSource()==b2)
         {
            --count;
            t1.setText(count +"");
         }
         else if(e.getSource()==b3)
         {  count = 0;
            t1.setText(count +"");
         }
     }
    public void run()
    {
      b3.setEnabled((Integer.parseInt(t1.getText()))!=0);
    }
}

class CountClick
{
   public static void main(String agrs[])
    {
        CountDesign d2 = new CountDesign();
        Timer r2 = new Timer();
        r2.schedule(d2,100,100);
    }
}
