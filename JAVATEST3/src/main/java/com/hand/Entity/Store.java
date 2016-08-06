package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Store implements Serializable {

	private Integer storeid;
	private Integer managerstaffid;
	private Integer addressid;
	private Date lastupdate;
	public Integer getStoreid() {
		return storeid;
	}
	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}
	public Integer getManagerstaffid() {
		return managerstaffid;
	}
	public void setManagerstaffid(Integer managerstaffid) {
		this.managerstaffid = managerstaffid;
	}
	public Integer getAddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}
}
