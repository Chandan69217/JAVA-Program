import java.util.*;

abstract class A 
{
    int a , c, d, b;
    Scanner scanf = new Scanner(System.in);
    final void reada()
    {
        System.out.print("\nEnter the Value of a:-");
        a = scanf.nextInt();
    }
    abstract void readb();
    abstract void readc();
}

abstract class B extends A 
{
    public void readb()
    {
        System.out.print("\nEnter the Value of b:-");
        b = scanf.nextInt();
    }
    abstract void cal_roots();
}

class C extends B
{
    double r1,r2;
    public void readc()
    {
        System.out.print("\nEnter the Value of c:-");
        c = scanf.nextInt();
    }
    public void cal_roots()
    {
        d = b*b - 4*a*c;
        if(d==0)
        {
            System.out.print("Roots are real & Equal");
            r1 = r2 = (double)(-b/(2*a));
        }
        if(d>0)
        {
            System.out.print("Roots are real & Unequal");
            r1 = (double)((-b + Math.sqrt(d))/(2*a));
            r2 = (double)((-b - Math.sqrt(d))/(2*a));
        }
        else
        {
            System.out.printf("\nRoots are imagenary");
        }
    }
}


final class D extends C 
{
    void print()
    {   if(d>=0)
        {
            System.out.print("\nRoot1:-"+r1+"\nRoot2:-"+r2);
        }
        
    }
}

class HomeWork
{
    public static void main(String agrs[])
    {
        D calling = new D();
        calling.reada(); //A
        calling.readb(); //A
        calling.readc(); //A
        calling.cal_roots();//B
        calling.print(); //D
    }
}