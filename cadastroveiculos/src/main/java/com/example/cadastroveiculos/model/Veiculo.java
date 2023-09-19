package com.example.cadastroveiculos.model;
import jakarta.persistence.*;




@Entity
public class Veiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String montadora;
    private String modelo;
    private int ano;


    // getters e setters
}
