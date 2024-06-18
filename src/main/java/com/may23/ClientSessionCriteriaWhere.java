package com.may23;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientSessionCriteriaWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Car.class);// select * from Car
		
		cr.add(Restrictions.eq("ownername", "Kadganchi"));
		cr.add(Restrictions.eq("company", "Land Cruiser"));
		
		List<Car> listCar = cr.list();

		for (Car c : listCar) {
			System.out.println(c);
		}
	}

}
