package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Actor implements Serializable{
private Integer actorid;
private String firstname;
private String lastname;
private Date lastupdate;
public Integer getActorid() {
	return actorid;
}
public void setActorid(Integer actorid) {
	this.actorid = actorid;
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
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}

}
