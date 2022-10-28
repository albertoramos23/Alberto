package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto> {

	
	///////////////////////PRODUCTO
	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("OracleHRPU");
	
		EntityManager em = factory.createEntityManager();
	}
	
	
	@Override
	public void add(Producto entidad) {
		////////////////////////////////////////////INSERTAR
		
		EntityManager em = factory.createEntityManager();
		//Departamento d = em.find(Departamento.class, 10);
		em.getTransaction().begin();
		
		em.persist(entidad);
		System.out.println("Se ha creado el Producto id" + entidad.getDescripcion());
		em.getTransaction().commit();

	
		
		
		
		
	}

	@Override
	public List<Producto> getAll() {
		
	
		EntityManager em = factory.createEntityManager();
		
		Query consulta3 = em.createNativeQuery(
		        "SELECT * FROM PRODUCTOS", 
				Producto.class);
		List<Producto> lista3 =  consulta3.getResultList();
	
		System.out.println("Lista de todos los productos");
		for(Producto d2 : lista3) {
			System.out.println(d2);
		}
		return lista3;
	}

	@Override
	public Producto getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	
	
	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	/*	String consulta= "DELETE FROM PRODUCTO WHERE ID_PRODUCTO = ?";
		 preparedStatement = conexion.prepareStatement(consulta);
		 preparedStatement .setInt(1, id);
		 preparedStatement .executeUpdate();
*/
	
	
	}

	@Override
	public void update(Producto entidad) {
		// TODO Auto-generated method stub
		
	
	
	
	}

}
