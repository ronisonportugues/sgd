package br.com.sgd.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Parcela.class)
public abstract class Parcela_ {

	public static volatile SingularAttribute<Parcela, Parcelamento> idParcelamento;
	public static volatile SingularAttribute<Parcela, Double> valorParcela;
	public static volatile SingularAttribute<Parcela, Date> dataVencimento;
	public static volatile SingularAttribute<Parcela, Integer> numero;

}

