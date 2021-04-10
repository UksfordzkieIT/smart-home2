package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "oczekiwanatemperatura0_")
public class Oczekiwanatemperatura
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String typDnia;

    @Column
    String godzinaMin;

    @Column
    String godzinaMax;

    @Column
    int temperatura;

    public Oczekiwanatemperatura()
    {

    }

    public Oczekiwanatemperatura(String typDnia, String godzinaMin, String godzinaMax, int temperatura)
    {
        this.typDnia = typDnia;
        this.godzinaMin = godzinaMin;
        this.godzinaMax = godzinaMax;
        this.temperatura = temperatura;
    }

    public int getId()
    {
        return id;
    }

    public String getTypDnia()
    {
        return typDnia;
    }

    public String getGodzinaMin()
    {
        return godzinaMin;
    }

    public void setGodzinaMax(String godzinaMax)
    {
        this.godzinaMax = godzinaMax;
    }

    public int getTemperatura()
    {
        return temperatura;
    }
}
