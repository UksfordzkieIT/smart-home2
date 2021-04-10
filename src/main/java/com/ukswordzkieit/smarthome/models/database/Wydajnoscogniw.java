package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "wydajnoscogniw0_")
public class Wydajnoscogniw
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    int idMiesiaca;

    @Column
    int idGodzA;

    @Column
    int idGodzB;

    @Column
    int chmuryMin;

    @Column
    int chmuryMax;

    @Column
    int moc;

    public Wydajnoscogniw(){}

    public Wydajnoscogniw(int idMiesiaca, int idGodzA, int idGodzB, int chmuryMin, int chmuryMax, int moc)
    {
        this.idMiesiaca = idMiesiaca;
        this.idGodzA = idGodzA;
        this.idGodzB = idGodzB;
        this.chmuryMin = chmuryMin;
        this.chmuryMax = chmuryMax;
        this.moc = moc;
    }

    public int getIdMiesiaca()
    {
        return idMiesiaca;
    }

    public int getIdGodzA()
    {
        return idGodzA;
    }

    public int getIdGodzB()
    {
        return idGodzB;
    }

    public int getChmuryMin()
    {
        return chmuryMin;
    }

    public int getChmuryMax()
    {
        return chmuryMax;
    }

    public int getMoc()
    {
        return moc;
    }
}
