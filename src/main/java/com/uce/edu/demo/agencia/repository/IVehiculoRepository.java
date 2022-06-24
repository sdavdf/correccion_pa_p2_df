package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.modelo.Vehiculo;

public interface IVehiculoRepository {
	
   public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo v);

	public void eliminar(String placa);


}
