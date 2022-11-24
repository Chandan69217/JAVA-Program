import java.io.*;
class a
{
    int a1,a2;
    DataInputStream scanf = new DataInputStream(System.in);
    void read(int x)
    {   System.out.print("\nEnter the Value of a1,a2:-");
        try
        {
        a1 = Integer.parseInt(scanf.readLine());
        a2 = Integer.parseInt(scanf.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
    }
    void print(int y)
    {
        System.out.println("A1="+a1+"\nA2="+a2);
    }
}

class b extends a
{
    int b1,b2;
    void read()
    {   
        System.out.print("\nEnter the Value of b1,b2:-");
        try
        {
             b1 = Integer.parseInt(scanf.readLine());
             b2 = Integer.parseInt(scanf.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
    }
    void print()
    {   
        System.out.printf("B1=%d\nB2=%d",b1,b2);
    }
}

class Example_Inheritance
{
    public static void main(String agrs[])
    {
        b c = new b();
        c.read();
        c.print();
        c.read(1);
        c.print(2);
    }
}