
public class StringManipulation 
{
  public static void main(String args[])
  {
    StringBuffer str = new StringBuffer("Object Language");
    System.out.println("Original String:"+str);
    // obtaining string length
    System.out.println("]nLength of string:"+str.length());
    //Accedssing characters in string
    for(int i =0;i<str.length();i++)
    {
        int p =i+1;
        System.out.println("Character at position "+p+" is "+str.charAt(i));
    }
    //Inseting a string in the middle
    String aString = new String(str.toString());
    int pos = aString.indexOf('L');
    str.insert(pos,"oriented ");
    System.out.println("Modified string:"+str);
    // Modifying characters
    str.setCharAt(6,'_');
    System.out.println("String now:"+str);
    // Appending a string at the end 
    str.append(" improves security.");
    System.out.println("Appended string:"+str);
  }   
}
