package com.samanecorp.secureapp.dao;

import java.util.List;

public interface Repository<T> {
	public boolean save(T t); //ajouter dans la base
	public boolean delete(long id,T t);  //supprimer
	public boolean update(T t);    //mettre a jour
	public List<T> list(T t);   //lister
	public T get(long id,T t);   //le get
}
