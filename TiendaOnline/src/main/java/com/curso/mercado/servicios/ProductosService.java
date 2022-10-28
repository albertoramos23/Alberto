package com.curso.mercado.servicios;

import java.util.List;

import com.curso.db.PoolConexiones;
import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoDataBaseDAO;
import com.curso.mercado.persistencia.ProductoInMemoryDAO;
import com.curso.mercado.persistencia.ProductoJPADAO;

public class ProductosService {
	
	GenericDAO<Producto> dao;
	//GenericDAO<Producto> dao = new ProductoDataBaseDAO(null);
			//new ProductoInMemoryDAO();
	
	public ProductosService() {
		
		PoolConexiones pool = new PoolConexiones();
		//this.dao = new ProductoDataBaseDAO(pool.getConnection());
		
		this.dao = new ProductoJPADAO();


	}
	
	public void darAltaUnproducto(Producto p) {
		// valida que p no es null
		//validar descripcion 
		//validar precio
		
		dao.add(p);
		
	}
	
	public List<Producto>  dameTodosLosProductos() {
		return dao.getAll();
	}

}
