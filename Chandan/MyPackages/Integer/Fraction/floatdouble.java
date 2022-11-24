package MyPackages.Integer.Fraction;
import java.util.*;

public class floatdouble
{
    float n;
    double l;
  
  public float inputFloat(String x)
  {
    System.out.print(x);
    n = (new Scanner(System.in)).nextFloat();
    return n;
  }

  public double inputDouble(String x)
  {
    System.out.print(x);
    l = (new Scanner(System.in)).nextDouble();
    return(l);
  }
}