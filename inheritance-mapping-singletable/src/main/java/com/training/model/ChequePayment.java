package com.training.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
/* Single table inheritance in hibernate
@Entity
@DiscriminatorValue("Cheque")
public class ChequePayment extends Payment {
	private int chequeNo;
	private String chequeType;
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public ChequePayment(int payment, LocalDate paymentDate, int paymantAmount, int chequeNo, String chequeType) {
		super(payment, paymentDate, paymantAmount);
		this.chequeNo = chequeNo;
		this.chequeType = chequeType;
	}
	public ChequePayment(int payment, LocalDate paymentDate, int paymantAmount) {
		super(payment, paymentDate, paymantAmount);
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeType=" + chequeType + "]";
	}
	public ChequePayment() {
		super();
	}
	
}*/



/* Table per subclsss in Hibernate */
@Entity
@Table(name="ChequePayment")
public class ChequePayment extends Payment {
	private int chequeNo;
	private String chequeType;
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public ChequePayment(int payment, LocalDate paymentDate, int paymantAmount, int chequeNo, String chequeType) {
		super(payment, paymentDate, paymantAmount);
		this.chequeNo = chequeNo;
		this.chequeType = chequeType;
	}
	public ChequePayment(int payment, LocalDate paymentDate, int paymantAmount) {
		super(payment, paymentDate, paymantAmount);
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeType=" + chequeType + "]";
	}
	public ChequePayment() {
		super();
	}
	
}






