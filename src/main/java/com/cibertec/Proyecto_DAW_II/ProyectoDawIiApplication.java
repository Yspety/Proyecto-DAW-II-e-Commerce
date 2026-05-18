package com.cibertec.Proyecto_DAW_II;

import com.cibertec.Proyecto_DAW_II.entity.Usuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoDawIiApplication {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();

        usuario.setNombre("Billy");
        usuario.setEdad(18);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
	}

}
