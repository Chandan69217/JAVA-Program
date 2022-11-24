import java.util.*;

class cal_circle
{
  private int x,y,tp=1;
  
  cal_circle(int r)
  { for(x=-r;x<=r;x++)
    { for(y=-1;y<=r;y++)
	{ if(x*x+y*y<r*r)
	  { System.out.print("("+x+","+y+")"+" ");
          tp++;
	  }
      }
    }
     System.out.printf("\nTotal Point inside the circle:-%d",tp);
  }
}
    

class circle_point
{ 
  public static void main(String agrs[])
  { System.out.print("\nEnter Radius of Circle:-");
    int r = (new Scanner(System.in)).nextInt();
    cal_circle c = new cal_circle(r);
  }
  
}