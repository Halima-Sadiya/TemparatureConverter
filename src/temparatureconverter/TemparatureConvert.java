package temparatureconverter;

import java.util.Scanner;

public class TemparatureConvert {
    static Scanner user_input=new Scanner(System.in);
    public static void main(String[] args) {
        boolean exitProgram=false;
        
        double input,result;
        
        System.out.println("Tempareture Convertion");
        System.out.println("----------------------\n");
        while(!exitProgram){
            System.out.println("Please Enter your choice\n1. Celcius to farenheit\n2. Celcius to Kelvin\n3. Farenheit to Celsius\n4. Farenheit to Kelvin\n5. Kelvin to Celsius\n6. Kelvin to Farenheit\n7. Exit");
            String t=user_input.next();
            switch(t){
                case "1":
                    System.out.println("Enter Number :");
                    input=user_input.nextDouble();
                    result=((9.0/5.0)*input)+32;
                    System.out.println(input+" Celsius = "+result +" farenheit");
                    break;
                case "2":
                    System.out.println("Plaese enter a Number");
                    input=user_input.nextDouble();
                    result=input+273.15;
                    System.out.println(input+" Celsius = "+result +" Kelvin");
                    break;
                case "3":
                    System.out.println("Plaese enter a Number");
                    input=user_input.nextDouble();
                    result=(input-32)*5/9;
                    System.out.println(input+" farenheit = "+result +" Celsius");
                    break;
                case "4":
                    System.out.println("Plaese enter a Number");
                    input=user_input.nextDouble();
                    result=((5.0/9.0)*(input-32))+273.15;
                    System.out.println(input+" Celsius = "+result +" farenheit");
                    break;
                case "5":
                    System.out.println("Plaese enter a Number");
                    input=user_input.nextDouble();
                    result=input-273.15;
                    System.out.println(input+" Celsius = "+result +" farenheit");
                    break;
                case "6":
                    System.out.println("Plaese enter a Number");
                    input=user_input.nextDouble();
                    result=((input-273.15)*(9.0/5.0))+32;
                    System.out.println(input+" Celsius = "+result +" farenheit");
                    break;
                case "7":
                    exitProgram=true;
                    System.out.println("Program is Ended!!");
                    break;
                default :
                    System.out.println("Please enter a valid Number");
                    break;
            }
            System.out.println();
            
        }
        
        
        
    }
}
