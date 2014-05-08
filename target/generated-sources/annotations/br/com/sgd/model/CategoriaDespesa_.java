package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CategoriaDespesa.class)
public abstract class CategoriaDespesa_ {

	public static volatile SingularAttribute<CategoriaDespesa, Integer> id;
	public static volatile SingularAttribute<CategoriaDespesa, String> descricao;
	public static volatile ListAttribute<CategoriaDespesa, ItemCategoria> itemCategoriaList;

}

