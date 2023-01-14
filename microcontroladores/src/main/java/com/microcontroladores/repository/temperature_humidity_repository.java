package com.microcontroladores.repository;

import com.microcontroladores.entity.temperature_humidity_entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface temperature_humidity_repository extends CrudRepository<temperature_humidity_entity,Integer> {
    @Query(value = "SELECT temperatura from temperature order by id desc limit 1", nativeQuery = true)
    Object lasttemperature();

    @Query(value = "SELECT humedad from temperature order by id desc limit 1", nativeQuery = true)
    Object lasthumidity();

}
