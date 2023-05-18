package edu.step.comparator;

public class NumbersComparator {
    public static int min(int num1,int num2,int num3,int num4)
    {
        int cur_min = num1;
        if(cur_min > num2)
        {
        cur_min = num2;
        }
        if(cur_min > num3)
        {
            cur_min = num3;
        }
        if(cur_min > num4)
        {
            cur_min = num4;
        }
        return cur_min;
    }
    public static int max(int num1,int num2,int num3,int num4)
    {
        int cur_max = num1;
        if(cur_max < num2)
        {
            cur_max = num2;
        }
        if(cur_max < num3)
        {
            cur_max = num3;
        }
        if(cur_max < num4)
        {
            cur_max = num4;
        }
        return cur_max;
    }

}
