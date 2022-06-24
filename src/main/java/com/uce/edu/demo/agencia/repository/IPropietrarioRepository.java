package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.modelo.Propietario;

public interface IPropietrarioRepository {
	
	public Propietario consultar(String cedula);
	
	public void crear(Propietario p);
	
	public void eliminar(String cedula);
	

}
