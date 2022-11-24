import java.util.*;

import javax.lang.model.util.ElementScanner14;

 class CheckCharacter 
{     char c;
      int ascii;
      Scanner s2 = new Scanner(System.in);
     
      CheckCharacter()
       {   
         System.out.print("\nEnter a Character to Check:-");
         c = s2.next().charAt(0);
         ascii = c;
        Check(ascii);

       }

        void Check(int y)
       {
          if(y>='A'&&y<='Z')
          System.out.print("\nCapital Letter");
          else if(y>='a'&&y<='z')
          System.out.print("\nSmall Letter");
          else if(y>='0'&&y<='9')
          System.out.print("\nDigits");
          else 
          System.out.print("\nPunctuaion")
       }
       
       public static void main(String[] agrs) 
       {  int v;
          do
          {
           new CheckCharacter();
           System.out.print("\nDo You Want to Continue:(y/n):");
           v = (new Scanner(System.in)).next().charAt(0);
          }while( v !='n');
           
       }
}

