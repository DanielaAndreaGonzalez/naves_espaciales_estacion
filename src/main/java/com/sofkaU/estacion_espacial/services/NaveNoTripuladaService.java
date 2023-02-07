/**
 * 
 */
package com.sofkaU.estacion_espacial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazNaveNoTripuladaService;
import com.sofkaU.estacion_espacial.interfaces.InterfaceNaveNoTripulada;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 *@author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * clase que implementa los métodos de lógica de negocio de la interfaz de vehiculo lanzadera service
 *class that implements the business logic methods of the vehicle interface lanzadera service
 */
@Service
public class NaveNoTripuladaService implements InterfazNaveNoTripuladaService{

	/**
	 * Bean de interface nave espacial no tripulada inyectado para ejecutar el crud
	 */
	@Autowired
	private InterfaceNaveNoTripulada interfaceNaveNoTripulada;
	
	@Override
	public List<naveEspacialNoTripulada> listar() {
		return (List<naveEspacialNoTripulada>)this.interfaceNaveNoTripulada.findAll();
	}

	@Override
	public naveEspacialNoTripulada guardarNaveNoTripulada(naveEspacialNoTripulada naveNoTripulada) {
		// TODO Auto-generated method stub
		return this.interfaceNaveNoTripulada.save(naveNoTripulada);
	}

	@Override
	public List<naveEspacialNoTripulada> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return  (List<naveEspacialNoTripulada>) interfaceNaveNoTripulada.findByName(nombre);
	}
}
