package com.uce.edu.demo.agencia.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un vehiculo " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		System.out.println("Se ha buscado un vehiculo " + placa);
		Vehiculo v = new Vehiculo();
		v.setMarca("Hyundai");
		v.setModelo("2019");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(20));
		v.setTipo("Liviano");
		return v;
	}

	@Override
	public void actualizar(Vehiculo v) {
		System.out.println("Se ha actualizado un vehiculo " + v);

	}

	@Override
	public void eliminar(String placa) {
		System.out.println("Se ha eliminado un vehiculo " + placa);

	}

}
