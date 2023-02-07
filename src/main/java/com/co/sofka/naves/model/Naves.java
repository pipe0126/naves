package com.co.sofka.naves.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Clase entity representa la tabla
 * donde se almacenara las naves.
 *
 *  @version  01.01.001 06/02/2023
 *  @author Andres Amortegui
 *
 *
 */
@Entity
public class Naves {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;



    private int potencia;


    private int velocidad;
    private String combustible;
    private float peso;
    private String nombre;
    private Naves() {


    }
    public Naves(Long id, int potencia, int velocidad, String combustible, float peso, String nombre) {
        this.id = id;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.peso = peso;
        this.nombre = nombre;


    }


    public Long getId() {
        return id;
    }
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naves naves = (Naves) o;
        return id.equals(naves.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
