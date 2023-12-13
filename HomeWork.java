
public class HomeWork{
    private static String Containt;
    private static java.util.Scanner scanner;

    public static void main(String arg[]){
        System.out.println("\nEnter a string\n ");
        scanner = new java.util.Scanner(System.in);
        Containt = scanner.nextLine();
        function(Containt);
    }
    
    private static void function(String Containt){

        do{
            System.out.println("""
                    Available Options:
                                1. toLowerCase  2. toUpperCase
                                3. replace      4. trim
                                5. equals       6. equalsIgnoreCase
                                7. length       8. charAt
                                9. compairTo    10.conCat
                                11.subString    12.valueOf
                                13.toString     14.indexOf
                                15.exit
                    """);
                    System.out.print("\nEnter your choice:- ");
                  int choice = Integer.parseInt(scanner.nextLine());

                switch(choice){
                    case 1-> {
                        System.out.println("\n LowerCase :  " +Containt.toLowerCase());
                        scanner.nextLine();
                        break;
                    }
                    case 2-> {
                        System.out.println("\n UpperCase :  " +Containt.toUpperCase());
                        scanner.nextLine();
                        break;
                    } 
                     case 3-> {
                        System.out.println("\nEnter new String :");
                        String tempContaint = scanner.nextLine();
                        Containt = Containt.replace(Containt,tempContaint);
                        System.out.println("\n Replaced : " + Containt);
                        scanner.nextLine();
                        break;
                    }  case 4-> {
                        System.out.println("\n Trimed :  " +Containt.trim());
                        scanner.nextLine();
                        break;
                    }  case 5-> {
                        System.out.print("\nEnter new string to compair : ");
                        String Check = scanner.nextLine();
                        boolean response = Containt.equals(Check);
                        if(response){
                            System.out.println("Equal string ");
                        }else{
                            System.out.println("\n Not equal string ");
                        }
                        scanner.nextLine();
                        break;
                    }  case 6-> {
                        System.out.print("\nEnter new string to compair : ");
                        String Check = scanner.nextLine();
                        boolean response = Containt.equalsIgnoreCase(Check);
                        if(response){
                            System.out.println("Equal string ");
                        }else{
                            System.out.println("\n Not equal string ");
                        }
                        scanner.nextLine();
                        break;
                    }  case 7-> {
                        System.out.println("length : " + Containt.length());
                        scanner.nextLine();
                        break;
                    }  case 8-> {
                        System.out.print("Enter index: ");
                        int index = scanner.nextInt();
                        System.out.println("Char at : " + Containt.charAt(index));
                        scanner.nextLine();
                        break;
                    }  case 9-> {

                        break;
                    }  case 10-> {

                        break;
                    }  case 11-> {

                        break;
                    }  case 12-> {

                        break;
                    }  case 13-> {

                        break;
                    }  case 14-> {

                        break;
                    }  case 15-> {
                        scanner.close();
                        System.exit(0);
                        break;
                    } 
                    default -> {
                        System.out.println("Please enter valid options");
                    }
                }
        }while(true);
    }

}