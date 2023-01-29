import java.awt.*;

class Iteam 
{
    Frame f1;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button Add,Exit;

    void read()
    { f1 = new Frame("Calculator");
      f1.setVisible(true);
   // f1.setSize(450,300);
      f1.setBounds(400,200,450,300);
      f1.setBackground(Color.BLUE);
      Add = new Button("SUMI");
      f1.add(Add);

    }
}


class Cal
{
    public static void main(String agrs[])
    { 
        Iteam I = new Iteam();
        I.read();
    }
}