package com.microcontroladores.service;

import com.microcontroladores.entity.rele1_entity;
import com.microcontroladores.repository.rele1_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class rele1_service {

    @Autowired
    rele1_repository rele1_repository;

    public ArrayList<rele1_entity> getAllrele1(){
        return (ArrayList<rele1_entity>) rele1_repository.findAll();
    }

    public rele1_entity saverele1(rele1_entity rele1){
        return rele1_repository.save(rele1);
    }

    public HashMap<Object, Object> lastRele1(){
        HashMap<Object, Object> status = new HashMap<>();
        status.put("status", rele1_repository.lastrele1());
        return status;
    }

}
