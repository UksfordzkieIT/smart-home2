package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "miesiacetaryfapk0_")
public class Miesiacetaryfapk
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String miesiace;

    public Miesiacetaryfapk() {

    }

    public Miesiacetaryfapk(String miesiace)
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
