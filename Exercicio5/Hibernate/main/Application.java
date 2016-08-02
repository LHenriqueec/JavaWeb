package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Produto;

public class Application {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.getCurrentSession();
		
		Produto p2 = new Produto();
		p2.setNome("P4");
		
		session.beginTransaction();
		session.save(p2);
		session.getTransaction().commit();
		
	}

}
