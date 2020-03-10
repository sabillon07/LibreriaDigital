package com.technologic.tarjetaLibreria.repository;

import java.util.List;

import com.technologic.tarjetaLibreria.model.Libreria;

public interface LibreriaRepository {
	
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
