package com.hand.Service;

import java.util.List;

import com.hand.Entity.Film;

public interface FilmService {
	public List<Film> getFilms(int pagesize,int pageindex);
	public void InserttoFilm (String title,String description,int languageid);
	public void deletetoFilm (int id);
	public Film getFilmById(int id);
	public void UpdatetoFilm (String title,String description,int languageid,int filmid);
}
