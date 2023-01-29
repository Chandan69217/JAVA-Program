import customer.Account;
public class Check {
    public static void main(String agrs[]){
       Account Chandan = new Account("Chandan Sharma", "67500002343", "Chandansharma69217@gmail.com", "8969893457",2000.00);
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       do{
          Chandan.clearScreen();
          System.out.print("\nWelcome to Your Bank Account\n\n");
          System.out.print("\n1.Account Detail\n2.Blance Inquary\n3.Withdrawal\n4.Deposit\n0.Exit");
          System.out.print("\nEnter Your Choice:-");
          int ch = scanner.nextInt();
          switch(ch){
            case 0: scanner.close();
                    System.exit(0);
            case 1: Chandan.getAccountDetail();
                    scanner.nextLine(); scanner.nextLine();
            break;
            case 2: Chandan.clearScreen();
                    System.out.print("\nAvailable Blance : " +Chandan.getBalance());
                    scanner.nextLine(); scanner.nextLine();
            break;
            case 3: Chandan.clearScreen();
                    System.out.print("\nEnter Withdrawal Amount:-");
                    double withdrawalAmount = scanner.nextDouble();
                    Chandan.withdrawal(withdrawalAmount);
                    scanner.nextLine(); scanner.nextLine();
            break;
            case 4: Chandan.clearScreen();
                    System.out.print("\nEnter Amount:-");
                    double depositAmount = scanner.nextDouble();
                    Chandan.deposit(depositAmount);
                    scanner.nextLine(); scanner.nextLine();
            break;
            default : System.out.print("\nPlease Enter Valid Input");
          }
      }while(true);
    }
}
