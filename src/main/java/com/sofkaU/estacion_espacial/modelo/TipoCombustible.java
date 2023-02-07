/**
 * 
 */
package com.sofkaU.estacion_espacial.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author DanielaAGonzalezH
 * @since 07/02/2023
 *
 */
//@Entity
//@Table(name = "tipo_combustible")
public class TipoCombustible {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;

	public TipoCombustible(String nombre, String descripcion) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
