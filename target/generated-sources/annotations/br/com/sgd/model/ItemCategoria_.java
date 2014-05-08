package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemCategoria.class)
public abstract class ItemCategoria_ {

	public static volatile SingularAttribute<ItemCategoria, CategoriaDespesa> idCategoria;
	public static volatile SingularAttribute<ItemCategoria, Integer> id;
	public static volatile ListAttribute<ItemCategoria, Despesa> despesaList;
	public static volatile SingularAttribute<ItemCategoria, String> descricao;

}

