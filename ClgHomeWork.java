/*
 *                                            @Question
 * -> write a java program except four digis number through the keybord and then perform following operations
 *         [1]  Reverse of a number
 *         [2]  Sum of a particular digits
 *         [3]  sum of first and last digits
 * 
 * -> write a java program except any integer through the keybord and then perform following operations
 *         [1] check even or odd number
 *         [2] check negative number or positive number
 *         [3] check prime number or not
 *         [4] check armstrong number or not
 *         [5] check palindrom number or not
 * 
 */


class HomeWork{
    
    /* ************************* Globle Variables ************************* */
    private static java.util.Scanner scanner;
    private static int givenNumber;
    private static int tempNumber;
    private static int digits;
    private static int action;
    private static boolean quit = false;

    public static void main(String[] args){
        scanner = new java.util.Scanner(System.in);
        do{
            cls();
            System.out.print(""" 
                              =================== Available actions: ==================== 
                              \n\t\t\t [1] Run Program 1 (Question 1)
                              \n\t\t\t [2] Run Program 2 (Question 2)
                              \n\t\t\t [3] Quit (Exit Code)  

                    """);
                    System.out.print("\n\n\t\t\t Choose action:");
                    action = scanner.nextInt();
                    switch(action){
                        case 1:      cls();
                                     System.out.print("\nEnter four digit number >>>>>> ");
                                     givenNumber = scanner.nextInt();
                                     cls();
                                     System.out.println("\t\tGiven number: " + givenNumber);
                                     System.out.println("\nSum of digits >>>>>> " + sumParticularDigits(java.lang.Math.abs(givenNumber)));
                                     System.out.println("Sum of first & last digits >>>>>> " +sumFirstAndLastDigits(java.lang.Math.abs(givenNumber)));
                                     System.out.println("Original number >>>>>> " + givenNumber + " & Reversed number >>>>>> " + reverseNumber(java.lang.Math.abs(givenNumber)));
                                     scanner.nextLine();
                                     System.out.print("\n\n\nPress enter to continue...");
                                     scanner.nextLine();
                        break;
                        case 3:      cls();
                                     System.out.println("""
                                                            #### ##  ###  ##    ##     ###  ##  ##  ###           ##  ##    ## ##   ##  ###  
                                                            # ## ##   ##  ##     ##      ## ##  ##  ##            ##  ##   ##   ##  ##   ##  
                                                              ##      ##  ##   ## ##    # ## #  ## ##             ##  ##   ##   ##  ##   ##  
                                                              ##      ## ###   ##  ##   ## ##   ## ##              ## ##   ##   ##  ##   ##  
                                                              ##      ##  ##   ## ###   ##  ##  ## ###              ##     ##   ##  ##   ##  
                                                              ##      ##  ##   ##  ##   ##  ##  ##  ##              ##     ##   ##  ##   ##  
                                                             ####    ###  ##  ###  ##  ###  ##  ##  ###             ##      ## ##    ## ##                        

                                                        """);
                                     quit = true; break;
                        default:   
                                     System.out.println("\n\t\t<<<<<<<<<<Please choose available action>>>>>>>>>");
                                     for(long i = 0;i<=999999999;i++);
                                     break;

                        case 2:      cls();
                                     System.out.print("\nEnter any integer number >>>>>> ");
                                     givenNumber = scanner.nextInt();
                                     cls();
                                     System.out.println("\t\tGiven integer number: " + givenNumber);
                                     System.out.println("\nNumber is " + checkEvenOdd(givenNumber));
                                     System.out.println("Number is " + checkNegativePositive(givenNumber));
                                     System.out.println("Number is " + checkPrime(givenNumber));
                                     System.out.println("Number is " + checkPalindrom(givenNumber));
                                     System.out.println("Number is " + checkArmstrong(givenNumber));
                                     scanner.nextLine();
                                     System.out.print("\n\n\nPress enter to continue...");
                                     scanner.nextLine();
                    }
        }while(!quit);
        scanner.close();
    }

    private static int sumParticularDigits(int givenNumber){
        tempNumber = 0;
        while(givenNumber>0){
        digits = givenNumber%10;
        tempNumber = digits+tempNumber;
        givenNumber = givenNumber/10;
        }
        return(tempNumber);
    }

    private static int reverseNumber(int givenNumber){
        tempNumber = 0;
        while(givenNumber>0){
        digits = givenNumber%10;
        tempNumber = tempNumber*10+digits;
        givenNumber = givenNumber/10;
        }
        return tempNumber;
    }

    private static int sumFirstAndLastDigits(int givenNumber){
        int tempNumber1 = 0;
        digits = givenNumber%10;
        tempNumber1 = tempNumber1+digits;
        digits = (reverseNumber(givenNumber))%10;
        tempNumber1 = tempNumber1+digits;
        return tempNumber1; 
    }

    private static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    private static String checkEvenOdd(int number){
        String value;
        if(number%2==0){
            value = "even.";
        }else {
            value = "odd.";
        }
        return value;
    }

    private static String checkNegativePositive(int number){
        String value;
        if(number<0){
            value = "Nagative (-).";
        }else {
            value = "Positive (+).";
        }
        return value;
    }

    private static String checkPrime(int number){
        String value = "prime.";
        for(int i=2;i<=(int) java.lang.Math.sqrt(java.lang.Math.abs(number));i++){
            if(number%i==0){
                value = "not prime";    
                break;       
            }
        }
        return value;
    }

    private static String checkPalindrom(int number){
        String value=null;
        int reverseNumber = reverseNumber(java.lang.Math.abs(number));
        if(reverseNumber==java.lang.Math.abs(number)){
            value = "Palindrom.";
        }else{
            value = "not Palindrom.";
        }
        return value;
    }

    private static String checkArmstrong(int number){
        String value = null;
        tempNumber=0;
        int saveNumber = number;
        while(number>0){
            digits = number % 10;
            tempNumber = tempNumber + (int) java.lang.Math.pow(digits,3);
            number = number / 10;
        }
        if(tempNumber==saveNumber){
            value = "armstrong.";
        }else{
            value = "not Armstrong.";
        }
        return value;
    }
}