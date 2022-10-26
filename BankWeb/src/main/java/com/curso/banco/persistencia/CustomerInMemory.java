package com.curso.banco.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.banco.db.BaseDatosBanco;

import com.mybank.domain.Customer;

public class CustomerInMemory implements GenericDAO <Customer>{

	@Override
	public void add(Customer addAccount) {
		//BaseDatosBanco.add(addAccount.getFirstName(), addAccount.getLastName());
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList(BaseDatosBanco.getAll());
	}

	@Override
	public Customer getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
