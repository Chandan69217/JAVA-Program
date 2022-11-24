import java.io.DataInputStream;
class LCM
{
    private int a,b,c,p,s,i;
    DataInputStream d2 = new DataInputStream(System.in);

    void read()
    {
        try
        {
            System.out.print("Enter Value of a,b,c:-");
            a = Integer.parseInt(d2.readLine());
            b = Integer.parseInt(d2.readLine());
            c = Integer.parseInt(d2.readLine());
            p = a*b*c;
            s = a>b&&a>c?a:b>c?b:c;
            
        }
        catch(Exception e)
        {
            System.out.println("Gadha ho");
        }
    }

    void cal()
    { 
       for(i = s;i<=p;i=i+s)
       {
         if(i%a==0&&i%b==0&&i%c==0)
         {
            break;
         }
       }
          System.out.print("\nL.C.M:-"+i);
    }

}

class Cal_LCM
{
    public static void main(String agrs[])
    {
        LCM l = new LCM();
        l.read();
        l.cal();
    }
}