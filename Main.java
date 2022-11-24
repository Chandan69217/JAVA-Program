import java.util.*;

class Star
{ int n,i,j;
  
void print()
{
  for(i=1;i<=n;i++)
  { for(j=0;j<i;j++)
     { 
       System.out.print("*");
     }
    System.out.println("");
  }
}
  void read()
  {  Scanner in = new Scanner(System.in);
    System.out.print("\nHow many Line:-");
    n = in.nextInt();
  }
    
}



class Main
{ public static void main(String args[])
  { 
    Star S = new Star();
    S.read();
    S.print();
  }
}