package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Category implements Serializable {
private Integer categoryid;
private String name;
private Date lastupdate;
public Integer getCategoryid() {
	return categoryid;
}
public void setCategoryid(Integer categoryid) {
	this.categoryid = categoryid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
	
}
