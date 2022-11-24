import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Digits implements ActionListener
{
    Frame f1;
    Label l1,l2;
    TextField t1,t2;
    JButton Exit,Sum,Product,Reverse;

    Digits()
    {       // Frame Design
        f1 = new Frame("Digits");
        //f1.setSize(300,200);
        f1.setBounds(400,200,450,260);
        f1.setBackground(Color.orange);
       // f1.setResizable(false);
        f1.setLayout(null);
           // Label-1 Design
        l1 = new Label("Enter a Number:-",Label.CENTER);
        l1.setBounds(30,50,180,30);
       // l1.setBackground(Color.BLUE);
        l1.setFont(new Font("Giulio",Font.BOLD,14));
        l1.setForeground(Color.DARK_GRAY);
        f1.add(l1);
           // Label-2 Design
        l2 = new Label("Result:-",Label.CENTER);
        l2.setBounds(30,90,180,30);
        //l2.setBackground(Color.BLUE);
        l2.setFont(new Font("Giulio",Font.BOLD,14));
        l2.setForeground(Color.DARK_GRAY);
        f1.add(l2);
          // TextField-1 Design
        t1 = new TextField();
        t1.setBounds(240,50,180,30);
        t1.setBackground(Color.ORANGE);
        f1.add(t1);
         // TextField-2 Design
        t2 = new TextField();
        t2.setBounds(240,90,180,30);
        t2.setBackground(Color.ORANGE);
        t2.setEditable(false);
        f1.add(t2);
         // Button-Sum
        Sum= new JButton("SUM");
        Sum.setBounds(70,150,100,30);
        Sum.setBackground(Color.BLUE);
        Sum.setFont(new Font("",Font.BOLD,18));
        Sum.addActionListener(this);
        f1.add(Sum);
         // Button-Product
        Product = new JButton("PRODUCT");
        Product.setBounds(230,150,180,30);
        Product.setBackground(Color.GREEN);
        Product.setFont(new Font("",Font.BOLD,18));
        Product.addActionListener(this);
        f1.add(Product);
          // Button-Exit
        Exit = new JButton("EXIT");
        Exit.setBounds(70,200,100,30);
        Exit.setBackground(Color.RED);
        Exit.setFont(new Font("",Font.BOLD,18));
        Exit.addActionListener(this);
        f1.add(Exit);
          // Button-Reverse
        Reverse = new JButton("REVERSE");
        Reverse.setBounds(230,200,180,30);
        Reverse.setBackground(Color.YELLOW);
        Reverse.setFont(new Font("",Font.BOLD,18));
        Reverse.addActionListener(this);
        f1.add(Reverse);
        f1.setVisible(true);
    }

    void Sum_Digits()
    {
        int num,r,s=0;
        num = Integer.parseInt(t1.getText());
        while(num>0)
        {
            r = num%10;
            s = s+r;
            num = num/10;
        }
        t2.setText(Integer.toString(s));
    }

    void Product_Digits()
    {
        int num,r,p=1;
        num = Integer.parseInt(t1.getText());
        while(num>0)
        {
            r = num%10;
            p = p*r;
            num = num/10;
        }
        t2.setText(Integer.toString(p));
    }

    void Rev_Digits()
    {
        int num,r,d=0;
        num = Integer.parseInt(t1.getText());
        while(num>0)
        {
            r = num%10;
            d = d*10+r;
            num = num/10;
        }
        t2.setText(Integer.toString(d));
    }

    public void actionPerformed(ActionEvent e)
    { if(e.getSource() == Sum)
        {
          Sum_Digits();
        }
      else if(e.getSource() == Exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == Product)
                {
                    Product_Digits();
                }
                else if(e.getSource() == Reverse)
                        {
                            Rev_Digits();
                        }
    }
}

class SumOfDigits
{
    public static void main(String agrs[])
    {
        new Digits();
    }
}