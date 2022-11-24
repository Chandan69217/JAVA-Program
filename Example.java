import javax.swing.*;
import java.awt.*;

class Example
{
    JFrame f1;
    JTextField tf1,tf2,tf3;
    GridLayout g1;
    JButton b1;
   Example()
   {
     f1 = new JFrame("Example");
     f1.setSize(300,200);
     g1 = new GridLayout(2,2,5,20);
     f1.setLayout(g1);
     tf1 = new JTextField();
     tf1.setSize(30,40);
     tf2 = new JTextField("Chandan",4);
     tf2.setSize(30,40);
     tf3 = new JTextField(5);
     tf3.setSize(30,40);
     f1.add(tf1);f1.add(tf2);f1.add(tf3);
     f1.add(b1= new JButton("Click"));
     b1.setSize(30,20);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setVisible(true);
   }
   public static void main(String agrs[])
   {
     try
     {
       UIManager.setLookAndFeel("javax.swing.plaf.nimbusLookAndFeel");
     }catch(UnsupportedLookAndFeelException e)
     {

     }catch(ClassNotFoundException e)
     {

     }catch(IllegalAccessException e)
     {

     }catch(InstantiationException e)
     {

     }
    new Example();
   }
}