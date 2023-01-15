package com.microcontroladores.service;

import com.microcontroladores.entity.rele2_entity;
import com.microcontroladores.repository.rele2_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class rele2_service {

    @Autowired
    rele2_repository rele2_repository;

    public ArrayList<rele2_entity> getAllrele2(){
        return (ArrayList<rele2_entity>) rele2_repository.findAll();
    }

    public rele2_entity saverele2(rele2_entity rele2){
        return rele2_repository.save(rele2);
    }

    public HashMap<Object, Object> lastRele2(){
        HashMap<Object, Object> status = new HashMap<>();
        status.put("status", rele2_repository.lastrele2());
        return status;
    }
}
