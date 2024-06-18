package com.may23;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ClientSessionCriteriaColumnsSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select * from Car
		Criteria cr = session.createCriteria(Car.class);
		
		//select carname from car
				Projection pr = Projections.property("company");
			
				cr.setProjection(pr);
		
		List<String> listCar = cr.list();

		for (String c : listCar) {
			System.out.println(c);
		}
	}

}
