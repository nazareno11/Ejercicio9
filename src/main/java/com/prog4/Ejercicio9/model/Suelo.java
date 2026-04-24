package com.prog4.Ejercicio9.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Suelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private Double ph;

    @OneToMany(mappedBy = "suelo")
    private List<Lote> lotes = new ArrayList<>();

}
