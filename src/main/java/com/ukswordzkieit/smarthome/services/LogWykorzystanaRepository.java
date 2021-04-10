package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Godziny;
import com.ukswordzkieit.smarthome.models.database.Logwykorzystana;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface LogWykorzystanaRepository extends CrudRepository<Logwykorzystana, Integer>
{
    List<Logwykorzystana> findByData(Date data);

    //List<Logwykorzystana> findByWykorzystanaEnergia(double energia);

    List<Logwykorzystana> findByKwota(double kwota);

    Logwykorzystana findById(int id);
}
