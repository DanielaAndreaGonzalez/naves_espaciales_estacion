/**
 * 
 */
package com.sofkaU.estacion_espacial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazNaveNoTripuladaService;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 09/02/2023
 *
 *Controlador que manipula el flujo de los servicios 
 *Rest de microservicios de naves no tripuladas
 *
 *Controller that manipulates the flow of services
 *Rest of drone microservices
 *
 *
 *
 */
@RestController
@RequestMapping("/naves")
@CrossOrigin("https://proyecto-nave.web.app/")
public class ControladorNaveNoTripulada {
	
	@Autowired
	private InterfazNaveNoTripuladaService interfazNaveNoTripuladaService;
	
	
	//Metodo que permite listar todas las naves que se encuentren en el inventario de la categoria nave no tripulada
	//Method that allows to list all the naves that are in the inventory of the unmanned naves category
	
	@GetMapping
	@RequestMapping(value = "listarNaveNoTripulada", method = RequestMethod.GET)	
	public ResponseEntity<?> listarLanzadera(){
		List<naveEspacialNoTripulada> naveNoTripulada = this.interfazNaveNoTripuladaService.listar();
		return ResponseEntity.ok(naveNoTripulada);
	}
	
	//Metodo que permite guardar las naves no tripuladas 
	//Method that allows to save the naves unmanned category 
	
	@PostMapping
	@RequestMapping(value = "guardarNaveNoTripulada", method = RequestMethod.POST)
	public ResponseEntity<?> guardarNaveNoTripulada(@RequestBody naveEspacialNoTripulada naveNoTripulada ){
		
		naveEspacialNoTripulada noTripulada = this.interfazNaveNoTripuladaService.guardarNaveNoTripulada(naveNoTripulada);
		return ResponseEntity.status(HttpStatus.CREATED).body(noTripulada);
		
	}
	
	//Method que permite buscar por nombre una nave en especifico
	//Method that allows you to search by name for a specific nave

	
	@GetMapping("/buscarNaveNoTripulada/{nombre}")	
	public ResponseEntity<?> buscarNombreNoTripulada(@PathVariable String nombre ){
		List<naveEspacialNoTripulada> listavehiculoLan = this.interfazNaveNoTripuladaService.listarPorNombre(nombre);
		return ResponseEntity.status(HttpStatus.CREATED).body(listavehiculoLan);
		
	}
	

}
