package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Parcelamento.class)
public abstract class Parcelamento_ {

	public static volatile SingularAttribute<Parcelamento, Integer> id;
	public static volatile ListAttribute<Parcelamento, Parcela> parcelaList;
	public static volatile ListAttribute<Parcelamento, Despesa> despesaList;

}

