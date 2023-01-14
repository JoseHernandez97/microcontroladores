package com.microcontroladores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="temperature")
public class temperature_humidity_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;

    @Getter
    @Setter
    private String temperatura;

    @Getter
    @Setter
    private String humedad;
}
