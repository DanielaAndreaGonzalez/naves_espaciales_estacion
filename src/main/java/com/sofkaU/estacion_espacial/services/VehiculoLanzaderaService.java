/**
 * 
 */
package com.sofkaU.estacion_espacial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazVehiculoLanzaderaService;
import com.sofkaU.estacion_espacial.interfaces.InterfaceVehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;


/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 *
 * clase que implementa los métodos de lógica de negocio de la interfaz de vehiculo lanzadera service
 * class that implements the business logic methods of the vehicle interface lanzadera service
 */
@Service
public class VehiculoLanzaderaService implements InterfazVehiculoLanzaderaService{

	/**
	 * Bean de interface vehiculo lanzadera inyectado para ejecutar el crud
	 */
	
	@Autowired
	private InterfaceVehiculoLanzadera data;
	
	@Override
	public List<VehiculoLanzadera> listar() {
		// TODO Auto-generated method stub
		return (List<VehiculoLanzadera>) data.findAll();
	}

	@Override
	public Optional<VehiculoLanzadera> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public VehiculoLanzadera guardarLanzadera(VehiculoLanzadera vehiculo) {
		// TODO Auto-generated method stub
		return this.data.save(vehiculo);
	}
	
	@Override
	public List<VehiculoLanzadera> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return (List<VehiculoLanzadera>) data.findByName(nombre);
	}
	
	
	
	

}
