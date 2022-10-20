package com.curso.banco.persistencia;

import java.util.List;

public interface GenericDAO<T> {
	
	public void add(T addAccount);
	public List<T> getAll();
	public T getByID(int id);

}