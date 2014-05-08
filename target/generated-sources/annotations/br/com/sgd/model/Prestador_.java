package br.com.sgd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Prestador.class)
public abstract class Prestador_ {

	public static volatile SingularAttribute<Prestador, Integer> id;
	public static volatile SingularAttribute<Prestador, String> cpfCnpj;
	public static volatile SingularAttribute<Prestador, String> telefone;
	public static volatile ListAttribute<Prestador, Despesa> despesaList;
	public static volatile SingularAttribute<Prestador, String> nome;

}

