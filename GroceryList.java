import java.util.*;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String agrs[]){
        String theItem;
        int itemNo;
        do{ 
            clearScreen();
            System.out.print("\n1. Add Item \n2. Modify Item \n3. Remove Item \n4. Grocery List \n5. Find Items \n0. Exit");
            System.out.print("\nEnter Your Choice:- ");
            int Choice = scanner.nextInt();
            switch(Choice){
                case 1:  System.out.print("\nEnter Item Name:- "); 
                         scanner.nextLine();
                         theItem = scanner.nextLine();
                         addGroceryList(theItem);
                break;
                case 2: System.out.print("\nEnter Item No:- ");
                        itemNo = scanner.nextInt();
                        System.out.print("\nEnter new item name:- ");
                        scanner.nextLine();
                        theItem = scanner.nextLine();
                        modifyGroceryList(itemNo-1,theItem);
                break;
                case 3: System.out.print("\nEnter Item No:- ");
                        itemNo = scanner.nextInt();
                        removeGroveryList(itemNo-1);
                break;
                case 4: scanner.nextLine(); printGroceryList();
                break;
                case 5: System.out.print("\nEnter Item Name to Search:- ");
                        scanner.nextLine();
                        searchItems(scanner.nextLine());
                break;
                case 0: System.exit(0);
                default: System.out.print("\nPlease enter correct choice !!!"); 
            }
        }while(true);
    }     

    public static void addGroceryList(String item){
        groceryList.add(item);
    }

    public static void printGroceryList(){
        System.out.print("\nYou have " + groceryList.size() + " item in your grocery list");
        for(int i=0; i<groceryList.size();i++){
            System.out.print("\n" + (i+1) + ". " + groceryList.get(i));
        }
        scanner.nextLine();
    }
    public static void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.print("\nGrocery item " + position + "has been modifed");
    }
    public static void removeGroveryList(int position){
        String getItemName = groceryList.remove(position);
        System.out.print("\n\nItem " + position + ". " +  getItemName +" removed from grocery list");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void searchItems(String searchItem){
        int index = groceryList.indexOf(searchItem);
        if(index>=0){
            System.out.print("\n\n("+ (index+1) + ". "+searchItem + ") in your shoping list");
        }else{
            System.out.print("\n\nItem "+ searchItem + " is not in your shoping list");
        }
        scanner.nextLine();
   }

    public static void clearScreen(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
