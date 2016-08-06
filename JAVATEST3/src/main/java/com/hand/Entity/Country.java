package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Country implements Serializable {
private Integer countryid;
private String country;
private Date lastupdate;
public Integer getCountryid() {
	return countryid;
}
public void setCountryid(Integer countryid) {
	this.countryid = countryid;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}

}
