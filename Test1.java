// Java program to demonstrate
// getPackages() method

public class Test1 {
    public static void main(String[] args) {

        // get the Packages using getPackages() method
        Package[] packages = Package.getPackages();

        // print all packages, one by one
        for (int i = 0; i < packages.length; i++) {
            System.out.println(packages[i]);
        }
    }
}
