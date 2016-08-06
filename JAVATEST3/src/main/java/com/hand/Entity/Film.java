package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;

public class Film implements Serializable {
private Integer film_id;
private String title;
private String description;
private String year;
private Integer languageid;
private Integer originallanguageid;
private Integer rentalduration;
private  double  rentalrate;
private  Integer length;
private double replacementcost;
private String rating;
private String specialfeatures;
private Date lastupdate;
private Language language;
public Integer getFilm_id() {
	return film_id;
}
public void setFilm_id(Integer film_id) {
	this.film_id = film_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public Integer getLanguageid() {
	return languageid;
}
public void setLanguageid(Integer languageid) {
	this.languageid = languageid;
}
public Integer getOriginallanguageid() {
	return originallanguageid;
}
public void setOriginallanguageid(Integer originallanguageid) {
	this.originallanguageid = originallanguageid;
}
public Integer getRentalduration() {
	return rentalduration;
}
public void setRentalduration(Integer rentalduration) {
	this.rentalduration = rentalduration;
}
public double getRentalrate() {
	return rentalrate;
}
public void setRentalrate(double rentalrate) {
	this.rentalrate = rentalrate;
}
public Integer getLength() {
	return length;
}
public void setLength(Integer length) {
	this.length = length;
}
public double getReplacementcost() {
	return replacementcost;
}
public void setReplacementcost(double replacementcost) {
	this.replacementcost = replacementcost;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getSpecialfeatures() {
	return specialfeatures;
}
public void setSpecialfeatures(String specialfeatures) {
	this.specialfeatures = specialfeatures;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}

}
