package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Payment implements Serializable {

	private Integer paymentid;
	private Integer customerid;
	private Integer staffid;
	private Integer rentalid;
	private double amount;
	private Date paymentdate;
	private Date lastupdate;
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public Integer getRentalid() {
		return rentalid;
	}
	public void setRentalid(Integer rentalid) {
		this.rentalid = rentalid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}
}
