package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Rental implements Serializable {
private Integer rentalid;
private Date rentaldate;
private Integer inventoryid;
private Integer customerid;
private Date returndate;
private Integer staffid;
private Date lastupdate;
public Integer getRentalid() {
	return rentalid;
}
public void setRentalid(Integer rentalid) {
	this.rentalid = rentalid;
}
public Date getRentaldate() {
	return rentaldate;
}
public void setRentaldate(Date rentaldate) {
	this.rentaldate = rentaldate;
}
public Integer getInventoryid() {
	return inventoryid;
}
public void setInventoryid(Integer inventoryid) {
	this.inventoryid = inventoryid;
}
public Integer getCustomerid() {
	return customerid;
}
public void setCustomerid(Integer customerid) {
	this.customerid = customerid;
}
public Date getReturndate() {
	return returndate;
}
public void setReturndate(Date returndate) {
	this.returndate = returndate;
}
public Integer getStaffid() {
	return staffid;
}
public void setStaffid(Integer staffid) {
	this.staffid = staffid;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
}
