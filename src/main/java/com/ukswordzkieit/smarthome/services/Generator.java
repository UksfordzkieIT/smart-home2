package com.ukswordzkieit.smarthome.services;

import java.util.Random;

public class Generator {
    //Srednia temperatura w miesiącu
    static final double STYCZEN_SREDNIA_TEMP = 0.0;
    static final double LUTY_SREDNIA_TEMP = -3.6;
    static final double MARZEC_SREDNIA_TEMP = -0.7;
    static final double KWIECIEN_SREDNIA_TEMP = 13.3;
    static final double MAJ_SREDNIA_TEMP = 16.6;
    static final double CZERWIEC_SREDNIA_TEMP = 18.1;
    static final double LIPIEC_SREDNIA_TEMP = 19.5;
    static final double SIERPIEN_SREDNIA_TEMP = 19.7;
    static final double WRZESIEN_SREDNIA_TEMP = 14.7;
    static final double PAZDZIERNIK_SREDNIA_TEMP = 9.2;
    static final double LISTOPAD_SREDNIA_TEMP = 3.4;
    static final double GRUDZIEN_SREDNIA_TEMP = 0.1;
    private double[] temperatury = {STYCZEN_SREDNIA_TEMP, LUTY_SREDNIA_TEMP, MARZEC_SREDNIA_TEMP, KWIECIEN_SREDNIA_TEMP,
    MAJ_SREDNIA_TEMP, CZERWIEC_SREDNIA_TEMP, LIPIEC_SREDNIA_TEMP, SIERPIEN_SREDNIA_TEMP, WRZESIEN_SREDNIA_TEMP,
    PAZDZIERNIK_SREDNIA_TEMP, LISTOPAD_SREDNIA_TEMP, GRUDZIEN_SREDNIA_TEMP};

    //Roznice w temperaturach
    private final double STYCZEN_ROZNICA_TEMP = 5.4;
    private final double LUTY_ROZNICA_TEMP = 5.5;
    private final double MARZEC_ROZNICA_TEMP = 6.9;
    private final double KWIECIEN_ROZNICA_TEMP = 9.8;
    private final double MAJ_ROZNICA_TEMP = 10.3;
    private final double CZERWIEC_ROZNICA_TEMP = 10;
    private final double LIPIEC_ROZNICA_TEMP = 10;
    private final double SIERPIEN_ROZNICA_TEMP = 10.1;
    private final double WRZESIEN_ROZNICA_TEMP = 9.2;
    private final double PAZDZIERNIK_ROZNICA_TEMP = 7.6;
    private final double LISTOPAD_ROZNICA_TEMP = 5.4;
    private final double GRUDZIEN_ROZNICA_TEMP = 4.6;
    private double[] roznicaTemperatury = {STYCZEN_ROZNICA_TEMP, LUTY_ROZNICA_TEMP, MARZEC_ROZNICA_TEMP, KWIECIEN_ROZNICA_TEMP, MAJ_ROZNICA_TEMP,
    CZERWIEC_ROZNICA_TEMP, LIPIEC_ROZNICA_TEMP, SIERPIEN_ROZNICA_TEMP, WRZESIEN_ROZNICA_TEMP, PAZDZIERNIK_ROZNICA_TEMP, LISTOPAD_ROZNICA_TEMP, GRUDZIEN_ROZNICA_TEMP};

    //Minimalna temperatura
    private final double STYCZEN_MIN = -5.5;
    private final double LUTY_MIN = -4.2;
    private final double MARZEC_MIN = -0.9;
    private final double KWIECIEN_MIN = 3;
    private final double MAJ_MIN = 8;
    private final double CZERWIEC_MIN = 11.2;
    private final double LIPIEC_MIN = 12.6;
    private final double SIERPIEN_MIN = 12.3;
    private final double WRZESIEN_MIN = 9.1;
    private final double PAZDZIERNIK_MIN = 5.1;
    private final double LISTOPAD_MIN = 0.8;
    private final double GRUDZIEN_MIN = -3.1;
    private double[] minTemperatury = {STYCZEN_MIN, LUTY_MIN,MARZEC_MIN, KWIECIEN_MIN, MAJ_MIN, CZERWIEC_MIN, LIPIEC_MIN, SIERPIEN_MIN,
        WRZESIEN_MIN, PAZDZIERNIK_MIN, LISTOPAD_MIN, GRUDZIEN_MIN};

    //Srednie zachmurzenie w miesiącu
    static final double STYCZEN_SREDNIA_ZACH = 88.9;
    static final double LUTY_SREDNIA_ZACH = 85.2;
    static final double MARZEC_SREDNIA_ZACH = 72.6;
    static final double KWIECIEN_SREDNIA_ZACH = 63.1;
    static final double MAJ_SREDNIA_ZACH = 67.9;
    static final double CZERWIEC_SREDNIA_ZACH = 68.3;
    static final double LIPIEC_SREDNIA_ZACH = 67.4;
    static final double SIERPIEN_SREDNIA_ZACH = 65.1;
    static final double WRZESIEN_SREDNIA_ZACH = 62.1;
    static final double PAZDZIERNIK_SREDNIA_ZACH = 70.6;
    static final double LISTOPAD_SREDNIA_ZACH = 81.8;
    static final double GRUDZIEN_SREDNIA_ZACH = 84.5;
    static final double SREDNIA_ZACHMURZENIA = 11.6;
    private double[] zachmurzenie = {STYCZEN_SREDNIA_ZACH, LUTY_SREDNIA_ZACH, MARZEC_SREDNIA_ZACH, KWIECIEN_SREDNIA_ZACH, MAJ_SREDNIA_ZACH,
    CZERWIEC_SREDNIA_ZACH, LIPIEC_SREDNIA_ZACH, SIERPIEN_SREDNIA_ZACH, WRZESIEN_SREDNIA_ZACH, PAZDZIERNIK_SREDNIA_ZACH, LISTOPAD_SREDNIA_ZACH, GRUDZIEN_SREDNIA_ZACH};

    public Boolean IsDay(double godzina, int miesiac){

            return true;

    }

    public double[] Generate(double godzina, int miesiac){
        double[] tempZach = new double[2];
        //dzien
        if(IsDay(godzina, miesiac))
        {
            Random random = new Random();
            double rand = random.nextDouble();
            double scaled = rand * roznicaTemperatury[miesiac - 1];
            tempZach[0] = scaled + temperatury[miesiac - 1];
            rand = random.nextDouble();
            scaled = rand * SREDNIA_ZACHMURZENIA;
            double shifted = scaled - (SREDNIA_ZACHMURZENIA/2) + zachmurzenie[miesiac - 1];
            tempZach[1] = shifted;
        }
        //noc
        else
        {
            Random random = new Random();
            double rand = random.nextDouble();
            double scaled = rand * (Math.abs(minTemperatury[miesiac - 1]) + Math.abs(roznicaTemperatury[miesiac -1]));
            tempZach[0] = scaled + minTemperatury[miesiac - 1];
            tempZach[1] = 0;
        }
        return tempZach;
    }
}
