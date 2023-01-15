package com.microcontroladores.repository;

import com.microcontroladores.entity.rele1_entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rele1_repository extends CrudRepository<rele1_entity,Integer> {

    @Query(value = "SELECT status from rele1 order by id desc limit 1", nativeQuery = true)
    Object lastrele1();

}
