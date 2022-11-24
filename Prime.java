import java.util.*;

class cal_prime
{ 
   private int f,j,i;
   
   void main(int m, int n)
   { 
     System.out.print("\nList of Prime\n");
     for(i=m;i<=n;i++)
	{  f=1;
	  for(j=2;j<=(int)(Math.sqrt(i));j++)
	   {  if(i%j==0)
		 { f = 0;
              break;
	 	 }
         }

	   if( f == 1)
	    { System.out.print(" " +i);
	    }
	}
   }
}

class Prime
{  public static void main(String agrs[])
	{ 
 	   int m,n;
        System.out.print("Enter a no to find prime number between:-");
	   m = (new Scanner(System.in)).nextInt();
         n = (new Scanner(System.in)).nextInt();
	   cal_prime p = new cal_prime();
         p.main(m,n);
	}
}
	