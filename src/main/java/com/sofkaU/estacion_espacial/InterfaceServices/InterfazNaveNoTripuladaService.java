/**
 * 
 */
package com.sofkaU.estacion_espacial.InterfaceServices;

import java.util.List;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 07/02/2023
 * Interfaz que contiene los métodos de lógica de negocio para la nave no tripulada
 * Interface containing business logic methods for the unmanned nave
 *
 */
public interface InterfazNaveNoTripuladaService {

	/**
	 * Método que permite listar las naves no tripuladas
	 * @return listado de naves no tripuladas
	 */
	public List<naveEspacialNoTripulada> listar();	
	/**
	 * Método que permite guardar una nave no tripulada
	 * @param vehiculo {@link naveEspacialNoTripulada} objeto nave a guardar
	 * @return nave no tripulada
	 */
	public naveEspacialNoTripulada guardarNaveNoTripulada(naveEspacialNoTripulada noTripulada);
	
	/**
	 * Método que permite listar las naves lanzadera filtradas por nombre
	 * @return listado de vehiculos lanzadera
	 */
	public List<naveEspacialNoTripulada> listarPorNombre(String nombre);
	
}
