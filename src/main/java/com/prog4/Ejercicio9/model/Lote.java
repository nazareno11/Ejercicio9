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
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer numero;
    @Column(nullable = false)
    private Double superficie;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Campo campo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Suelo suelo;

    @OneToMany(mappedBy = "lote")
    private List<Siembra> siembras = new ArrayList<>();

}
