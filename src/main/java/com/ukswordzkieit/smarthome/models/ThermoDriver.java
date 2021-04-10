package com.ukswordzkieit.smarthome.models;

import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class ThermoDriver
{
    final int MULTIPLAYER = 60;
    final double MULTIPLAYER_EFFICIENCY = 0.7;
    enum Weeks{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    //Czas do nastepnej zmiany temperatury
    int nextTempChange = 0;

    double outsideTemp = 0.0;
    double targetTemp = 0.0;
    double houseTemp = 0.0;

    public double generatedOutput = 0.0;
    Battery battery = new Battery();

    Vector<Radiator> radiators = new Vector<>();
    double ventilationTime = 0;

    //Cieplo generowane przez urzadzenia elektryczne
    double otherDevicesHeat = 0.0;

    //Wykorzystanie energi dzisiaj w kWh
    double usedPowerToday = 0.0;

    public ThermoDriver()
    {

    }

    public void updateData()
    {

        TmpGenerator tmpGenerator = new TmpGenerator();
        //outsideTemp = tmpGenerator.predict(System.currentTimeMillis(), )
    }

    public void setOutsideTemp(double outsideTemp)
    {
        this.outsideTemp = outsideTemp;
    }

    public double getOutsideTemp()
    {
        return this.outsideTemp;
    }

    public void setTargetTemp(double targetTemp)
    {
        this.targetTemp = targetTemp;
    }

    public double getTargetTemp()
    {
        return this.targetTemp;
    }

    public void setHouseTemp(double houseTemp)
    {
        this.houseTemp = houseTemp;
    }

    public double getHouseTemp()
    {
        return this.houseTemp;
    }

    public void setNextTempChange(int nextTempChange)
    {
        this.nextTempChange = nextTempChange;
    }

    public void setOtherDevicesHeat(double otherDevicesHeat)
    {
        this.otherDevicesHeat = otherDevicesHeat * MULTIPLAYER_EFFICIENCY;
    }

    public double getOtherDevicesHead()
    {
        return otherDevicesHeat;
    }

    public double getOtherDevicesHeat()
    {
        return otherDevicesHeat;
    }

    public void heatOrCool()
    {
        if(targetTemp > houseTemp)
        {

        }
        else
        {

        }
    }

    public void heat()
    {
        int beginHeatingAt = nextTempChange - calcHeatingTime();
        int endHeatingAt = nextTempChange + calcHeatingTime();
    }

    public int calcHeatingTime()
    {
        return (int)Math.abs(targetTemp - houseTemp);
    }

    public double calcHeatingPower()
    {
        double producedPower = 0.0;
        double requiredPower = 0.0;
        return requiredPower - producedPower;
    }

    public double calcVentilationTime()
    {
        if(houseTemp > targetTemp && targetTemp >= outsideTemp)
        {
            return MULTIPLAYER * (targetTemp - houseTemp) / (outsideTemp - houseTemp);
        }else if(houseTemp < targetTemp && targetTemp <= outsideTemp)
        {
            return MULTIPLAYER * (targetTemp - houseTemp) / (outsideTemp - houseTemp);
        }else
        {
            return 0.0;
        }
    }

    public void calcUsedPower()
    {

    }
}
