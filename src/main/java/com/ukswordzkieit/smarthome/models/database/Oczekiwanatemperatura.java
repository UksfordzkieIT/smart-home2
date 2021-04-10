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
}
