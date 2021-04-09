package com.ukswordzkieit.smarthome.models;

import java.util.Vector;

public class TmpGenerator
{
    enum Weather{CLEAR, CLOUDY, RAIN, SOMETHING}
    Vector<Double> avgMonthTemp = new Vector<Double>(12);
    public TmpGenerator()
    {
        avgMonthTemp.add(-1.3);
        avgMonthTemp.add(-0.1);
        avgMonthTemp.add(3.5);
        avgMonthTemp.add(0.3);
        avgMonthTemp.add(14.5);
        avgMonthTemp.add(18.0);
        avgMonthTemp.add(20.0);
        avgMonthTemp.add(19.8);
        avgMonthTemp.add(14.9);
        avgMonthTemp.add(9.7);
        avgMonthTemp.add(5.1);
        avgMonthTemp.add(0.9);
    }
    public double predict(long hour, int month)
    {
        double x = hour * Math.PI / (24 * 3600 * 1000);
        return avgMonthTemp.indexOf(month) * Math.sin(x);
    }
}
