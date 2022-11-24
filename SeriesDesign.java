import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowsDesign implements ActionListener
{  
    Frame f1;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button Exit,Sum;
    WindowsDesign()
   {        // Frame Design
     f1 = new Frame("SERIES");
     f1.setBounds(400,200,400,200);
     f1.setVisible(true);
     f1.setBackground(Color.blue);
     f1.setLayout(new GridLayout(4,2,5,5));
          // Label Design && TextField
     l1 = new Label("How Many Terms",Label.CENTER);
     f1.add(l1);
     t1 = new TextField();
     f1.add(t1);
     f1.add(l2 = new Label("Enter Value Of X",Label.CENTER));
     f1.add(t2 = new TextField());
     f1.add(l3 = new Label("Sum Of Series",Label.CENTER));
     f1.add(t3 = new TextField());
     t3.setEditable(false);
     f1.add(Exit = new Button("EXIT"));
     Sum = new Button("SUM");
     f1.add(Sum);
     Exit.setBackground(Color.red);
     Exit.setForeground(Color.yellow);
     Exit.addActionListener(this);
     Sum.setBackground(Color.GREEN);
     Sum.setForeground(Color.RED);
     Sum.addActionListener(this);
     t1.setBackground(Color.BLUE);
     t2.setBackground(Color.BLUE);
     t3.setBackground(Color.BLUE);
   }
   public void actionPerformed(ActionEvent e)
   { if(e.getSource()==Sum)
     {
        calculate();
     }
     else if(e.getSource()==Exit)
       System.exit(0);
   }
   void calculate()
   {
     int i,n;
     double s=0,t=1,x;
     n = Integer.parseInt(t1.getText());
     x = Double.parseDouble(t2.getText());
     for(i=1;i<=n;i++)
     {
        s = s+t;
        t = t*x;
     }
     t3.setText(Double.toString(s));
   }
}
public class SeriesDesign
{
   public static void main(String []agrs)
   {
      WindowsDesign  D = new  WindowsDesign();
   }
}
