package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormaPagamento.class)
public abstract class FormaPagamento_ {

	public static volatile SingularAttribute<FormaPagamento, Integer> tipoFormaPagamento;
	public static volatile SingularAttribute<FormaPagamento, Integer> id;
	public static volatile ListAttribute<FormaPagamento, Pagamento> pagamentoList;

}

