package com.training.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
/* Single table inheritance in hibernate 
@Entity
@Table(name="payments")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="payment_Mode",discriminatorType = DiscriminatorType.STRING)
// This is the parent class 
public class Payment {
	@Id
	@Column(name = "payment_id")
	private int payment;
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	@Column(name = "payment_Amount")
	private int paymantAmount;
	public Payment(int payment, LocalDate paymentDate, int paymantAmount) {
		super();
		this.payment = payment;
		this.paymentDate = paymentDate;
		this.paymantAmount = paymantAmount;
	}
	public Payment() {
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getPaymantAmount() {
		return paymantAmount;
	}
	public void setPaymantAmount(int paymantAmount) {
		this.paymantAmount = paymantAmount;
	}
	@Override
	public String toString() {
		return "Payment [payment=" + payment + ", paymentDate=" + paymentDate + ", paymantAmount=" + paymantAmount
				+ "]";
	}
	

}*/



/* Table per sub class in hibernate*/
@Entity
@Table(name="payments")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// This is the parent class 
public class Payment {
	@Id
	@Column(name = "payment_id")
	private int payment;
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	@Column(name = "payment_Amount")
	private int paymantAmount;
	public Payment(int payment, LocalDate paymentDate, int paymantAmount) {
		super();
		this.payment = payment;
		this.paymentDate = paymentDate;
		this.paymantAmount = paymantAmount;
	}
	public Payment() {
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getPaymantAmount() {
		return paymantAmount;
	}
	public void setPaymantAmount(int paymantAmount) {
		this.paymantAmount = paymantAmount;
	}
	@Override
	public String toString() {
		return "Payment [payment=" + payment + ", paymentDate=" + paymentDate + ", paymantAmount=" + paymantAmount
				+ "]";
	}
	

}