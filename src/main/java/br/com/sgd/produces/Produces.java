package br.com.sgd.produces;

import java.util.ArrayList;
import java.util.List;

import br.com.sgd.qualifiers.ListaObject;

public class Produces {
	
	
	
	@ListaObject
	public List<Object> listaBean(){
		return new ArrayList<Object>();
	}
	
	
}
