package br.com.sgd.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Despesa.class)
public abstract class Despesa_ {

	public static volatile SingularAttribute<Despesa, Date> dataRealizacao;
	public static volatile SingularAttribute<Despesa, Integer> id;
	public static volatile SingularAttribute<Despesa, Parcelamento> idParcelamento;
	public static volatile ListAttribute<Despesa, ItemDespesa> itemDespesaList;
	public static volatile SingularAttribute<Despesa, Prestador> idPrestador;
	public static volatile SingularAttribute<Despesa, ItemCategoria> idItemCategoria;
	public static volatile SingularAttribute<Despesa, Double> valorTotal;
	public static volatile SingularAttribute<Despesa, Pagamento> idPagamento;

}

