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

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazNaveTripuladaService;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.naveEspacialTripulada;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 *
 *Controlador que manipula el flujo de los servicios 
 *Rest de microservicios de naves tripuladas
 *
 */
@RestController
@RequestMapping("/naves")
@CrossOrigin("https://proyecto-nave.web.app/")
public class ControladorNaveTripulada {

	@Autowired
	private InterfazNaveTripuladaService interfazNaveTripuladaService;
	
	@GetMapping
	@RequestMapping(value = "listarNaveTripulada", method = RequestMethod.GET)	
	public ResponseEntity<?> listarNaveTripulada(){
		List<naveEspacialTripulada> naveTripulada = this.interfazNaveTripuladaService.listar();
		return ResponseEntity.ok(naveTripulada);
	}
		
	@PostMapping
	@RequestMapping(value = "guardarNaveTripulada", method = RequestMethod.POST)
	public ResponseEntity<?> guardarVehiculo(@RequestBody naveEspacialTripulada naveTripuladaEspacial ){
		
		naveEspacialTripulada naveTripulada = this.interfazNaveTripuladaService.guardarNaveTripulada(naveTripuladaEspacial);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(naveTripulada);
		
	}


	@GetMapping("/buscarNaveTripulada/{nombre}")	
	public ResponseEntity<?> buscarNombreTripulada(@PathVariable String nombre ){
		List<naveEspacialTripulada> listavehiculoLan = this.interfazNaveTripuladaService.listarPorNombre(nombre);
		return ResponseEntity.status(HttpStatus.CREATED).body(listavehiculoLan);
		
	}




}
