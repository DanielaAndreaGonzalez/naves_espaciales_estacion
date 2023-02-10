/**
 * 
 */
package com.sofkaU.estacion_espacial;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sofkaU.estacion_espacial.interfaces.InterfaceNaveNoTripulada;
import com.sofkaU.estacion_espacial.modelo.naveEspacialNoTripulada;

/**
 * @author GonzalezHDanielaA
 * @author GonzalezHDanielaA
 * @since 08/02/2023
 */


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class NaveEspacialNoTipuladaTest {

	 @Autowired 
	 private InterfaceNaveNoTripulada interfaceNaveNoTripulada;
	
	@Test
	public void testListarNavesNoTripuladas() {	
		List<naveEspacialNoTripulada> navesNoTripuladas = (List<naveEspacialNoTripulada>)interfaceNaveNoTripulada.findAll();
		
		for(naveEspacialNoTripulada naveNoTri: navesNoTripuladas) {
			System.out.println(naveNoTri);
		}
		assertThat(navesNoTripuladas).size().isGreaterThan(0);
	}
	
	
	
	
}
