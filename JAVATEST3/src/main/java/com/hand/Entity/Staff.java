package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Staff implements Serializable {
private Integer staffid;
private String firstname;
private String lastname;
private Integer addressid;
private String picture;
private String email;
private Integer storeid;
private Integer active;
private String username;
private String password;
private Date lastupdate;
public Integer getStaffid() {
	return staffid;
}
public void setStaffid(Integer staffid) {
	this.staffid = staffid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Integer getAddressid() {
	return addressid;
}
public void setAddressid(Integer addressid) {
	this.addressid = addressid;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getStoreid() {
	return storeid;
}
public void setStoreid(Integer storeid) {
	this.storeid = storeid;
}
public Integer getActive() {
	return active;
}
public void setActive(Integer active) {
	this.active = active;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}

}
