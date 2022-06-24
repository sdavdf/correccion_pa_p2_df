package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.modelo.Vehiculo;

public interface IVehiculoService {
	
    public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo v);

	public void eliminar(String placa);


}
