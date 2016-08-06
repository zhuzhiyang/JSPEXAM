package com.hand.Entity;

import java.io.Serializable;

public class Filmtext implements Serializable {
	private Integer filmid;
	private String title;
	private String desciption;
	public Integer getFilmid() {
		return filmid;
	}
	public void setFilmid(Integer filmid) {
		this.filmid = filmid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
}
