package edu.step.calculator;

import java.util.Scanner;
public class CalculatorExecutor {
    public static void execute()
    {
        Scanner sc = new Scanner(System.in);
        double num1,num2;
            System.out.println("Enter first num");
             num1 = sc.nextDouble();

                System.out.println("Enter second num");
                num2 = sc.nextDouble();

                System.out.println("Select an operator + - / *");
                char op = sc.nextLine().charAt(0);

                switch(op)
                {
                    case '+': System.out.println(Calculator.addition(num1,num2));break;
                    case '-' : System.out.println(Calculator.substraction(num1,num2));break;
                    case '*' : System.out.println(Calculator.multiplication(num1,num2));break;
                    case '/' : System.out.println(Calculator.division(num1,num2));break;
                    default : System.out.println("Inccorect operator");
                }


    }

}
