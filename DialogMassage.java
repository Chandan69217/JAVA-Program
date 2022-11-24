import javax.swing.*;

class d1
{
    int a,b,s;

    void read()
    {
       a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter First no:-"));
       b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second no:-"));
       s = a+b;
    }

    void print()
    {
        JOptionPane.showMessageDialog(null,"Sum of the Number:-"+s);
    }
}


public class DialogMassage 
{ public static void main(String []agrs)
    {
        d1 d2 = new d1();
        d2.read();
        d2.print();
    }
}
