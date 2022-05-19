package com.training.util;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.training.model.CardPayment;
import com.training.model.ChequePayment;
import com.training.model.Employee;
import com.training.model.Payment;

public class hibernateutil {
	private static SessionFactory factory;

	// This will return the SessionFactory Object
	public static Session getSession() {
		return factory.openSession();
	}

	public static void closeSession() {
		factory.close();
	}

	static {
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration().configure()
				.addAnnotatedClass(Payment.class).addAnnotatedClass(Employee.class).addAnnotatedClass(CardPayment.class)
				.addAnnotatedClass(ChequePayment.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
	}
}
