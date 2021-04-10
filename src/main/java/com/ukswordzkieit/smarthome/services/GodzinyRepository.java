package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Godziny;
import org.springframework.data.repository.CrudRepository;

import java.sql.Time;
import java.util.List;

public interface GodzinyRepository extends CrudRepository<Godziny, Long>
{
    List<Godziny> findByGodzMin(Time godzMin);

    List<Godziny> findByGodzMax(Time godzMax);

    Godziny findById(long id);
}
