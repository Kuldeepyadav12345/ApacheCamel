package com.training.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
/* Single table inheritance in hibernate 
@Entity
@DiscriminatorValue("Card")
public class CardPayment extends Payment{
	private int cardNo;
	private int validUpToMonth;
	private int validUpToYear;
	private int cvv;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getValidUpToMonth() {
		return validUpToMonth;
	}
	public void setValidUpToMonth(int validUpToMonth) {
		this.validUpToMonth = validUpToMonth;
	}
	public int getValidUpToYear() {
		return validUpToYear;
	}
	public void setValidUpToYear(int validUpToYear) {
		this.validUpToYear = validUpToYear;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public CardPayment(int payment, LocalDate paymentDate, int paymantAmount, int cardNo, int validUpToMonth,
			int validUpToYear, int cvv) {
		super(payment, paymentDate, paymantAmount);
		this.cardNo = cardNo;
		this.validUpToMonth = validUpToMonth;
		this.validUpToYear = validUpToYear;
		this.cvv = cvv;
	}
	public CardPayment(int payment, LocalDate paymentDate, int paymantAmount) {
		super(payment, paymentDate, paymantAmount);
	}
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", validUpToMonth=" + validUpToMonth + ", validUpToYear="
				+ validUpToYear + ", cvv=" + cvv + "]";
	}
	public CardPayment() {
		super();
	}
	
}*/





/* Table per sub class in hibernate*/

@Entity
@Table(name="CardPayment")
public class CardPayment extends Payment{
	private int cardNo;
	private int validUpToMonth;
	private int validUpToYear;
	private int cvv;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getValidUpToMonth() {
		return validUpToMonth;
	}
	public void setValidUpToMonth(int validUpToMonth) {
		this.validUpToMonth = validUpToMonth;
	}
	public int getValidUpToYear() {
		return validUpToYear;
	}
	public void setValidUpToYear(int validUpToYear) {
		this.validUpToYear = validUpToYear;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public CardPayment(int payment, LocalDate paymentDate, int paymantAmount, int cardNo, int validUpToMonth,
			int validUpToYear, int cvv) {
		super(payment, paymentDate, paymantAmount);
		this.cardNo = cardNo;
		this.validUpToMonth = validUpToMonth;
		this.validUpToYear = validUpToYear;
		this.cvv = cvv;
	}
	public CardPayment(int payment, LocalDate paymentDate, int paymantAmount) {
		super(payment, paymentDate, paymantAmount);
	}
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", validUpToMonth=" + validUpToMonth + ", validUpToYear="
				+ validUpToYear + ", cvv=" + cvv + "]";
	}
	public CardPayment() {
		super();
	}
	
}
