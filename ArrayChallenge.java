import java.util.Scanner;
public class ArrayChallenge {
    static int i,j,Temp,ArraySize;
    static int ArrayNum1[],ArrayNum2[];
    static Scanner scanner = new Scanner(System.in);
 
    public static  int[] getInteger(){
        System.out.print("Enter Size Of Number:-");
        ArraySize = scanner.nextInt();
        ArrayNum1 = new int[ArraySize];
        ArrayNum2 = new int[ArraySize];
        for(i=0;i<ArraySize;i++){
            System.out.print("\nEnter a Integer Value:-");
            try{
                 ArrayNum1[i] = scanner.nextInt();
            }
            catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        return ArrayNum1;
    }

    public static void printArray(int[] Number){
        System.out.printf("\nList Of Array Integer Number\n");
        for(i=0;i<ArraySize;i++){
            System.out.print(Integer.toString(Number[i])+" ");
        }
        scanner.nextLine();
        scanner.nextLine();
    }

    public static int[] shortInteger(int[] Number){
        for(i=(ArraySize-1);i>0;i--){
            for(j=0;j<i;j++){
                if(Number[j]<Number[j+1]){
                    Temp = Number[j];
                    Number[j] = Number[j+1];
                    Number[j+1] = Temp;
                }
            }
        }

        return Number;
    }

    public static void clearScreen(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
   
    public static void main(String agrs[]){
        int choice;
        do{
            clearScreen();
            System.out.print("\n [1]  Get Integers \n [2] Print Original Array  \n [3] Short Array \n [4] Print Shorted Array \n [5] Exit");
            System.out.printf("\n Enter Your Choice:-");
            choice = scanner.nextInt();

            switch(choice){
                case 1: ArrayNum1 = getInteger(); break;
                case 2: printArray(ArrayNum1); break;
                case 3: ArrayNum2 = shortInteger(ArrayNum1); break;
                case 4: printArray(ArrayNum2); break;
                case 5: System.exit(0);
                default: System.out.print("\nPlease Enter Correct Option");
            }
        }while(true);
       // scanner.close();
    }

}
