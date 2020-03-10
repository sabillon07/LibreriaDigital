
package com.technologic.tarjetaLibreria;

import javax.jws.WebService;

@WebService(endpointInterface = "com.technologic.tarjetaLibreria.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String sayBye(String text) {
    	return "Adios, esto es una prueba: " + text;
    }
}

