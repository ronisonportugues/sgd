package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemDespesa.class)
public abstract class ItemDespesa_ {

	public static volatile SingularAttribute<ItemDespesa, Integer> id;
	public static volatile SingularAttribute<ItemDespesa, Despesa> idDespesa;
	public static volatile SingularAttribute<ItemDespesa, Integer> quantidade;
	public static volatile SingularAttribute<ItemDespesa, Double> valorUnitario;

}

