/**
 * 
 */
package com.sofkaU.estacion_espacial.controlador;

import java.util.Date;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sofkaU.estacion_espacial.InterfaceServices.InterfazVehiculoLanzaderaService;
import com.sofkaU.estacion_espacial.modelo.TipoNave;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;


/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 11/07/2022
 *
 *Controlador que manipula el flujo de los servicios 
 *Rest de microservicios de nvehiculos lanzadera
 */
@RestController
@RequestMapping("/naves")
@CrossOrigin("https://proyecto-nave.web.app/")
public class ControladorVehiculoLanzadera {
	
	@Autowired
	private InterfazVehiculoLanzaderaService interfazVehiculoLanzaderaService;
	
	@GetMapping
	@RequestMapping(value = "listarVehiculoLanzadera", method = RequestMethod.GET)	
	public ResponseEntity<?> listarLanzadera(){
		List<VehiculoLanzadera> vehiculoLanzadera = this.interfazVehiculoLanzaderaService.listar();
		return ResponseEntity.ok(vehiculoLanzadera);
	}
	
	
//	@GetMapping
//	@RequestMapping(value = "guardarVehiculoLanzadera", method = RequestMethod.GET)	
//	public VehiculoLanzadera guardar(){		
//		VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera("Jupiter", "Colombia", new Date(), 1324, 1234, 1234, TipoNave.NAVENOTRIPULADA, 1344, "ACPM", 1234, 1344, "Carga");			
//		return  this.interfazVehiculoLanzaderaService.guardarLanzadera(vehiculoLanzadera);
//	}
	
	
	@PostMapping
	@RequestMapping(value = "guardarVehiculoLanzadera", method = RequestMethod.POST)
	public ResponseEntity<?> guardarVehiculo(@RequestBody VehiculoLanzadera vehiculo ){
		
		VehiculoLanzadera vehiculoLan = this.interfazVehiculoLanzaderaService.guardarLanzadera(vehiculo);
		return ResponseEntity.status(HttpStatus.CREATED).body(vehiculoLan);
		
	}
	
	@GetMapping("/buscarVehiculoLanzadera/{nombre}")	
	public ResponseEntity<?> buscarNombreLanzadera(@PathVariable String nombre ){
		List<VehiculoLanzadera> listavehiculoLan = this.interfazVehiculoLanzaderaService.listarPorNombre(nombre);
		return ResponseEntity.status(HttpStatus.CREATED).body(listavehiculoLan);
		
	}
	
	
}
