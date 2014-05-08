package br.com.sgd.controller;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sgd.generic.GenericController;
import br.com.sgd.generic.GenericService;
import br.com.sgd.model.CategoriaDespesa;
import br.com.sgd.service.CategoriaDespesaService;

@Named
@ConversationScoped
public class CategoriaDespesaController extends GenericController<CategoriaDespesa> implements Serializable {

	private static final long serialVersionUID = 1L;

	public CategoriaDespesaController() {

	}

	@Inject
	private CategoriaDespesa categoriaDespesa;

	@Inject
	private CategoriaDespesaService service;

	@Override
	public GenericService<CategoriaDespesa> getService() {
		return this.service;
	}

	@Override
	public void setService(GenericService<CategoriaDespesa> service) {
		super.setService(this.service);
	}

	public CategoriaDespesa getCategoriaDespesa() {
		return categoriaDespesa;
	}

	public void setCategoriaDespesa(CategoriaDespesa categoriaDespesa) {
		this.categoriaDespesa = categoriaDespesa;
	}

	@Override
	public String salvar() {
		if (!this.objeto.getDescricao().equals(""))
			return super.salvar();
		else {
			addErrorMessage("O campo descrição deve ser informado!");
			return "";
		}
	}

	@Override
	public String create() {
		return super.create();
	}

	public String teste() {
		return "/resources/forms/categoriaDespesaForm";
	}
}
