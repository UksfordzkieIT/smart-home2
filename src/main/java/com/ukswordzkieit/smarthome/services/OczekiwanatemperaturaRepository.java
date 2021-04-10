package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Oczekiwanatemperatura;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OczekiwanatemperaturaRepository extends CrudRepository<Oczekiwanatemperatura, Integer>
{
    List<Oczekiwanatemperatura> findByGodzinaMin(String godzina);

    List<Oczekiwanatemperatura> findByGodzinaMax(String godzina);

    List<Oczekiwanatemperatura> findByTemperatura(int temp);

    Oczekiwanatemperatura findById(int id);
}
