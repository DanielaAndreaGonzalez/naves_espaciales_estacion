/**
 * 
 */
package com.sofkaU.estacion_espacial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.sofkaU.estacion_espacial.interfaces.InterfaceVehiculoLanzadera;
import com.sofkaU.estacion_espacial.modelo.TipoNave;
import com.sofkaU.estacion_espacial.modelo.TipoObjetivoTripuladas;
import com.sofkaU.estacion_espacial.modelo.VehiculoLanzadera;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.*;

/**
 * @author GonzalezHDanielaA
 *	@since 08/02/2023
 *
 */

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class VehiculoLanzaderaTest {
	
	@Autowired
	private InterfaceVehiculoLanzadera interfaceVehiculoLanzadera;
	
	@Test
	@Rollback(false)
	public void guardarVehiculoLanzadera() {	
		VehiculoLanzadera vehiculoLanzadera2 = new VehiculoLanzadera("Jupiter 10.8", "Colombia", new Date(), 1200, 1500, 800, TipoNave.VEHICULOLANZADERA, 2000, "ACPM", 1000, null, "MANTENIMIENTOSATELITES");
		interfaceVehiculoLanzadera.save(vehiculoLanzadera2);
		assertNotNull(vehiculoLanzadera2);
		
	}
	

}
