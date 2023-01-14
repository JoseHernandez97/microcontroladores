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
    /*
    public HashMap<Object, Object> getlasttemperature(){
        HashMap<Object, Object> temperature = new HashMap<>();
        temperature_humidity_entity temperatura = temperatureHumidityRepository.getlasttemperature();
        temperature.put("Temperatura", temperatura);

        return temperature;
    }
     */

   public temperature_humidity_entity getlastdata(){
       return temperatureHumidityRepository.getlastdata();

   }



}
