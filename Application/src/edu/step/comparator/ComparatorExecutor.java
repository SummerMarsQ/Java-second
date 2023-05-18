package edu.step.comparator;
import java.util.Scanner;
public class ComparatorExecutor
{
    public static void execute()
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4,cur_min;
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Enter third number");
        num3 = sc.nextInt();
        System.out.println("Enter fourth number");
        num4 = sc.nextInt();

        System.out.println("Enter 0 for min\nEnter 1 for max");
        int choice = sc.nextInt();
        if(choice == 0) System.out.println("MIN is = " + NumbersComparator.min(num1,num2,num3,num4));
        else if(choice == 1) System.out.println("MAX is = "+NumbersComparator.max(num1,num2,num3,num4));
        else System.out.println("Incorrect choice");
    }

}
