package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.modelo.Propietario;

public interface IPropietarioService {
	

	public void crear(Propietario p);

	public void eliminar(String cedula);

}
