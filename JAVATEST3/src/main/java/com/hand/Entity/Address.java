package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Address implements Serializable {
private Integer addressid;
private String address;
private String address2;
private String district;
private Integer cityid;
private String postalcode;
private String phone;
private Date lastupdate;
public Integer getAddressid() {
	return addressid;
}
public void setAddressid(Integer addressid) {
	this.addressid = addressid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public Integer getCityid() {
	return cityid;
}
public void setCityid(Integer cityid) {
	this.cityid = cityid;
}
public String getPostalcode() {
	return postalcode;
}
public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}

}
