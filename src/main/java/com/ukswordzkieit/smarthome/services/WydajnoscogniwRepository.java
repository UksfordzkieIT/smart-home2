package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Wydajnoscogniw;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WydajnoscogniwRepository extends CrudRepository<Wydajnoscogniw, Integer>
{
    List<Wydajnoscogniw> findByIdMiesiaca(int i);

    List<Wydajnoscogniw> findByIdGodzA(int i);

    List<Wydajnoscogniw> findByIdGodzB(int i);

    List<Wydajnoscogniw> findByChmuryMin(int i);

    List<Wydajnoscogniw> findByChmuryMax(int i);

    List<Wydajnoscogniw> findByMoc(int i);

    Wydajnoscogniw findById(int i);
}
