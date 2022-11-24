class LCM
{
    private int a,b,c,g,s;
    DataInputStream d2 = new DataInputStream();

    void read()
    {
        try
        {
            System.out.print("Enter Value of a,b,c:-");
            a = Integer.parseInt(d2.readLine());
            b = Integer.parseInt(d2.readLine());
            c = Integer.parseInt(d2.readLine());
            g = a>b&&a>c?a:b>c?b:c;
            s = a<b&&a<c?a:b<c?b:c;
            
        }
        catch(Expession e)
        {
            System.out.println("Gadha ho");
        }
    }

    void cal()
    { 
       for(int i = 5;i<=g;i++)
       {
         if(a%i==0&&b%i==0&&c%i==0)
         {
            System.out.print("\nL.C.M:-"+i);
         }
         else
         {
            System.out.printf("\nL.C.M:-%d",(a*b*c));
         }
       }
    }

}

class Cal_LCM
{
    public static void main(String agrs[])
    {
        LCM l = new LCM();
        l.rear();
        l.print();
    }
}