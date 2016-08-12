package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static Session session;

	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			session = sessionFactory.openSession();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public static Session getSession() {
		return session;
	}
	
	public static void commit() {
		session.getTransaction().commit();
	}
	
	public static void beginTransaction() {
		session.beginTransaction();
	}
	
	public static void rollback() {
		session.getTransaction().rollback();
	}
}
