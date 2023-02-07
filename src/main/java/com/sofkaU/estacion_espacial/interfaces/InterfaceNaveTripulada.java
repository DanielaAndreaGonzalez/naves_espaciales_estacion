/**
 * 
 */
package com.sofkaU.estacion_espacial.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.naveEspacialTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 07/02/2023
 * Interface que contiene el CRUD con spring JPA para la tabla de nave tripulada 
 * Interface class containing the CRUD with JPA spring for the drone table
 */

@Repository
public interface InterfaceNaveTripulada extends CrudRepository<naveEspacialTripulada, Integer>{
	@Query(value="select * from nave_espacial_tripulada  where nombre like %:nombre%",nativeQuery = true)//busqueda por un solo campo
    List<naveEspacialTripulada> findByName(String nombre);

}
