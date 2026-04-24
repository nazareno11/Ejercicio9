package com.prog4.Ejercicio9.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Productor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String cuit;
    @OneToMany(mappedBy = "productor")
    private List<Campo> campos = new ArrayList<>();
    @OneToOne(mappedBy = "productor", cascade = CascadeType.ALL)
    private PerfilProductor perfilProductor;  
}
