package com.hand.Dao;

import java.util.List;

import com.hand.Entity.Film;

public interface FilmDao {
	public List<Film> getFilms(int pagesize,int pageindex);
	public void InserttoFilm (String title,String description,int languageid);
	public void deletetoFilm (int id);
	public Film getFilmById(int id);
}
