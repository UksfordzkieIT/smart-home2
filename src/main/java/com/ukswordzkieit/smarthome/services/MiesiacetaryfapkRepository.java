package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Miesiacetaryfapk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MiesiacetaryfapkRepository extends CrudRepository<Miesiacetaryfapk, Integer>
{
    List<Miesiacetaryfapk> findByMiesiace(String miesiace);

    Miesiacetaryfapk findById(int id);
}
