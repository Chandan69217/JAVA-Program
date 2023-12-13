public class MinValueIntArray {
    private static java.util.Scanner scanner;
    public static void main(String agrs[]){
        scanner = new java.util.Scanner(System.in);
        System.out.print("\nEnter Count : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMinValue = findMin(returnedArray);
        System.out.print("\n Minimum Value in the array : "+ returnedMinValue);
        scanner.close();
    }

    private static int[] readIntegers(int count){
        int array[] = new int[count];
        for(int i=0;i<count;i++){
            int number;
            System.out.print("\nEnter a value : ");
            number = scanner.nextInt();
            scanner.nextLine();
            array[i]=number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value = array[i];
            if(value<min){
                min = value;
            }
        }
        return min;
    }
}
