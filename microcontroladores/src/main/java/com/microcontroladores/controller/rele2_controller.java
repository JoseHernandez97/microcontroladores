package com.microcontroladores.controller;

import com.microcontroladores.entity.rele2_entity;
import com.microcontroladores.service.rele2_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/rele2")
public class rele2_controller {
    @Autowired
    rele2_service rele2_service;

    @GetMapping()
    public ArrayList<rele2_entity> getalldata(){

        return rele2_service.getAllrele2();
    }

    @GetMapping("/status")
    public HashMap<Object, Object> lastRele2(){
        return rele2_service.lastRele2();
    }

    @PostMapping
    public rele2_entity saveDriver(@RequestBody rele2_entity rele2) {
        return rele2_service.saverele2(rele2);
    }
}
