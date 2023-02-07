package com.co.sofka.naves.service;


import com.co.sofka.naves.model.Naves;
import com.co.sofka.naves.repository.INaveRepository;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**
 * Servicio implemente la interfaz del repositorio
 * para acceder a los metodos jpa y el los metodos
 * especificos que se hayan creado.
 *
 * @author Andres Amortegui
 * @version 01.01.001 06/02/2023
 * @since 01.
 */
@Service
public class NaveService {

    final
    INaveRepository naveRepository;

    final
    ModelMapper modelMapper;

    public NaveService(INaveRepository naveRepository, ModelMapper modelMapper) {
        this.naveRepository = naveRepository;
        this.modelMapper = modelMapper;
    }

    /**
     * Permite obtener todas las naves almacenadas.
     *
     * @return lista de Naves.
     */
    public ArrayList<Naves> getNaveAll(){
        return (ArrayList<Naves>) naveRepository.findAll();
    }

    /**
     * Permite guardar en base de datos una Nave
     *
     * @param naves a ser almacenada
     * @return nave almacenada con su id incluido
     */
    public Naves saveNave(Naves naves){
        return naveRepository.save(naves);
    }

    /**
     * Obtiene un objeto entity a partir de su id
     *
     * @param idNave id de la nave a buscar
     * @return objeto completo encontrado.
     */
    public Naves getNaveId(Long idNave){
        return naveRepository.findById(idNave).orElseThrow();
    }

    /**
     * Permite eliminar un elemento apartir de su id.
     *
     * @param idNave id para buscar el elemento
     * @return true o false.
     */
    public Boolean deleteNave(Long idNave){
        try {
            naveRepository.delete(getNaveId(idNave));
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
