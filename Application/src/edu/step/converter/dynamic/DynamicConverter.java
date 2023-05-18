package edu.step.converter.dynamic;
import edu.step.converter.TempConverter;
import java.util.Scanner;
public class DynamicConverter {

    public static void execute()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 0 for Celsius to Fahrenheit\nType 1 for Fahrenheit to Celsius");
        int choice = sc.nextInt();

        System.out.println("Enter temperature");
        int temp = sc.nextInt();

        if(choice == 0) System.out.println(temp + " C " + " = " +TempConverter.CtoF(temp) + " F");
        else if(choice == 1) System.out.println(temp + " F " + " = " + TempConverter.FtoC(temp)+ "C");
        else System.out.println("Incorrect choice");
    }

}
