package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Sredniamoc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SredniamocRepository extends CrudRepository<Sredniamoc, Integer>
{
    List<Sredniamoc> findByTemperaturaMax(String tmp);

    List<Sredniamoc> findByTemperaturaMin(String tmp);

    List<Sredniamoc> findByMoc(String moc);

    List<Sredniamoc> findByPodtrzymanie(String moc);

    List<Sredniamoc> findByCzas(String czas);

    Sredniamoc findById(int id);
}
