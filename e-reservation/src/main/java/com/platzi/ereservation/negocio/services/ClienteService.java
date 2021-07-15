/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * @author Jesus.Castellanos
 *
 */
@Service
@Transactional(readOnly = true)
public class ClienteService {
	public final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;

	}

	/*
	 * Método para guardar un cliente
	 * 
	 * @param cliente
	 * 
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/*
	 * Método para actualizar un cliente
	 * 
	 * @param cliente
	 * 
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/*
	 * Método para eliminar un cliente
	 * 
	 * @param cliente
	 * 
	 * @return
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/*
	 * Método para consultar un cliente por su identificación
	 * 
	 * @param cliente
	 * 
	 * @return
	 */
	public Cliente findByIdentificationWithJPQL(String identificationCli) {
		return this.clienteRepository.findByIdentificacionWithJPQL(identificationCli);
	}

	/**
	 * Método para consultar todos los clientes
	 * @return
	 */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
}