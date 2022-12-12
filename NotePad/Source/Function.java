package Source;
import javax.swing.*;
import java.awt.*;
import java.awt.print.*;

public class Function
{ // Veriable Declearation
  public JFrame f1;
  public TextArea ta;
  public JMenuBar mb;
  public JMenu file, edit, view,font;
  public JMenuItem ne, win, open, save, saveas, page, print, exit; // File Menu Items
  public JMenuItem undo, cut, copy, paste, del, find, findnext, findprev, replace, go, select, time; // Edit Menu                                                                                                         // Items
  public JMenuItem zoom, status, word; // View Menu Items
  public JMenuItem  ffamily,fstyle,fsize; // Font Menu Items
  final public int width = 700, height = 500;

  String s1;
   
  public void new1()
  {
   ta.setText("");
  }
  public void cut()
  {
    s1 = ta.getSelectedText();
    ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }
  public void copy()
  {
    s1 = ta.getSelectedText();
  }
  public void paste()
  {
     ta.insert(s1,ta.getCaretPosition());
  }
  public void del()
  {
    ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }

  public void find()
  { String s2 = ta.getText();
    String s1= JOptionPane.showInputDialog(f1,"Find");
    boolean f = s2.contains(s1);
    if(f==true)
    {
    int i1 = ta.getText().indexOf(s1);
    int i2 = s1.length();
    ta.setCaretPosition(i1);
    ta.select(i1,i1+i2);
    }
    else
      JOptionPane.showMessageDialog(f1,"Not Found");
  }

 /* public void findnext() 
  {
    String s2 = ta.getText();
    s2.replaceAll("\\n", "\\b");
    String s1 = JOptionPane.showInputDialog(f1, "Find");
    boolean f = s2.contains(s1);
    if (f == true) {
      int i1 = ta.getText().indexOf(s1);
      int i2 = s1.length();
      JOptionPane.showMessageDialog(f1, s2 + "\nStarting Index:- " + i1 + "\nLast Index:-" + i2);
      ta.setCaretPosition(i1);
      ta.select(i1, i1 + i2);
    } else
      JOptionPane.showMessageDialog(f1, "Not Found");
  }*/

  public void replace()
  {
    String s1 = ta.getText();
    String s2 = JOptionPane.showInputDialog(f1,"Find");
    boolean f = s1.contains(s2);
    if(f==true)
    {
      String s3 = JOptionPane.showInputDialog(f1,"replace");
      s1= s1.replace(s2,s3);
      ta.setText(s1);
    }
    else
    {
      JOptionPane.showMessageDialog(f1,"Not Found");
    }
  }

  public void select()
  {
    ta.selectAll();
  }

  public void print()
  {
      PrinterJob pjob = PrinterJob.getPrinterJob();
      PageFormat pf = pjob.defaultPage();
      pjob.setPrintable(null, pf);
      try
      {
      if (pjob.printDialog()) 
      {
        pjob.print();
      }
      }
     catch(Exception e)
     {

     }
  }
}
