package customer;

public class Account {
    private String accountNumber;
    private String customerName;
    private String emailAddress;
    private String phoneNumer;
    private double balance;

    public  void clearScreen() {
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }

    public void getAccountDetail(){
        clearScreen();
        System.out.println("Holder Name : " + getCustomerName());
        System.out.println("A/C : " + getAccountNumber());
        System.out.println("Email ID : " + getEmailAddress());
        System.out.println("Contect No : " + getPhoneNumber());
        System.out.println("Available Balance : " + getBalance());
    }

   public Account(String customerName,String accountNumber,String emailAddress,String phoneNumber,double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.emailAddress = emailAddress;
        this.phoneNumer = phoneNumber;
        this.balance = balance;
    }

    public void withdrawal(double withdrawalAmount){
        if(withdrawalAmount <0){
            System.out.print("\n Please Enter Valid Amount");
            return;
        }
        if(this.balance>=withdrawalAmount){
            try{
                System.out.print("\nPlease Wait..."+"\nWhile Your Transaction Under Progress...");
                Thread.sleep(3000);
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            this.balance -=withdrawalAmount;
            clearScreen();
            System.out.println("\nTransaction Complete....");
            System.out.println("Withdrawal Amount:-"+withdrawalAmount+"\nAvailable Balance:-"+this.balance);
        }else{
            System.out.print("\nTransaction Not Completed.....");
            System.out.print("insufficient Balance"+"\nAvailable Balance:-"+this.balance);   
        }
    }

    public void deposit(double depositAmount){
        clearScreen();
        this.balance += depositAmount;
        System.out.print("\n" + depositAmount +" Credited in Your Account" + "\nAvailable Balance:-"+this.balance);
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return (this.accountNumber);
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumer = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumer;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
}
