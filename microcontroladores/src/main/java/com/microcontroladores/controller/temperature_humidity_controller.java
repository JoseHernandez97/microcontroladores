package com.microcontroladores.controller;

import com.microcontroladores.entity.temperature_humidity_entity;
import com.microcontroladores.service.temperature_humidity_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/TempHum")
public class temperature_humidity_controller {

    @Autowired
    temperature_humidity_service temperatureHumidityService;

    @GetMapping()
    public ArrayList<temperature_humidity_entity> getalldata(){

        return temperatureHumidityService.getAlldata();
    }
    @GetMapping("/Last")
    public temperature_humidity_entity lasthumidity(){
        return temperatureHumidityService.getlastdata();
    }

    /*@GetMapping("/Temp")
    public HashMap<Object, Object> lastemperature(){
        return temperatureHumidityService.getlasttemperature();
    }

     */
    @PostMapping
    public temperature_humidity_entity saveDriver(@RequestBody temperature_humidity_entity TemHumd) {
        return temperatureHumidityService.savedata(TemHumd);
    }

}
