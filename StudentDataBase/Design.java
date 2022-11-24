import mypackages.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Design extends function implements ActionListener 
{
  
  function fun = new function();
  
  Design()
  {       // JFrame Design
      f1 = new JFrame("Student DataBase");
      f1.setBounds(100,80,700,500);
      f1.setBackground(Color.BLACK);
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new BorderLayout(5,10));
      
        // JButtons Designs
     p1 = new JPanel(new GridLayout(6,2,5,15));
     p1.setSize(100,300);
     p1.add(b1 = new JButton("First"));
     p1.add(b2 = new JButton("Next"));
     p1.add(b3 = new JButton("Prev"));
     p1.add(b4 = new JButton("Last"));
     p1.add(b5 = new JButton("Add"));
     p1.add(b6 = new JButton("Save"));
     p1.add(b7 = new JButton("Search"));
     p1.add(b8 = new JButton("Update"));
     p1.add(b9 = new JButton("Delete"));
     p1.add(b10 = new JButton("Print"));
     p1.add(b11 = new JButton("Sort"));
     p1.add(b12 = new JButton("Exit"));
     f1.add(p1,BorderLayout.EAST);
     
        //JLabel & JTextArea Design
     p2 = new JPanel(new GridLayout(4,2,5,5));
     p2.add(l1 = new JLabel("Name",JLabel.LEFT));
     p2.add(t1 = new JTextField());
     p2.add(l2 = new JLabel("Roll",JLabel.LEADING));
     p2.add(t2 = new JTextField());
     p2.add(l3 = new JLabel("Class",JLabel.LEFT));
     p2.add(t3 = new JTextField());
     p2.add(l4 = new JLabel("Year",JLabel.LEFT));
     p2.add(t4 = new JTextField());
     f1.add(p2,BorderLayout.NORTH);

        //Table Design
     p3 = new JPanel();
     ta = new JTable(1000, 4);
     ta.setValueAt("NAME", 0, 0);
     ta.setValueAt("ROLL NO", 0, 1);
     ta.setValueAt("CLASS", 0, 2);
     ta.setValueAt("YEAR", 0, 3);
     sc = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     p3.add(sc);
     f1.add(p3, BorderLayout.CENTER);
     f1.setVisible(true);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     b10.addActionListener(this);
     b11.addActionListener(this);
     b12.addActionListener(this);
  }

  public void actionPerformed(ActionEvent evt)
  {
      if(evt.getSource()==b1)
      first();
      else if(evt.getSource()==b2)
      next();
      else if(evt.getSource()==b3)
      prev();
      else if(evt.getSource()==b4)
      last();
      else if(evt.getSource()==b5)
      add();
      else if(evt.getSource()==b6)
      save();
      else if(evt.getSource()==b10)
      print();
      else if(evt.getSource()==b12)
      System.exit(0);
      else if(evt.getSource()==b7)
      search();
      else if(evt.getSource()==b8)
      update();
      else if(evt.getSource()==b11)
       sort();
      else if(evt.getSource()==b9)
       delete();
  }   
  

  public static void main(String agrs[])
  {
      new Design();
  }
}




