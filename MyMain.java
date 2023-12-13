import java.sql.Driver;

interface Base{
    int num=100;
    void show();
}

class hello{
    final int num2;
    hello(){
    num2 = 100;
    }

    hello(int h){
        num2 = h;
    }
}
class Derived extends hello  implements Base{
    public void show(){
        System.out.println("Hello"+ num);
    }

    Derived(){
        num2 = 100;
    } 
   
}

public class MyMain{
    public static void main(String arr[]){
        Derived obj = new Derived();
        obj.show();
    }
}