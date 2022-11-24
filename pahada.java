import java.util.*;
class tabel
{
    protected int i,n,j;
    tabel()
    {   System.out.print("How many Tabel:-");
        n = (new Scanner(System.in)).nextInt();
    }
    void display()
    {
        System.out.println("\nList Of Tabel");
        for(i=1;i<=n;i++)
        {   System.out.println("\nTABEL"+i);
            for(j=1;j<=10;j++)
            {
                System.out.println(+i+" * "+j+ " = "+i*j);
            }
        }
    }

}

class pahada
{
    public static void main(String agrs[])
    {
        tabel t = new tabel();
        t.display();
    }
}