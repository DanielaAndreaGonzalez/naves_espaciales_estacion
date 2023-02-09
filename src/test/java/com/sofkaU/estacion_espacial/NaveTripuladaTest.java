package com.sofkaU.estacion_espacial;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.sofkaU.estacion_espacial.interfaces.InterfaceNaveTripulada;
import com.sofkaU.estacion_espacial.modelo.naveEspacialTripulada;

/**
 * 
 * @author GonzalezHDanielaA
 *@since 08/02/2023
 */

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class NaveTripuladaTest {
	
	
	@Autowired
	private InterfaceNaveTripulada interfaceNaveTripulada;
	
	@Test
	@Rollback(false)
	public void testBuscarNaveLanzaderaPorNombre()
	{
		String nombre = "Venus";
		naveEspacialTripulada naveTripulada = interfaceNaveTripulada.findByNombre(nombre);
		assertThat(naveTripulada.getNombre()).isEqualTo(nombre);		
	}
	
	
	
	

}
