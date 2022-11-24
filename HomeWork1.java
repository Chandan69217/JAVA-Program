import java.util.*;

class a 
{
    int a1 , a2;
    Scanner scanf = new Scanner(System.in);
    final void reada()
    {
        System.out.print("\nEnter the value of a1 & a2:-");
        a1 = scanf.nextInt();
        a2 = scanf.nextInt();
    }
    void printa()
    {
        System.out.print("\na1:-"+a1+"\na2:-"+a2);
    }
}




final class c extends a 
{
    int c1 , c2;
    void readc()
    {
       System.out.print("Enter the  value of c1 &c2:-");
       c1 = scanf.nextInt();
       c2 = scanf.nextInt();
    }
    void printc()
    {
        System.out.print("\nc1:-"+c1+"\nc2:-"+c2);
    }

}

class b extends a 
{  int b1 , b2;
   void readb()
   { 
     System.out.print("\nEnter the Value of b1 & b2:-");
     b1 = scanf.nextInt();
     b2 = scanf.nextInt();
   }
   void printb()
   {
     System.out.printf("\nb1:-"+b1+"\nb2:-"+b2);
   }
}

final class d extends b 
{
    int d1 , d2;
    void readd()
    {
        System.out.print("\nEnter the Value of d1 & d2:-");
        d1 = scanf.nextInt();
        d2 = scanf.nextInt();
    }
    void printd()
    {
       System.out.print("\nd1:-"+d1+"\nd2:-"+d2);
    }
    
}
class e extends b 
{
    int e1 , e2;
    void printe()
    {
        System.out.print("\ne1:-"+e1+"\ne2:-"+e2);
    }
    public void reade()
    {
       System.out.print("\nEnter the value of e1 & e2:-");
       e1 = scanf.nextInt();
       e2 = scanf.nextInt();
    }
}

final class m extends e 
{
    int m1 , m2;
    void readm()
    {
        System.out.print("\nEnter the Value of m1 & m2:-");
        m1 = scanf.nextInt();
        m2 = scanf.nextInt();
    }
    void printm()
    {
        System.out.print("\nm1:-"+m1+"\nm2:-"+m2);
    }
}

final class n extends e 
{
    int n1 , n2;

    void readn()
    {
        System.out.print("\nEnter the value of n1 & n2:-");
        n1 = scanf.nextInt();
        n2 = scanf.nextInt();
    }

   public void printn()
   {
     System.out.print("\nn1:-"+n1+"\nn2:-"+n2);
   }

}


class HomeWork1
{
    public static void main(String agrs[])
    {
        c calling_c = new c();
        d calling_d = new d();
        m calling_m = new m();
        n calling_n = new n();

           /* ****READING SECTION********** */
        calling_c.reada();
        calling_d.readb();
        //calling_n.readb();
        calling_c.readc();
        calling_d.readd();
        calling_n.reade();
        calling_m.readm();
        calling_n.readn();

        /* *******PRINTING SECTION********* */
        calling_c.printa(); // a & c
        calling_d.printb(); // b & d
        calling_c.printc(); // e & n
        calling_d.printd(); // m
        calling_m.printe();
        calling_m.printm();
        calling_n.printn();
    }
}