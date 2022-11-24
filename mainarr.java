import java.util.*;
class std
{
    String na;
    int ro;
    Scanner s2 = new Scanner(System.in);
    void readstd()
    {
        System.out.print("\nEnter Name:-");
        na = s2.nextLine();
        ro = s2.nextInt();
    }

    void printstd()
    {
        System.out.printf("\n%-20--%4d",na,ro);
    }
}

class mainarr
{
    public static void main(String agrs[])
    {
      std s[];
      int n,i;
      System.out.print("How many Records:-");
      n=(new Scanner(System.in)).nextInt();
      s = new std[n];
      for(i=0;i<n;i++)
      {
        s[i]=new std();
        s[i]=readstd();
      }
      System.out.print("\nContent\n");
      for(std x:s)
      {
        x.printstd();
      }
    }
}