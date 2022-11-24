public class Memory 
{   
    Memory()
    {
        Runtime r = Runtime.getRuntime();
        System.out.println("\nTolal Memory:-"+r.totalMemory());
        r.gc();
        System.out.println("\nFree Memory:-" + r.freeMemory());
        System.out.println("\nUsed Memory:-" + (r.totalMemory()-r.freeMemory()));
    }

    public static void main(String agrs[])
    {
        new Memory();
    }
}
