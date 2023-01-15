package com.microcontroladores.controller;

import com.microcontroladores.entity.rele1_entity;
import com.microcontroladores.service.rele1_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rele1")
public class rele1_controller {

    @Autowired
    rele1_service rele1_service;

    @GetMapping()
    public ArrayList<rele1_entity> getalldata(){

        return rele1_service.getAllrele1();
    }
    @PostMapping
    public rele1_entity saveDriver(@RequestBody rele1_entity rele1) {
        return rele1_service.saverele1(rele1);
    }
}
