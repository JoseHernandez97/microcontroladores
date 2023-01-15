package com.microcontroladores.repository;

import com.microcontroladores.entity.rele2_entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rele2_repository extends CrudRepository<rele2_entity,Integer> {



}
