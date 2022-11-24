
public class diffProgram
{
   Runtime r = Runtime.getRuntime();
   Process p = null;
   diffProgram()
   {
       try {
           p = r.exec("C:\\TURBOC3\\Turbo C++\\Turbo c++.exe");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
  
   public static void main(String agrs[])
   {
      new diffProgram();
   }
}
