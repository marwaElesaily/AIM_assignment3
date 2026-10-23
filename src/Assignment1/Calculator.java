package Assignment1;

public class Calculator {

   public double add(int number1,int number2){

       return number1+number2;
   }

    public double add(double number1,double number2){

        return number1+number2;
    }

    public double add(int number1,double number2){

        return number1+number2;
    }

    public double add(double number1,int number2){

        return number1+number2;
    }
    public static String formatResult(double value, int decimals){
       return String.format("%." + decimals + "f", value);
    }
}
