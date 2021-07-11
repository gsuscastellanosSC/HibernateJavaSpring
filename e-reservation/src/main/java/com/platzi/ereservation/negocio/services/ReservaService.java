/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.modelo.Reserva;
import com.platzi.ereservation.negocio.repository.ReservaRepository;

/**
 * @author Jesus.Castellanos
 *
 */
@Service
@Transactional(readOnly = true)
public class ReservaService {
	public final ReservaRepository RESERVA_REPOSITORY;

	public ReservaService(ReservaRepository RESERVA_REPOSITORY) {
		this.RESERVA_REPOSITORY = RESERVA_REPOSITORY;
	}

	/*
	 * Método para guardar una reserva
	 * 
	 * @param reserva
	 * 
	 * @return
	 */
	@Transactional
	public Reserva create(Reserva reserva) {
		return this.RESERVA_REPOSITORY.save(reserva);
	}
	
	/*
	 * Método para actualizar una reserva
	 * 
	 * @param reserva
	 * 
	 * @return
	 */
	@Transactional
	public Reserva update(Reserva reserva) {
		return this.RESERVA_REPOSITORY.save(reserva);
	}
	
	/*
	 * Método para eliminar una reserva
	 * 
	 * @param reserva
	 * 
	 * @return
	 */
	@Transactional
	public void delete(Reserva reserva) {
		this.RESERVA_REPOSITORY.delete(reserva);
	}

	/*
	 * Método para consultar una reserva por fecha
	 * 
	 * @param reserva
	 * 
	 * @return
	 */
	public List<Reserva> findByDate(Date fechaInicio, Date fechaSalida) {
		return this.RESERVA_REPOSITORY.find(fechaInicio, fechaSalida);
	}
}
