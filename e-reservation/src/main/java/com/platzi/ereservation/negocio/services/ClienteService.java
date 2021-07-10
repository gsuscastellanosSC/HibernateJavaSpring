/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import org.springframework.stereotype.Service;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * @author Jesus.Castellanos
 *
 */
@Service
public class ClienteService {
	public final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;

	}
	
	/*
	* Método para guardar un cliente
	* @param cliente
	* @return   
	*/
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/*
	* Método para actualizar un cliente
	* @param cliente
	* @return   
	*/
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/*
	* Método para eliminar un cliente
	* @param cliente
	* @return   
	*/
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/*
	* Método para consultar un cliente por su identificación
	* @param cliente
	* @return   
	*/
	public Cliente findByIdentificationWithJPQL(String identificationCli) {
		return this.clienteRepository.findByIdentificacionWithJPQL(identificationCli);
	}
}