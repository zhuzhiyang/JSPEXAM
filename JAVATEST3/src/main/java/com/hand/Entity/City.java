package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class City implements Serializable {
private Integer cityid;
private String city;
private Integer countryid;
private Date lastupdate;
public Integer getCityid() {
	return cityid;
}
public void setCityid(Integer cityid) {
	this.cityid = cityid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getCountryid() {
	return countryid;
}
public void setCountryid(Integer countryid) {
	this.countryid = countryid;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}

}
