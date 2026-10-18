package com.krakedev.examenBD.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krakedev.examenBD.entidades.Socio;
import com.krakedev.examenBD.repository.SocioRepository;

@Service
public class ServicioSocio {

	private final SocioRepository repository;
	
	public ServicioSocio(SocioRepository repository) {
		this.repository = repository;
	}
	
	public Socio crear(Socio s) {
		if (s.getEdad() < 14) {
            throw new IllegalArgumentException("El socio debe tener al menos 14 años para registrarse.");
        }
        return repository.save(s);
	}
	
	public List<Socio> listar(){
		return repository.findAll();
	}
	
	public List<Socio> buscarPorEstado(boolean activo){
		return repository.findByActivo(activo);
	}
	
	
	
}
