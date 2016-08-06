package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Language implements Serializable {

	private Integer languageid;
	private String name;
	private Date lastupdate;
	public Integer getLanguageid() {
		return languageid;
	}
	public void setLanguageid(Integer languageid) {
		this.languageid = languageid;
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
