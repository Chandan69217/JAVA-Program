import MyPackages.bool;
import MyPackages.Integer.*;
import MyPackages.Integer.Fraction.*;
import MyPackages.Integer.Fraction.String.*;
import mypackages.*;

class MainPack
{
    public static void main(String x[])
    {
        bool b2 = new bool();
        boolean v1 = b2.inputbool("\nEnter a Boolean Value:-");
        System.out.print("\nBoolean Value:-"+v1);

        intlong i2 = new intlong();
        int n = i2.inputint("\nEnter a Integer no:-");
        System.out.print("\nInteger no:-"+n); 
        long l = i2.inputlong("\nEnter a Long no:-");
        System.out.print("\nLong no:-"+l);

        shortbyte s2 = new shortbyte();
        short s1 = s2.inputShort("\nEnter a Short Value:-");
        System.out.print("\nShort no:-"+s1); 
        byte b1 = s2.inputByte("\nEnter Byte no:-");
        System.out.print("\nByte no:-"+b1);

        floatdouble f3 = new floatdouble();
        float f1 = f3.inputFloat("\nEnter a Float no:-");
        System.out.print("\nFloat no:-"+f1);
        double d2 = f3.inputDouble("\nEnter a Double no:-");
        System.out.print("\nDouble no:-"+d2);

        char1 ch2 = new char1();
        char x3 = ch2.inputChar("\nEnter a Char:-");
        System.out.print("\nChar:-"+x3);

        str s6 = new str();
        String chan = s6.inputString("\nEnter a String:-");
        System.out.print("\nString:-"+chan);
    }
}