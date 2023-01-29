public class SumDigitsChallenge {
   
   public static int sumDigits(int Number){
    int SumDigits=-1;
    if(Number >=10){
        SumDigits = 0;
        while(Number > 0){
            int Remainder = Number%10;
            SumDigits += Remainder;
            Number /=10;
        }
    }
    return(SumDigits);
   }
    public static void main(String agrs[]){
        int Test = sumDigits(12);
        if(Test == -1){
            System.out.print("\nInvalid Input");
        }
        else{
            System.out.print("\nSum Of Digits:-"+Test);
        }
    }
}
