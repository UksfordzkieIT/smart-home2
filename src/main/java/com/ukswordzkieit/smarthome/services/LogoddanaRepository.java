package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Godziny;
import com.ukswordzkieit.smarthome.models.database.Logoddana;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

import java.util.List;

public interface LogoddanaRepository extends CrudRepository<Logoddana, Integer>
{
    List<Logoddana> findByData(Date data);

    List<Logoddana> findByKwota(double kwota);

    Logoddana findById(int id);
}
