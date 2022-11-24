import java.util.*;
public class PredifineArray {
  int a[]=new int[10];
  int b[];
  int i[];
  PredifineArray()
  {
    Arrays.fill(a,78);
    Arrays.fill(a,5,10,46);
   // b = Arrays.copyOf(a,0);
    b = a.clone();
    i=Arrays.copyOf(a,6);
    Arrays.sort(a,0,9);
    print();
  }
  void print()
  {
    System.out.println("\nContent of Array A:");
    for(int c:a)
    {
        System.out.println(Integer.toString(c));
        
    }
    System.out.println("\nContent of Array B:");
    for(int d:b)
    {
        System.out.println(Integer.toString(d));
    }
    if(Arrays.equals(a,b)==true)
    {
        System.out.println("\nEquals");
    }
    else
    {
        System.out.println("\nUnequals");
    }
    for(int e:i)
    System.out.println(Integer.toString(e));
  }
  public static void main(String []agrs)
  {
    new PredifineArray();
  }
}
