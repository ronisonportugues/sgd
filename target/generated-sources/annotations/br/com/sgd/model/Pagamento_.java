package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> id;
	public static volatile SingularAttribute<Pagamento, FormaPagamento> idFormaPagamento;
	public static volatile ListAttribute<Pagamento, Despesa> despesaList;

}

