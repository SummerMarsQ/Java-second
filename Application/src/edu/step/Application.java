package edu.step;
import edu.step.comparator.ComparatorExecutor;
import edu.step.converter.dynamic.DynamicConverter;
import edu.step.calculator.CalculatorExecutor;
public class Application
{
    public static void main(String[] args) {
    // folosirea convertorului de temperature
        DynamicConverter.execute();

    //folosirea calculatorului
    CalculatorExecutor.execute();

    //folosirea max
        ComparatorExecutor.execute();
    }
}