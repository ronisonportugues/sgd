package br.com.sgd.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;
@SuppressWarnings("unchecked")
public abstract class GenericRepository<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PU")
	private EntityManager em;

	private Class<T> classe;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unused")
	private Session session;

	public GenericRepository() {

	}

	public GenericRepository(Class<T> classe) {
		this.classe = classe;
	}

	@SuppressWarnings("unchecked")
	public T salvar(T entidade) {
		
		entidade = (T) getSession().merge(entidade);
		getSession().flush();
		
		return entidade;
	}
	
	public void delete(T entidade){
		try {
			Object object = getSession().merge(entidade);
			getSession().delete(object);	
			getSession().flush();
		} catch (Exception e) {
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List obterTodos() {
		CriteriaQuery query = em.getCriteriaBuilder().createQuery(classe);
		query.from(classe);
		return em.createQuery(query).getResultList();
	}

	public Session getSession() {
		return (Session) em.getDelegate();
	}

	public List<T> findAll() {
		Criteria criteria = createCriteria();
		return criteria.list();
	}

	public Criteria createCriteria(){
		Criteria criteria;
		
		criteria = getSession().createCriteria((Class<T>) 
				((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		
		return criteria;
	}
	
}
