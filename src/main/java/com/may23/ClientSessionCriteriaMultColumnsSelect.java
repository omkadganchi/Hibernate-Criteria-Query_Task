package com.may23;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientSessionCriteriaMultColumnsSelect {

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
				Projection pr1 = Projections.property("company");
				Projection pr2 = Projections.property("cost");
				ProjectionList pr = Projections.projectionList();
				pr.add(pr1);
				pr.add(pr2);
				
				cr.setProjection(pr);
		
		List<Object[]> listCar = cr.list();

		for (Object[] car : listCar) {
			for (Object objects : car) {
			System.out.println(objects.toString());	
			}
		}
	}

}
