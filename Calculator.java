import java.io.DataInputStream;


class  Calculator
{ 
	public static void main(String agrs[])
	{ DataInputStream in = new DataInputStream(System.in);
	  int a,b,sum;
	
	try
	{ 
 	  System.out.print("\nEnter First No:-");
	  a=Integer.parseInt(in.readLine());
	  System.out.print("\nEnter Second No:-");
	  b=Integer.parseInt(in.readLine());
	  sum=a+b;
	  System.out.println("\nSum of the No:-"+sum);
	}
	catch(Exception e)
	{ System.out.println("Ekdam nahi Bujatha hai");
	}
      }
}
