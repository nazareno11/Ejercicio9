package com.prog4.Ejercicio9.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Campo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column (nullable = false)
    private Double hectareasTotales;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Productor productor;

    @OneToMany(mappedBy = "campo")
    private List<Lote> lotes = new ArrayList<>();
}
