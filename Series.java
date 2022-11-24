import javax.swing.*;
class Gp
{
    private int x,n;
    Gp()
    {
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Value of x:-"));
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Value of n:-"));
        this.calseries();
    }

    void calseries()
    {   int s = 0,t,i;
        t = 1;
        for(i=1;i<=n;i++)
        {
            s = s+t;
            t = t*x;
        }
        JOptionPane.showMessageDialog(null,"Sum of the Series:-"+s);
        
    }
}

class Series
{
    public static void main(String []agrs)
    {  
        Gp babu = new Gp();
    }
}