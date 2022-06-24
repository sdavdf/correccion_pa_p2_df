package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.agencia.modelo.Propietario;
import com.uce.edu.demo.agencia.modelo.Vehiculo;
import com.uce.edu.demo.agencia.service.IMatriculaGestorService;
import com.uce.edu.demo.agencia.service.IPropietarioService;
import com.uce.edu.demo.agencia.service.IVehiculoService;

@SpringBootApplication
public class CorreccionPaP2DfApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService matriculaGestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(CorreccionPaP2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1
		Vehiculo v = new Vehiculo();
		v.setMarca("Hyundai");
		v.setModelo("2019");
		v.setPlaca("HAU9900");
		v.setPrecio(new BigDecimal(3000));
		v.setTipo("L");
		
		this.vehiculoService.insertar(v);
		
		//2
		v.setPrecio(new BigDecimal(50000));
		v.setMarca("Mazda");
		this.vehiculoService.actualizar(v);
		
		//3
		Propietario p = new Propietario();
		p.setNombre("Stalyn");
		p.setApellido("Castañeda");
		p.setCedula("0401754601");
		this.propietarioService.crear(p);
		
		//4
		this.matriculaGestorService.generar("0401754601", "HAU9900");
		
	}

}
