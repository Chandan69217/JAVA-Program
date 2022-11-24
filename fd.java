import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener.*;
import javax.swing.*;

class fd implements ActionListener
{   JFrame f1;
    MenuBar mb;
    Menu mfile;
    MenuItem mopen,mexit;
    fd()
    {
     f1=new JFrame("file dailog");
     f1.setSize(777,555);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java Programs\\icons.png"));
     mb=new MenuBar();
     mfile=new Menu("file");
     mopen=new MenuItem("open");
     mexit=new MenuItem("exit");
     mfile.add(mopen);
     mfile.addSeparator();
     mfile.add(mexit);
     mb.add(mfile);
     f1.setMenuBar(mb);
     mopen.addActionListener (this);
     mexit.addActionListener (this);
    
    f1.setVisible(true);

   }

   public void actionPerformed (ActionEvent e)
   {
     if 
     (e.getSource()==mexit)
     System.exit(0);
     else if(e.getSource()==mopen);
     {
       FileDialog F1=new FileDialog(f1,"file open");
       F1.setVisible(true);
     }

     }

     public static void main(String[] x)
     {
         new fd();
     }
}
 
     



    