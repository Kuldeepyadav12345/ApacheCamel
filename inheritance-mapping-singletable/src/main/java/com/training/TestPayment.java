package com.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.CardPayment;
import com.training.model.ChequePayment;
import com.training.model.Payment;
import com.training.util.hibernateutil;

public class TestPayment {

	public static void main(String[] args) {
		
		/*For inserting the data into table */
		  CardPayment payment1=new CardPayment(1, LocalDate.now(), 200, 5545445, 5, 5454, 666);
		ChequePayment payment2=new ChequePayment(2, LocalDate.now(), 500, 6584551, "PDC");
		Session session=hibernateutil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(payment1);
		session.save(payment2);
		tx.commit();
		session.close();
		hibernateutil.closeSession();
		
		/* For fetching the records from the table
		Session session=hibernateutil.getSession();
		Transaction tx=session.beginTransaction();
		Payment payment=session.get(Payment.class, 1);
		if(payment instanceof CardPayment)
		{
			CardPayment cp=(CardPayment) payment;
			System.out.println("card No"+cp.getCardNo()+"Cvv"+cp.getCvv()+"Valid up to"+cp.getValidUpToMonth()+"Cvv"+cp.getPaymantAmount());
			System.out.println("All data  "+ cp);
		}
		else
		{
			ChequePayment cp=(ChequePayment) payment;
			System.out.println("All data "+cp);
		}
		session.close();*/
	}

}
