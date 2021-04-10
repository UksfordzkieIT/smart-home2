package com.ukswordzkieit.smarthome.models.database;

import javax.persistence.*;

@Entity
@Table(name = "sredniamocpozostale0_")
public class Sredniamocpozostale
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String typDnia;

    @Column
    String godzMin;

   @Column
    String godzMax;

    @Column
    String moc;

    public Sredniamocpozostale()
    {

    }

    public Sredniamocpozostale(String typDnia, String godzMin, String godzMax, String moc )
    {
        this.typDnia = typDnia;
        this.godzMin = godzMin;
        this.godzMax = godzMax;
        this.moc = moc;
    }

    public int getId()
    {
        return id;
    }

    public String getTypDnia()
    {
        return typDnia;
    }

    public String getGodzMin()
    {
        return godzMin;
    }

    public String getGodzMax()
    {
        return godzMax;
    }

    public String getMoc()
    {
        return moc;
    }
}
