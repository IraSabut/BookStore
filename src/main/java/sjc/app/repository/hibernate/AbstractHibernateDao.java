package sjc.app.repository.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public abstract class AbstractHibernateDao {
	@Autowired
	private static SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private AbstractHibernateDao() {
	}

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	/*
	 * @SuppressWarnings("unchecked") protected Class<T> getGenericEntityClass()
	 * { ParameterizedType parameterizedType = (ParameterizedType)
	 * getClass().getGenericSuperclass(); return (Class<T>)
	 * parameterizedType.getActualTypeArguments()[0]; }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public PK save(T obj) { return (PK) getSession().save(obj); }
	 * 
	 * public void update(T o) { getSession().update(o); }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public List<T> findAll() { Criteria cr =
	 * getSession().createCriteria(this.getGenericEntityClass()); return
	 * (List<T>) cr.list(); }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public List<T> findByCriteria(Criterion criterion) { Criteria crit =
	 * getSession().createCriteria(this.getGenericEntityClass());
	 * crit.add(criterion); return (List<T>) crit.list(); }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public T findById(PK id) { return (T)
	 * getSession().get(this.getGenericEntityClass(), id); }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public void delete(PK id) { T persistentObject = (T)
	 * getSession().load(this.getGenericEntityClass(), id); try {
	 * getSession().delete(persistentObject); } catch (NonUniqueObjectException
	 * e) { // in a case of detached object T instance = (T)
	 * getSession().merge(persistentObject); getSession().delete(instance); } }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * public void delete(T persistentObject) { try {
	 * getSession().delete(persistentObject); } catch (NonUniqueObjectException
	 * e) { // in a case of detached object T instance = (T)
	 * getSession().merge(persistentObject); getSession().delete(instance); } }
	 */
}
