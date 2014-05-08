package br.com.sgd.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.sgd.generic.GenericRepository;
import br.com.sgd.generic.GenericService;
import br.com.sgd.model.CategoriaDespesa;
import br.com.sgd.repository.CategoriaDespesaRepository;

public class CategoriaDespesaService extends GenericService<CategoriaDespesa> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CategoriaDespesaRepository categoriaDespesaDao;
	
	@Override
	public GenericRepository<CategoriaDespesa> getRepository() {
		return this.categoriaDespesaDao;
	}
	
	@Override
	public void setRepository(GenericRepository<CategoriaDespesa> repository) {
		super.setRepository(this.categoriaDespesaDao);
	}


}
