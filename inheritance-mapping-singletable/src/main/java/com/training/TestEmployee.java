package com.training;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Employee;
import com.training.util.hibernateutil;

public class TestEmployee {

	public static void main(String[] args) {
	List<Employee> employees=new ArrayList<Employee>();
	Employee kuldeep=new Employee(1, "Kuldeep", "Software Developer", 900000);
	Employee Suraj=new Employee(2, "Suraj Anasune", "Software Developer", 800000);
	Employee Ajeet=new Employee(3, "Ajeet", "Software Developer", 700000);
	Employee James=new Employee(4, "James", "HR", 1000000);
	Employee Shivani=new Employee(5, "Shivani", "Tester", 600000);
	Employee Radha =new Employee(6, "Radha", "Tester", 500000);
	employees.add(kuldeep);
	employees.add(Suraj);
	employees.add(Ajeet);
	employees.add(James);
	employees.add(Shivani);
	employees.add(Radha);
	for (Employee employee : employees) {
		saveEmployeesData(employee);
	}

	}
	public static void saveEmployeesData(Employee employee)
	{
		Session session=hibernateutil.getSession();
		Transaction tx=session.beginTransaction();
		session.persist(employee);
		tx.commit();
		session.close();
	}

}
