import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;

class Calculator extends TimerTask implements ActionListener
{
    JFrame f1;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    JPanel p1;
    GridLayout g1;
    String s1,s2,s4="";
    int c,n;

    Calculator() 
    {    //Frame Design
        f1 = new JFrame("Calculator");
        f1.setBounds(400,200,230,210);
        f1.setResizable(false);
        f1.setLayout(new FlowLayout());
        f1.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Chand\\Downloads\\calculator.png"));
        f1.add(t1 = new JTextField("0",22));
        t1.setEditable(false);
        g1 = new GridLayout(4,4,10,10);
          //Panel Design
        p1 = new JPanel();
        p1.setLayout(g1);
          //Buttons Design
        p1.add( b1 = new JButton("7"));
        p1.add(b2 = new JButton("8"));
        p1.add(b3 = new JButton("9"));
        p1.add(b4 = new JButton("+"));
        p1.add(b5 = new JButton("4"));
        p1.add(b6 = new JButton("5"));
        p1.add(b7 = new JButton("6"));
        p1.add(b8 = new JButton("-"));
        p1.add(b9 = new JButton("1"));
        p1.add(b10 = new JButton("2"));
        p1.add(b11 = new JButton("3"));
        p1.add(b12 = new JButton("*"));
        p1.add(b13 = new JButton("C"));
        p1.add(b14 = new JButton("0"));
        p1.add(b15 = new JButton("="));
        p1.add(b16 = new JButton("/"));
        
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
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);  

        f1.add(p1);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    { if(e.getSource()==b1)
      {  t1.setText(s4+"7");
         s4=t1.getText();
      }
      else if(e.getSource()==b2)
      {
         t1.setText(s4+"8");
         s4=t1.getText();
      }
      else if(e.getSource()==b3)
      {
         t1.setText(s4+"9");
         s4=t1.getText();
      }
      else if(e.getSource()==b4)
      {
          s1=t1.getText();
          s4="";
          c=1;
      }
      else if(e.getSource()==b5)
      {
         t1.setText(s4+"4");
         s4=t1.getText();
      }
      else if(e.getSource()==b6)
      {
         t1.setText(s4+"5");
         s4=t1.getText();
      }
      else if(e.getSource()==b7)
      {
         t1.setText(s4+"6");
         s4=t1.getText();
      }
      else if(e.getSource()==b8)
      {
        s1=t1.getText();
        s4="";
        c=2;
      }
      else if(e.getSource()==b9)
      {
         t1.setText(s4+"1");
         s4=t1.getText();
      }
      else if(e.getSource()==b10)
      {
         t1.setText(s4+"2");
         s4=t1.getText();
      }
      else if(e.getSource()==b11)
      {
         t1.setText(s4+"3");
         s4=t1.getText();
      }
      else if(e.getSource()==b12)
      {
          s1=t1.getText();
          s4="";
          c=3;
      }
      else if(e.getSource()==b13)
      {
         t1.setText("0");
         s4="";
         s1=null;
         s2=null;
      }
      else if(e.getSource()==b14)
      {
         t1.setText(s4+"0");
         s4=t1.getText();
      }
      else if(e.getSource()==b15)
      {
         s2=t1.getText();
         if(c==1)
         {
            n=Integer.parseInt(s1)+Integer.parseInt(s2);
            t1.setText(Integer.toString(n));
         }
         if(c==2)
         {
            n=Integer.parseInt(s1)-Integer.parseInt(s2);
            t1.setText(Integer.toString(n));
         }
         if(c==3)
         {
            n=Integer.parseInt(s1)*Integer.parseInt(s2);
            t1.setText(Integer.toString(n));
         }
         if(c==4)
         {
            n=Integer.parseInt(s1)/Integer.parseInt(s2);
            t1.setText(Integer.toString(n));
         }
      }
      else if(e.getSource()==b16)
      {
         s1=t1.getText();
         s4="";
         c=4;
      }   
  }

  public void run()
  {  if(c==1)
     b4.setEnabled(s1==null);
     if(c==2)
     b8.setEnabled(s1==null);
     if(c==3)
     b12.setEnabled(s1==null);
     if(c==4)
     b16.setEnabled(s1==null);
     b13.setEnabled(s1!=null||s2!=null);
     b15.setEnabled(s1!=null);
  }

}

class MyCalculator
{
    public static void main(String agrs[])
    {
       Calculator C2 = new Calculator();
       Timer R2 = new Timer();
       R2.schedule(C2,10,10);
    }
}