import java.util.*;

class Find
{ 
    private int a,b,c,d,g,s;

    Scanner s2 = new Scanner(System.in);

    void read()
    { 
      System.out.print("Enter Four No:-");
      a = s2.nextInt();
      b = s2.nextInt();
      c = s2.nextInt();
      d = s2.nextInt();
    }

    int gno()
    { 
        g = a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d;
        return (g);
    }
     
    int sno()
    { 
        s = a<b&&a<c&&a<d?a:b<c&&b<d?b:c<d?c:d;
        return s;
    }

    void print()
    {  
        System.out.println("Greatest no:-"+ gno());
        System.out.print("Smallest no:-" + sno());
    }

    class Gnumber
    { 
        public static void main(String agrs[])
        {
           Find f = new Find();
           f.read();
           f.gno();
           f.sno();

        }
    }
}