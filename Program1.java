import java.util.*;

class Salvage
{ float pur,dep,year,sal;
  
  void read ()
  { 

    try
    {
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter Purchase price:-");
    pur=in.nextFloat();
    System.out.print("\nEnter Year of Service:-");
    year=in.nextFloat();
    System.out.print("\nEnter Depreciation:-");
    dep=in.nextFloat();
    }
    catch(Exception e)
    { System.out.println("Wrong Data Inserted");
    }
   }
   void calculate()
   { sal=(float)(pur-dep*year);
     System.out.print("\nSalvage Value:-"+sal);
   }
 
} 



class Program1
{ public static void main(String agrs[])
  { Salvage S = new Salvage();
    S.read();
    S.calculate();
  }
}