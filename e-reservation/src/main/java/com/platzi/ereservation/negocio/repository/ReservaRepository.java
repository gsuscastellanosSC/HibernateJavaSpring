/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.modelo.Reserva;


/**
 * @author Jesus.Castellanos
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {
	
	@Query("Select r from Reserva r where r.fechaIngresoRe =:fechaInicio and r.fechaSalidaRe =:fechaSalida")
	public List<Reserva> find(@Param("fechaInicio") Date fechaSalida, @Param("fechaSalida") Date fecha);
}
