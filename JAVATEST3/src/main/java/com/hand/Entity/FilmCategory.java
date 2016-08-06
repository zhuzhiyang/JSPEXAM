package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class FilmCategory implements Serializable{
private Integer filmid;
private Integer categoryid;
private Date lastupdate;
public Integer getFilmid() {
	return filmid;
}
public void setFilmid(Integer filmid) {
	this.filmid = filmid;
}
public Integer getCategoryid() {
	return categoryid;
}
public void setCategoryid(Integer categoryid) {
	this.categoryid = categoryid;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}	
	
}
