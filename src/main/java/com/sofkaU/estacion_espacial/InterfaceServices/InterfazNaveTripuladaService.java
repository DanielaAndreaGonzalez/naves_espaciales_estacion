/**
 * 
 */
package com.sofkaU.estacion_espacial.InterfaceServices;

import java.util.List;
import com.sofkaU.estacion_espacial.modelo.naveEspacialTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 07/02/2023
 * Interfaz que contiene los métodos de lógica de negocio para las naves tripulada
 *  Interface containing business logic methods for the manned nave
 * 
 */
public interface InterfazNaveTripuladaService {
	

	/**
	 * Método que permite listar las naves tripuladas
	 * @return listado de las naves espaciales tripuladas
	 */
	public List<naveEspacialTripulada> listar();
	
	/**
	 * Método que permite guardar una nave espacial tripulada 
	 * @param vehiculo {@link naveEspacialTripulada} objeto nave a guardar
	 * @return nave espacial tripulada
	 */
	public naveEspacialTripulada guardarNaveTripulada(naveEspacialTripulada naveTripulada);

	/**
	 * Método que permite listar las naves lanzadera filtradas por nombre
	 * @return listado de vehiculos lanzadera
	 */
	public List<naveEspacialTripulada> listarPorNombre(String nombre);
	
}
