package com.uce.edu.demo.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Propietario;
import com.uce.edu.demo.agencia.repository.IPropietrarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietrarioRepository propietrarioRepository;

	
	@Override
	public void crear(Propietario p) {
		this.propietrarioRepository.crear(p);
		
	}

	@Override
	public void eliminar(String cedula) {
		this.eliminar(cedula);
		
	}

}
