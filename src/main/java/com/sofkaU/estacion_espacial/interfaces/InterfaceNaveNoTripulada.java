/**
 * 
 */
package com.sofkaU.estacion_espacial.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 07/02/2023
 * Clase Interface que contiene el CRUD con spring JPA para la tabla de nave no tripulada
 * Interface class containing the CRUD with JPA spring for the drone table
 *
 */
@Repository
public interface InterfaceNaveNoTripulada extends CrudRepository<naveEspacialNoTripulada, Integer>{
	
	@Query(value="select * from nave_espacial_no_tripulada  where nombre like %:nombre%",nativeQuery = true)//busqueda por un solo campo
    List<naveEspacialNoTripulada> findByName(String nombre);

	
}
