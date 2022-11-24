
class MethodOverloading{
    public static void main(String agrs[]){
        calcFeetAndInchesToCentimeters(7,9);
        calcFeetAndInchesToCentimeters(157);
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0||inches<0||inches>12){
            System.out.print("\nInvalid Feet or Inches Parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches*2.54;
        System.out.println(feet + " feet + "+inches+" in = "+centimeters+ " c.m");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double feet = (int)inches/12;
        double remainingInches = (int)inches%12;
        System.out.println(inches+ "Inches Equal to "+feet + " feet And " + remainingInches + " in ");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}