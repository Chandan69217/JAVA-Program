import java.util.Scanner;
public class ReadName {
    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Year Of Birth: ");
        boolean hasNextInt = scanner.hasNextInt();
       if(hasNextInt){
           int yearOfBirth = scanner.nextInt();
           scanner.nextLine();// to Handle newLine Problem
           System.out.print("\nEnter Your Namme: ");
           String name = scanner.nextLine();
           int age = 2022 - yearOfBirth;
           if (age > 0 && age < 100)
               System.out.print("\nYour name is " + name + ", and You are " + age + " years Old.");
           else
               System.out.print("\nInvalid Year Of Birth");
               scanner.close();
       }else
       System.out.print("\nInvalid Input Year Of Birth.");
    }    
}
