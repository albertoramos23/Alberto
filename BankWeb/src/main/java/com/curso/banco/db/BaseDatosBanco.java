package com.curso.banco.db;

import java.util.Map;
import java.util.TreeMap;

import com.mybank.domain.Customer;

public class BaseDatosBanco {

	private static Map<Integer, Customer> banco;
	private static int contador = 3;


	// iniciar el static tablaProducto
	static {
		banco = new TreeMap<Integer,Customer>();
		banco.put(1, new Customer("Alberto","Ramos"));
		banco.put(2, new Customer("Begoña","Olea"));
		banco.put(3, new Customer("Patxi","Etxeberria"));
		banco.put(4, new Customer("Ana","Jimenez"));
		
	}
	private BaseDatosBanco() {}
	//crear los métodos para añadir, borrar, modificar solicitar por
		// id y solicitar todos
		
		
		public static void add(String firstName, String lastName) {
			int newId = ++contador;
			Customer newP = new Customer( firstName,lastName);
			banco.put(newId, newP);
		}
	
	
}
