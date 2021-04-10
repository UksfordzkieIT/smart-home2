package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "miesiaceogniwapk0_")
public class Miesiacegniwapk
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String miesiace;

    public Miesiacegniwapk(){}

    public Miesiacegniwapk(String miesiace)
    {
        this.miesiace = miesiace;
    }

    public int getId()
    {
        return id;
    }

    public String getMiesiace()
    {
        return miesiace;
    }
}
