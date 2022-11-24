import java.awt.*;

class Design
{
  Frame f1;
  TextField t1,t2,t3;
  Label l1,l2,l3;
  Button add,exit;
  
  void read()
  {   // FRAME DESIGN
    f1 = new Frame("CALCULATOR");
    f1.setVisible(true);
    //f1.setSize(450,400);
    f1.setBounds(400,200,450,300);
    f1.setResizable(false);
    f1.setBackground(Color.YELLOW);
    f1.setLayout(null);
      //  LABEL-1 DESIGN
    l1 = new Label("Enter First No:-",Label.LEFT);
    l1.setBounds(70,50,150,30);
    l1.setFont(new Font("Giulio", Font.BOLD,14));
    l1.setForeground(Color.BLUE);
    f1.add(l1);
      // LABEL-2 DESIGN
    l2 = new Label("Enter Second No:-",Label.LEFT);
    l2.setBounds(70,100,150,30);
    l2.setFont(new Font("Giulio",Font.BOLD,14));
    l2.setForeground(Color.BLUE);
    f1.add(l2);
      // LABEl-3 DESIGN
    l3 = new Label("Sum Of NO:-",Label.LEFT);
    l3.setBounds(70,150,150,30);
    l3.setForeground(Color.BLUE);
    l3.setFont(new Font("Giulio",Font.BOLD,14));
    f1.add(l3);
      // TEXT FIELD-1 DESIGN
    t1 = new TextField();
    t1.setBounds(220,50,150,30);
    t1.setBackground(Color.GRAY);
    f1.add(t1);
      // TEXT FIELD-2 DESIGN
    t2 = new TextField();
    t2.setBounds(220,100,150,30);
    t2.setBackground(Color.GRAY);
    f1.add(t2);
      // TEXT FIELD-3 DESIGN
    t3 = new TextField();
    t3.setBounds(220,150,150,30);
    t3.setEditable(false);
    t3.setBackground(Color.GREEN);
    f1.add(t3);
     // BUTTON-ADD DESIGN
     add = new Button("ADD");
     add.setBackground(Color.GREEN);
     add.setFont(new Font("Giulio",Font.BOLD,18));
     add.setBounds(80,220,100,30);
     f1.add(add);
     // BUTTON-EXIT DESIGN
     exit = new Button("EXIT");
     exit.setBackground(Color.RED);
     exit.setFont(new Font("Giulio",Font.BOLD,18));
     exit.setBounds(250,220,100,30);
     f1.add(exit);
  }
}

class MyDesign
{
  public static void main(String agrs[])
  { 
    Design d = new Design();
    d.read();
  }
}