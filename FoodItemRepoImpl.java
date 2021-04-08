package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepoImpl implements FoodItemRepo {
	public FoodItemRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
		
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save " + entity);
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
