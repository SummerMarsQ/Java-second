package edu.step.converter;

public class TempConverter {
    public static double CtoF(int C)
    {
        return (C * 9.0/5) + 32;
    }

    public static double FtoC(int F)
    {
        return (F-32) * 5/9.0;
    }
}
