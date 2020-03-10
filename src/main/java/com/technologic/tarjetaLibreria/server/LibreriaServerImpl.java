package com.technologic.tarjetaLibreria.server;

import java.util.List;

import javax.jws.WebService;

import com.technologic.tarjetaLibreria.model.Libreria;
import com.technologic.tarjetaLibreria.repository.LibreriaRepository;
import com.technologic.tarjetaLibreria.repository.LibreriaRepositoryImpl;

@WebService(endpointInterface = "com.technologic.tarjetaLibreria.server.LibreriaServer")
public class LibreriaServerImpl implements LibreriaServer{
	
	LibreriaRepository libreria = new LibreriaRepositoryImpl();

	@Override
	public Libreria crearLibro(Libreria libro) {
		// TODO Auto-generated method stub
		return libreria.crearLibro(libro);
	}

	@Override
	public List<Libreria> obtenerTodos() {
		// TODO Auto-generated method stub
		return libreria.obtenerTodos();
	}

}
