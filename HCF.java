import javax.swing.*;
class cal_hcf
{
    private int a,b,c,g,s,i;
    void read()
    {
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first no:-"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second no:-"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Third no:-"));
    }
    void calculate()
        {
        g = a>b&&a>c?a:b>c?b:c;
        s = a<b&&a<c?a:b<c?b:c;
        for( i= g; i>=s; i--)
        {
            if(a%i==0&&b%i==0&&c%i==0)
            {
               break;
            }
        }
        JOptionPane.showMessageDialog(null,"H.C.F:-"+i);
    }

}

public class HCF 
{
    public static void main(String agrs[])
    {
        cal_hcf hcf = new cal_hcf();
        hcf.read();
        hcf.calculate();
    }
}
