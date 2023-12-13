package processing.input;

public class Input {

    private java.util.Scanner scanner;
    private int num1,num2;

   public  Input(){
        scanner = new java.util.Scanner(System.in);
        System.out.print("\nEnter First Number:-");
        num1 = scanner.nextInt();
        System.out.print("\nEnter Second Number:-");
        num2 = scanner.nextInt();
        scanner.close();
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }
    
}
