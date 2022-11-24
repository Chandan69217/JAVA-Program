class MathOperation
{
    static float mul(float x,float y)
    {
        return x*y;
    }
    static float divide(float x,float y)
    {
        return x/y;
    }
}

class MathApplication
{
    public  static void main(String agrs[])
    {
        float a = MathOperation.mul(4,5);
        float b = MathOperation.divide(a,2);
        System.out.println("\nb:-"+b);
    }
}