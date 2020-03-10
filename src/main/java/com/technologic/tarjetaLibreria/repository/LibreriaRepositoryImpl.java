package com.technologic.tarjetaLibreria.repository;

import java.util.ArrayList;
import java.util.List;

import com.technologic.tarjetaLibreria.model.Libreria;

public class LibreriaRepositoryImpl implements LibreriaRepository {
	
	private static List<Libreria> libreria = new ArrayList<Libreria>();

	@Override
	public Libreria crearLibro(Libreria libro) {
		libreria.add(libro);
		return libro;
	}

	@Override
	public List<Libreria> obtenerTodos() {
		System.out.println("Estos son todos los libros");
		return libreria;
	}

}
