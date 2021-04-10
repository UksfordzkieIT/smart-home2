package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Miesiaceogniwapk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MiesiaceogniwapkRepository extends CrudRepository<Miesiaceogniwapk, Integer>
{
    List<Miesiaceogniwapk> findByMiesiace(String miesiace);

    Miesiaceogniwapk findById(int id);
}
