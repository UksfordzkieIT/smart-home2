package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "godziny0_")
public class LogOddana
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    Time data;

    @Column
    double oddanaEnergia;

    @Column
    double kwota;

    public LogOddana() {}

    public LogOddana(Time data, double oddanaEnergia, double kwota)
    {
        this.data = data;
        this.oddanaEnergia = oddanaEnergia;
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

    public double getOddanaEnergia()
    {
        return oddanaEnergia;
    }

    public double getKwota()
    {
        return kwota;
    }
}
