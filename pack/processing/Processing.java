package processing;
import  processing.input.Input;

public class Processing {
    private int num1,num2,sum;
    private Input input;
    public Processing(){
      input = new Input();
      num1 = input.getNum1();
      num2 = input.getNum2();  
      calculate(num1, num2);
    }

    private void calculate(int num1,int num2){
        sum = num1 + num2;
    }

    public int getResult(){
        return this.sum;
    }

}
