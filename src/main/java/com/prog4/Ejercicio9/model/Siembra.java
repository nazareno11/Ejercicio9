package com.prog4.Ejercicio9.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Siembra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Lote lote;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cultivo cultivo;

    @ManyToMany
    @JoinTable(
        name = "siembra_agroquimico",
        joinColumns = @JoinColumn(name = "siembra_id"),
        inverseJoinColumns = @JoinColumn(name = "agroquimico_id")
    )
    private List<Agroquimico> agroquimicos = new ArrayList<>();
}