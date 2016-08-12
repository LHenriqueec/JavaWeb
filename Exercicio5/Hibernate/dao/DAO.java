package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import util.HibernateUtil;

abstract class DAO<T> {

	protected Session session;
	private Class<T> clazz;
	
	public DAO(Class<T> clazz) {
		this.clazz = clazz;
		session = HibernateUtil.getSession();
	}
	
	public void save(T obj) throws DAOException {
		try {
			
			session.save(obj);
			
		} catch (HibernateException e) {
			throw new DAOException(e);
		}
	}
	
	public T load(Serializable id) throws DAOException {
		try {
			
			T obj = session.load(clazz, id);
			
			return obj;
		} catch (HibernateException e) {
			throw new DAOException(e);
		}
	}
	
	public void delete(T obj) throws DAOException {
		try {
			
			session.delete(obj);
			
		} catch (HibernateException e) {
			throw new DAOException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> list(String hql) throws DAOException {
		try {
			
			Query<T> q = session.createQuery(hql);
			
			return q.getResultList();
		} catch (HibernateException e) {
			throw new DAOException(e);
		}
	}
}













