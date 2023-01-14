package com.microcontroladores.service;

import com.microcontroladores.entity.temperature_humidity_entity;
import com.microcontroladores.repository.temperature_humidity_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class temperature_humidity_service {

    @Autowired
    temperature_humidity_repository temperatureHumidityRepository;


    public ArrayList<temperature_humidity_entity> getAlldata(){
        return (ArrayList<temperature_humidity_entity>) temperatureHumidityRepository.findAll();
    }

    public temperature_humidity_entity savedata(temperature_humidity_entity TempHum){
        return temperatureHumidityRepository.save(TempHum);
    }
    public HashMap<Object, Object> lastTemp(){
        HashMap<Object, Object> temperature = new HashMap<>();
        temperature.put("temperatura", temperatureHumidityRepository.lasttemperature());
        return temperature;
    }
    public HashMap<Object, Object> lastHumd(){
        HashMap<Object, Object> temperature = new HashMap<>();
        temperature.put("humedad", temperatureHumidityRepository.lasthumidity());
        return temperature;
    }

}
