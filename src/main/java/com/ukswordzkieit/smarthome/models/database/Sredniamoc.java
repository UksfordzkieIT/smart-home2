package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "sredniamoc0_")
public class Sredniamoc
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String temperaturaMax;

    @Column
    String temperaturaMin;

    @Column
    String moc;

    @Column
    String podtrzymanie;

    @Column
    String czas;

    public Sredniamoc(){}

    public Sredniamoc(String temperaturaMax,
                      String temperaturaMin,
                      String moc,
                      String podtrzymanie,
                      String czas )
    {
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.moc = moc;
        this.podtrzymanie = podtrzymanie;
        this.czas = czas;
    }

    public int getId()
    {
        return id;
    }

    public String getTemperaturaMax()
    {
        return temperaturaMax;
    }

    public String getTemperaturaMin()
    {
        return temperaturaMin;
    }

    public String getMoc()
    {
        return moc;
    }

    public String getPodtrzymanie()
    {
        return podtrzymanie;
    }

    public String getCzas()
    {
        return czas;
    }
}
