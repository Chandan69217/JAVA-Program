
class CollegeHomeWork{
    static int array[],counter;
    static java.util.Scanner scanner;
    public static void main(String[] args){
        array = new int[5]; 
        scanner = new java.util.Scanner(System.in);
        
        cls();
        for(counter=0;counter<array.length;counter++){
            System.out.print("\nEnter Integer Number: "+(counter + 1)+"\n");
            array[counter] = scanner.nextInt();
        }
        cls();
        printOddNumbers(array);
        printEvenNumbers(array);
        printPrimeNumbers(array);
        printCompositeNumbers(array);
        printPositiveNumbers(array);
        printNegativeNumbers(array);
    }

    static void printOddNumbers(int[] numbers){
        int count=0;
        int checkNumber[] = new int[5];
        for(int value:numbers){
            if(value%2!=0){
                checkNumber[count] = value;
                count++;
            }
        }

        System.out.printf("\nList of odd numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }

    static void printEvenNumbers(int[] numbers){
        int count=0;
        int checkNumber[] = new int[5];
        for(int value:numbers){
            if(value%2==0){
                checkNumber[count] = value;
                count++;
            }
        }

        System.out.printf("\nList of even numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }

    static void printPrimeNumbers(int[] numbers){
        int count=0,flag;
        int checkNumber[] = new int[5];
        for(int value:numbers){
            flag = 1;
            for(int i = 2;i<=(int)java.lang.Math.sqrt(java.lang.Math.abs(value));i++){
                if(value%i==0&&value!=2){
                  flag = 0;
                  break;
                }
             }
            if(flag==1){
                checkNumber[count] = value;
                count++;
            }
        }

        System.out.printf("\nList of prime numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }


     static void printCompositeNumbers(int[] numbers){
        int count=0,flag;
        int checkNumber[] = new int[5];
        for(int value:numbers){
            flag = 1;
            for(int i = 2;i<=(int)java.lang.Math.sqrt(java.lang.Math.abs(value));i++){
                if(value%i!=0&&value!=2){
                  flag = 0;
                  break;
                }
             }
            if(flag==1){
                checkNumber[count] = value;
                count++;
            }
        }

        System.out.printf("\nList of composite numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }

     static void printPositiveNumbers(int[] numbers){
        int count=0;
        int checkNumber[] = new int[5];
        for(int value:numbers){
                if(value>0){
                   checkNumber[count] = value;
                   count++;
                }
             }
        System.out.printf("\nList of positive numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }

    static void printNegativeNumbers(int[] numbers){
        int count=0;
        int checkNumber[] = new int[5];
        for(int value:numbers){
                if(value<0){
                   checkNumber[count] = value;
                   count++;
                }
             }
        System.out.printf("\nList of negative numbers\n");
        for(int value: checkNumber){
            if(value!=0)
            System.out.print(" "+value);
        }
    }

    static void cls(){
        try{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}