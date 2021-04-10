package com.ukswordzkieit.smarthome.services;

import com.ukswordzkieit.smarthome.models.database.Sredniamocpozostale;
import org.springframework.data.repository.CrudRepository;

import java.util.LinkedList;
import java.util.List;

public interface SredniamocpozostaleRepository extends CrudRepository<Sredniamocpozostale, Integer>
{
    List<Sredniamocpozostale> findByTypDnia(String typDnia);
    List<Sredniamocpozostale> findByGodzMin(String godzMin);
    List<Sredniamocpozostale> findByGodzMax(String godzMax);
    List<Sredniamocpozostale> findByMoc(String moc);
    Sredniamocpozostale findById(int id);
}
