package MyPackages.Integer;
import java.util.*;

public class shortbyte
{
   public short n;
   public byte l;
    public short inputShort(String x)
    {   
        System.out.print(x);
        n = (new Scanner(System.in)).nextShort();
        return(n);
    }
    public byte inputByte(String x)
    {   
        System.out.print(x);
        l = (new Scanner(System.in)).nextByte();
        return(l);
    }
}