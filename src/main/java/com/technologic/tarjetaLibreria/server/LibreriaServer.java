package com.technologic.tarjetaLibreria.server;

import java.util.List;

import javax.jws.WebService;

import com.technologic.tarjetaLibreria.model.Libreria;

@WebService
public interface LibreriaServer {

	/**
	 * metodo para crear libros
	 * @param libro
	 * @return metodo de libro
	 */
	Libreria crearLibro(Libreria libro);
	
	/**
	 * metodo para retortar todas las tarjetas
	 * @return
	 */
	
	List<Libreria> obtenerTodos();

}
