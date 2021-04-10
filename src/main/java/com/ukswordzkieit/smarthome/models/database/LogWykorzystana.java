package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "logwykorzystana0_")
public class LogWykorzystana
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    Time data;

    @Column
    double wykorzystana_energia;

    @Column
    double kwota;

    public LogWykorzystana() {}

    public LogWykorzystana(Time data, double wykorzystana_energia, double kwota)
    {
        this.data = data;
        this.wykorzystana_energia = wykorzystana_energia;
        this.kwota = kwota;
    }

    public int getId()
    {
        return id;
    }

    public Time getData()
    {
        return data;
    }

    public double getWykorzystana_energia()
    {
        return wykorzystana_energia;
    }

    public double getKwota()
    {
        return kwota;
    }
}
