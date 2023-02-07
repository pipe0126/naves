package com.co.sofka.naves.repository;

import com.co.sofka.naves.model.Naves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz que extiende de JPA y permite
 * realizar las operaciones sobre la bd, se
 * crea un metodo especifico con su query.
 *
 * @author Andres Amortegui
 * @version 01.01.001 06/02/2023
 * @since 01.
 */
@Repository
public interface INaveRepository extends JpaRepository<Naves, Long> {
}
