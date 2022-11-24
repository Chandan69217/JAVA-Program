import java.util.*;
class StringIndexOutOfRange{
    String arrString[]; int n,i=0; char check;
    public  void readName(){
        System.out.print("\nHow Many String Array Do you Want:-");
        n=(new Scanner(System.in)).nextInt();
        arrString = new String[n];
        do{
            try{
                System.out.print("\nEnter Your Name:-");
                arrString[i++]=(new Scanner(System.in)).nextLine();
                System.out.print("\n\nDo You Want to Continue(y/n):");
                check = (new Scanner(System.in)).next().charAt(0);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nArray Index Out Of Range");
                printName();
                System.exit(0);
            } 
          }while( check!='n');  
        printName();
    }
    public void printName()
    {   System.out.println("\nList Of Names");
        for(int j =0;j<i;j++ ){
            System.out.println(arrString[j]);
        }
    }
    public static void main(String agrs[]){
        new StringIndexOutOfRange().readName();
    }
}