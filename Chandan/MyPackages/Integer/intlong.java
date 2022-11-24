package MyPackages.Integer;
import java.util.*;

public class intlong
{
    int n;
    long l;
    public int inputint(String x)
    {
        System.out.print(x);
        n = (new Scanner(System.in)).nextInt();
        return(n);
    }

    public long inputlong(String x)
    {
        System.out.print(x);
        l =(new Scanner(System.in)).nextLong();
        return l;
    }
}