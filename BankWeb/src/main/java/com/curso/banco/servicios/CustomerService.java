package com.curso.banco.servicios;

import java.util.List;

import com.curso.banco.persistencia.CustomerInMemory;
import com.curso.banco.persistencia.GenericDAO;
import com.mybank.domain.Customer;



public class CustomerService {

	
GenericDAO<Customer> dao = new CustomerInMemory();
	
	public void darAltaUnCliente(Customer c) {
		
		dao.add(c);
		
	}
	
	public List<Customer>  dameTodosLosClientes() {
		return dao.getAll();
	}

	
	
	
	
}
