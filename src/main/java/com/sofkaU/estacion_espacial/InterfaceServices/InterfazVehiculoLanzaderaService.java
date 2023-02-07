/**
 * 
 */
package com.sofkaU.estacion_espacial.InterfaceServices;

import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;

import java.util.List;
import java.util.Optional;
/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * Interfaz que contiene los métodos de lógica de negocio para el vehiculo lanzadera
 * Interface containing the business logic methods for the shuttle vehicle
 */
public interface InterfazVehiculoLanzaderaService {
	
	/**
	 * Método que permite listar las naves lanzadera
	 * @return listado de vehiculos lanzadera
	 */
	public List<VehiculoLanzadera> listar();
	public Optional<VehiculoLanzadera> listarId(int id);
	
	/**
	 * Método que permite guardar un vehiculo lanzadera 
	 * @param vehiculo {@link VehiculoLanzadera} objeto vehiculo a guardar
	 * @return vehiculo lanzadera guardado
	 */
	public VehiculoLanzadera guardarLanzadera(VehiculoLanzadera vehiculo);
	
	/**
	 * Método que permite listar las naves lanzadera filtradas por nombre
	 * @return listado de vehiculos lanzadera
	 */
	public List<VehiculoLanzadera> listarPorNombre(String nombre);

}
