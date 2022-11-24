package MyPackages;
import java.util.*;

public class bool
{
    public boolean b;
    public boolean inputbool(String x)
    {
        System.out.print(x);
        b = (new Scanner(System.in)).nextBoolean();
        return(b);
    }
}


