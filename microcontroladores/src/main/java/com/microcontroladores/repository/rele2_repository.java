package com.microcontroladores.repository;

import com.microcontroladores.entity.rele2_entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rele2_repository extends CrudRepository<rele2_entity,Integer> {

    @Query(value = "SELECT status from rele2 order by id desc limit 1", nativeQuery = true)
    Object lastrele2();

}
