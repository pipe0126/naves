package com.co.sofka.naves.controller;

import com.co.sofka.naves.model.Naves;
import com.co.sofka.naves.service.NaveService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Controller que contiene los endPoints
 * que seran consumidos por el cliente
 *
 * @author Andres Amortegui
 * @version 01.01.001 06/02/2023
 * @since 01.
 */
@CrossOrigin(origins = {"*"}, maxAge = 3600, allowCredentials = "false")
@RestController
@RequestMapping("/nave")
public class NavesController {

    final
    NaveService naveService;


    public NavesController(NaveService naveService) {
        this.naveService = naveService;
    }

    /**
     * EndPoint que permite obtener todas las naves.
     *
     * @return lista de todas las naves.
     */
    @GetMapping
    public ArrayList<Naves> getAllNaves() {
        return this.naveService.getNaveAll();
    }

    @PostMapping
    public Naves saveNaves(@RequestBody Naves naves) {
        return this.naveService.saveNave(naves);
    }

    /**
     * Permite eliminar una nave a partir del id
     *
     * @param idNave id de la tarea a ser eliminado
     * @return string con la operacion indicada.
     */
    @DeleteMapping("/deleteNaves")
    public String deleteNaves(@RequestParam("idNave") Long idNave) {

        Boolean answer = naveService.deleteNave(idNave);
        if (answer) {
            return "se elimino correctamente";
        }
        return "No se pudo eliminar por favor intente de nuevo";
    }
}
