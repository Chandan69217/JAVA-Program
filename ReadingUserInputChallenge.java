import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        int Sum=0,Number,Counter=1;
        while(true){
            if(Counter > 10){
                break;
            }
            System.out.print("\nEnter number #"+Counter +":- ");
            scanner.hasNextInt();
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                Number = scanner.nextInt();
                Sum +=Number;
                Counter++;
            }
            else{
                System.out.print("\nInvalid Number");
            }
            scanner.nextLine();
        }
        System.out.print("\nSum of the Numbers:- "+Sum);
        scanner.close();
    }
}
