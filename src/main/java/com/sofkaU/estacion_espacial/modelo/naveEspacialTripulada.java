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
 * Esta clase permite crear un tipo de nave que su proposito
 * consiste en mandar seres humanos al espacio para tareas
 * de reparacion, mantenimiento o investigacion. (Moaramore, 2016).
 * 
 * This class allows you to create a type of ship that its purpose
 * consists of sending human beings to space for tasks
 * repair, maintenance or research. (Moaramore, 2016).
 * 
 * 
 * @author DanielaAGonzalezH
 * @version 1.0
 * @since 07/02/2023

 * Esta clase permite crear un tipo de nave espacial que está diseñada
 * con un proposito en especifico
 *
 */
@Entity
@Table(name = "nave_espacial_tripulada")
public class naveEspacialTripulada extends NaveEspacial{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "cantidad_personas")
	private int cantidadPersonas;
	@Column (name = "tipo_objetivo")
	@Enumerated(value = EnumType.STRING)
	private TipoObjetivoTripuladas tipoObjetivo;
	
	/**
	 * @param nombre
	 * @param pais
	 * @param actividad
	 * @param velocidad
	 * @param tipoCombustible
	 * @param peso
	 * @param alto
	 * @param tipo
	 * @param cantidadPersonas
	 * @param tipoObjetivo
	 */
	public naveEspacialTripulada(String nombre, String pais, Date actividad, double velocidad,
			String tipoCombustible, double peso, double alto, TipoNave tipo, int cantidadPersonas,
			TipoObjetivoTripuladas tipoObjetivo) {
		super(nombre, pais, actividad, velocidad, tipoCombustible, peso, alto, tipoCombustible);
		this.cantidadPersonas = cantidadPersonas;
		this.tipoObjetivo = tipoObjetivo;
	}
	/**
	 * @return the cantidadPersonas
	 */
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	/**
	 * @param cantidadPersonas the cantidadPersonas to set
	 */
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	/**
	 * @return the tipoObjetivo
	 */
	public TipoObjetivoTripuladas getTipoObjetivo() {
		return tipoObjetivo;
	}
	/**
	 * @param tipoObjetivo the tipoObjetivo to set
	 */
	public void setTipoObjetivo(TipoObjetivoTripuladas tipoObjetivo) {
		this.tipoObjetivo = tipoObjetivo;
	}
	
	
	public naveEspacialTripulada() {
		
	}
	
	
	
	@Override
	public void despejar() {
		System.out.println("Despejando nave espacial tripulada");
		
	}
	@Override
	public void fijarDestino() {
		System.out.println("Fijar destino a "+this.tipoObjetivo);
	}
	
	
	
	
	

}
