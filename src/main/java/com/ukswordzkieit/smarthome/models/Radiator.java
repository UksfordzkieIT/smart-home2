package com.ukswordzkieit.smarthome.models;

import javafx.util.Builder;

import javax.swing.*;

public class Radiator
{
    String ip;
    double powerMax;
    double power;
    int workTime;

    public Radiator(Builder builder)
    {
        this.ip = builder.ip;
        this.powerMax = builder.powerMax;
        this.power = builder.power;
    }

    public void setWorkTime(int workTime)
    {
        this.workTime = workTime;
    }

    public static class Builder
    {
        protected String ip = "";
        protected double powerMax = 0.0;
        protected double power = 0.0;
        int workTime = 0;

        public Builder(){}

        public Builder ip(String ip)
        {
            this.ip = ip;
            return this;
        }

        public Builder powerMax(double powerMax)
        {
            this.powerMax = powerMax;
            return this;
        }

        public Builder power(double power)
        {
            this.power = power;
            return this;
        }

        public Radiator build()
        {
            return new Radiator(this);
        }
    }

}
