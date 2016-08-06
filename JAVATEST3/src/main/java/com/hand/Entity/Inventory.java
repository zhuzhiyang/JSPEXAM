package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Inventory implements Serializable {
private Integer inventoryid;
private Integer filmid;
private Integer storeid;
private Date lastupdate;
public Integer getInventoryid() {
	return inventoryid;
}
public void setInventoryid(Integer inventoryid) {
	this.inventoryid = inventoryid;
}
public Integer getFilmid() {
	return filmid;
}
public void setFilmid(Integer filmid) {
	this.filmid = filmid;
}
public Integer getStoreid() {
	return storeid;
}
public void setStoreid(Integer storeid) {
	this.storeid = storeid;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
}
