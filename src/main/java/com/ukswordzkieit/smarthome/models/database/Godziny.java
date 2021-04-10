package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "godziny")
public class Godziny
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "godzMin")
    Time godzMin;

    @Column(name = "godzMax")
    Time godzMax;

    public Godziny(){}

    public Godziny(Time godzMin, Time godzMax)
    {
        this.godzMin = godzMin;
        this.godzMax = godzMax;
    }

    public long getId()
    {
        return id;
    }

    public Time getGodzMin()
    {
        return godzMin;
    }

    public Time getGodzMax()
    {
        return godzMax;
    }
}
