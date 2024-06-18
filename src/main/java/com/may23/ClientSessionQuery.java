package com.may23;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSessionQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory factory =  cfg.buildSessionFactory();
		Session session = factory.openSession();
		
	Query q = session.createQuery("from Car");
		List<Car> listCar = q.list();

		for (Car c : listCar) {
			System.out.println(c);
		}
		
	}

}
