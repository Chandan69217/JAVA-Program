package mypackages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class std
{
    String na,cl;
    int ro,yr;  
}

public class function 
{  
  public JFrame f1;
  public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
  public JPanel p1,p2,p3;
  public JTable ta;
  public JScrollPane sc;
  public JTextField t1,t2,t3,t4;
  public JLabel l1,l2,l3,l4;
  
  Vector v2 = new Vector();
  boolean gf=false;
  int cr,n;
   
   public void  first()
   {
      cr=0;
      display();
   }
   public void next()
   {
      cr=(cr+1)%n;
      display();
   }
   public void prev()
   {
      cr--;
      if(cr<0)
      cr=n-1;
      display();
   }
   public void last()
   {
      cr=n-1;
      display();
   }
   public void add()
   {  gf=false;
      clear();
      t1.requestFocus();
   }
   public void save()
   {
      std s = new std();
      s.na= t1.getText();
      s.ro= Integer.parseInt(t2.getText());
      s.cl= t3.getText();
      s.yr= Integer.parseInt(t4.getText());
      if(gf==false)
      {  v2.addElement(s);
         n++;
      }
      else
      {
         v2.setElementAt(s,cr);
      }
      print();
   }
   public void search()
   {
     boolean f=false;
     int x;
     std s = new std();
     x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter Roll no:-"));
     for(int i =0 ;i<n;i++)
     {
       s=(std)v2.elementAt(i);
       if(s.ro==x)
       {
         f=true;
         break;
       }
     }
     if(f==false)
     {
       JOptionPane.showMessageDialog(f1,"No Records Fond");
     }
     else
     {
      JOptionPane.showMessageDialog(f1,"Records Fond");
      t1.setText(s.na);
      t2.setText(Integer.toString(s.ro));
      t3.setText(s.cl);
      t4.setText(Integer.toString(s.yr));
     }
   }
   public void update()
   {
     boolean f=false;
     int x;
     std s = new std();
     x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter Roll no:-"));
     for(int i =0 ;i<n;i++)
     {
       s=(std)v2.elementAt(i);
       if(s.ro==x)
       {
         f=true;
         cr=i;
         break;
       }
     }
     if(f==false)
     { 
       clear();
       JOptionPane.showMessageDialog(f1,"No Records Fond");
     }
     else
     {
       int res = JOptionPane.showConfirmDialog(f1,"Do you Want to Update:");
       if(res==0)
       { 
         add();
         gf = true;
       }
       else
       {
         
       }
       
     }
   }
  public void delete()
   {
     boolean f = false;
     int x;
     std s = new std();
     x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter Roll no:-"));
     for (int i = 0; i < n; i++)
      {
       s = (std) v2.elementAt(i);
       if (s.ro == x) 
       {
         f = true;
         cr =i;
         break;
       }
     }
     if (f == false) {
       JOptionPane.showMessageDialog(f1, "No Records Fond");
     } 
     else 
     {
       int res = JOptionPane.showConfirmDialog(f1,"Do you Want to Delete:");
       if(res==0)
       {
           JOptionPane.showMessageDialog(f1, "Record Deleted");
          clear();
          for(int j = cr+1;j<n;j++)
           {
           v2.setElementAt(v2.elementAt(j),j-1);
           v2.removeElementAt(j);
           }
          n--;
         print();
           
       }
       
     }
   }
   public void print()
   {
     int i; 
     for(i=0;i<n;i++)
     {
        std s = new std();
        s = (std)v2.elementAt(i);
        ta.setValueAt(s.na,i+1,0);
        ta.setValueAt(Integer.toString(s.ro),i+1,1);
        ta.setValueAt(s.cl,i+1,2);
        ta.setValueAt(Integer.toString(s.yr),i+1,3);
     }
   }
   public void sort()
   {
     for(int i = 0 ;i<n-1;i++)
     {
      for(int j =i+1;j< n;j++)
      {
        std s1 = new std();
        std s2 = new std();
        s1 = (std)v2.elementAt(i);
        s2 = (std)v2.elementAt(j);
        if(s1.ro>s2.ro)
        {
          v2.setElementAt(s2,i);
          v2.setElementAt(s1,j);
          print();
        }
      }
     }
   }
   public void display()
   {
      std s = new std();
      s = (std) v2.elementAt(cr);
      t1.setText(s.na);
      t2.setText(Integer.toString(s.ro));
      t3.setText(s.cl);
      t4.setText(Integer.toString(s.yr));
   }
   public void clear()
   {
      t1.setText("");
      t2.setText("");
      t3.setText("BCA");
      t4.setText("2");
   }
   
}
