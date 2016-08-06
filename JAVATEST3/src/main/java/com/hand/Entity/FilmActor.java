package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class FilmActor implements Serializable {
private Integer actorid;
private Integer filmid;
private Date lastupdate;
public Integer getActorid() {
	return actorid;
}
public void setActorid(Integer actorid) {
	this.actorid = actorid;
}
public Integer getFilmid() {
	return filmid;
}
public void setFilmid(Integer filmid) {
	this.filmid = filmid;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
}
