/**
 * 
 */
package com.sofkaU.estacion_espacial.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Este objeto permite crear una categoria de nave muy nutrida, puesto que
 * no incluyen los satelites artificiales que orbitan geoestacionalmente,su
 * objetivo estriba en estudiar otros cuerpos celestes.  
 * 
 * This object allows you to create a very large ship category, since
 * do not include artificial satellites that orbit geoseasonally, their
 * objective is to study other celestial bodies.
 * 
 *  
 * 
 *@author DanielaAGonzalezH
 * @version 1.0
 * @since 07/272023
 * 
 * Esta clase permite crear un tipo de nave espacial que está diseñada
 * con un proposito en especifico
 * 
 * 
 *
 */

@Entity
@Table (name= "nave_espacial_no_tripulada")
public class naveEspacialNoTripulada extends NaveEspacial{

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column ( name = "cantidad_motores")
	private int cantidadMotores;
	@Column(name = "tipo_estudio")
	private String tipoEstudio;
	
  /**
   * 
   * @param nombre
   * @param pais
   * @param actividad
   * @param velocidad
   * @param tipoCombustible
   * @param peso
   * @param alto
   * @param tipo
   * @param cantidadMotores
   * @param tipoEstudio
   */
	public naveEspacialNoTripulada(String nombre, String pais, Date actividad, double velocidad,
			String tipoCombustible, double peso, double alto, TipoNave tipo, int cantidadMotores,
			String tipoEstudio) {
		super(nombre, pais, actividad, velocidad, tipoCombustible, peso, alto, tipoCombustible);
		this.cantidadMotores = cantidadMotores;
		this.tipoEstudio = tipoEstudio;
	}
	/**
	 * @return the cantidadMotores
	 */
	public int getCantidadMotores() {
		return cantidadMotores;
	}
	/**
	 * @param cantidadMotores the cantidadMotores to set
	 */
	public void setCantidadMotores(int cantidadMotores) {
		this.cantidadMotores = cantidadMotores;
	}
	/**
	 * @return the tipoEstudio
	 */
	public String getTipoEstudio() {
		return tipoEstudio;
	}
	/**
	 * @param tipoEstudio the tipoEstudio to set
	 */
	public void setTipoEstudio(String tipoEstudio) {
		this.tipoEstudio = tipoEstudio;
	}
	
	public naveEspacialNoTripulada() {
		
	}
	@Override
	public void despejar() {
		System.out.println("Despejando nave espacial no tripulada ...");
		
	}
	@Override
	public void fijarDestino() {
		System.out.println("Fijar destino a" +this.tipoEstudio);
		
	}
	@Override
	public String toString() {
		return "naveEspacialNoTripulada [id=" + id + ", cantidadMotores=" + cantidadMotores + ", tipoEstudio="
				+ tipoEstudio + "]";
	}
	
	
	
	
	

}
