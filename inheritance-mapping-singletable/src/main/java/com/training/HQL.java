package com.training;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.training.model.Employee;
import com.training.util.hibernateutil;

public class HQL {

	public static void main(String[] args) {
		Session session =hibernateutil.getSession();
		//Query<Employee> query=session.createQuery("FROM Employee");
		/*Query<Employee> query=session.createQuery("FROM Employee WHERE DEPARTMENT=?1 AND salary>?2");
		query.setParameter(1, "HR");  // positional paramaters
		query.setParameter(2, 35000);*/
		
		
		/*Names paramater*/
		/*Query<Employee> query=session.createQuery("FROM Employee WHERE Department=:dep AND salary>:sal");
		query.setParameter("dep", "HR");  // positional paramaters
		query.setParameter("sal", 30000.00);
		List<Employee> employee=query.getResultList();
		employee.forEach(System.out:: println);
		session.close();
		hibernateutil.closeSession();*/
		
		/*Retriving thr patrial object from the database*/
		/*Query<Object[]> query=session.createQuery("SELECT name,Department FROM Employee");
		List<Object[]> result=query.getResultList();
		result.forEach(row->System.out.println(row[0] +"  " +row[1]));
		session.close();
		hibernateutil.closeSession();*/
		
		/*Retriving Single column from the database*/
		/*Query<String> query=session.createQuery("SELECT name FROM Employee");
		List<String> result=query.getResultList();
		result.forEach(row->System.out.println(row));
		session.close();
		hibernateutil.closeSession();*/
		
		/* update the salary of employee whose department is HR*/
		/*Transaction tx=session.beginTransaction();
		Query query= session.createQuery("Update Employee Set salary= salary+ ?1 where department=?2");
		query.setParameter(1, 5000.00);
		query.setParameter(2, "HR");
		int count=query.executeUpdate();
		System.out.println("Affected rows =="+count);
		tx.commit();
		session.close();
		hibernateutil.closeSession();*/
		
		/* Delete employees from the table*/
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("Delete from Employee where Department=?1");
		query.setParameter(1, "AVP");
		query.executeUpdate();
		tx.commit();
		session.close();
		hibernateutil.closeSession();
		

	}

}
