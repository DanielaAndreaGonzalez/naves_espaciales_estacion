/**
 * 
 */
package com.sofkaU.estacion_espacial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazNaveTripuladaService;
import com.sofkaU.estacion_espacial.interfaces.InterfaceNaveTripulada;
import com.sofkaU.estacion_espacial.modelo.naveEspacialTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 * clase que implementa los métodos de lógica de negocio de la interfaz de Nave tripulada service
 * class that implements the business logic methods of the service Manned nave interface
 */

@Service
public class NaveTripuladaService implements InterfazNaveTripuladaService{

	/**
	 * Bean de interface nave tripulada inyectado para ejecutar el crud
	 */
	
	@Autowired
	private InterfaceNaveTripulada data;
	
	
	@Override
	public List<naveEspacialTripulada> listar() {
		return (List<naveEspacialTripulada>)data.findAll() ;
	}

	@Override
	public naveEspacialTripulada guardarNaveTripulada(naveEspacialTripulada naveTripulada) {
		// TODO Auto-generated method stub
		return this.data.save(naveTripulada);
	}

	@Override
	public List<naveEspacialTripulada> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		return (List<naveEspacialTripulada>) data.findByName(nombre);
	};

	
	

}
