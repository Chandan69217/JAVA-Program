import java.io.*;
import java.lang.*;

class roots
{
    private double a,b,c,d,r1,r2;
    DataInputStream d2 = new DataInputStream(System.in);

    roots()
    {  try
        {
            System.out.print("Enter Value of A:-");
            a = Double.parseDouble(d2.readLine());
            System.out.print("Enter Value of B:-");
            b = Double.parseDouble(d2.readLine());
            System.out.print("Enter Value of C:-");
            c = Double.parseDouble(d2.readLine());
            d = b*b - 4*a*c;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
        this.cal();
    }

    void cal()
    {
        if(d==0)
        {
            r1 = -b/2*a;
            r2 = -b/2*a;
            System.out.println("Roots are Real and Equal \n Root1:-"+r1+"Root2:-"+r2);
        }
        if(d>0)
        {
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.print("Roots are real and Unequal \n Root1:-" +r1+ "\n Root2:-" +r2);

        }
        else
        {
            System.out.print("\nRoots are Imagenary");
        }
    }
}


class Quadratic
{
    public static void main(String []agrs)
    {
        roots babu = new roots();
      //  babu.cal();
    }
}