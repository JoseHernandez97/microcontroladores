package com.microcontroladores.repository;

import com.microcontroladores.entity.temperature_humidity_entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface temperature_humidity_repository extends CrudRepository<temperature_humidity_entity,Integer> {

    @Query( value = "select * from temperature order by id desc limit 1",
            nativeQuery = true)
    temperature_humidity_entity getlastdata ();

}
