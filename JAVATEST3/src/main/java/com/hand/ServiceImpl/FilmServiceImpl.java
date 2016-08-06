package com.hand.ServiceImpl;

import java.util.List;

import com.hand.Dao.FilmDao;
import com.hand.DaoImpl.FilmDaoImpl;
import com.hand.Entity.Film;
import com.hand.Service.FilmService;

public class FilmServiceImpl implements FilmService {
	FilmDao fd=new FilmDaoImpl();
	public List<Film> getFilms(int pagesize,int pageindex)
	{
		
		return fd.getFilms(pagesize, pageindex);
		
	}
	public void InserttoFilm (String title,String description,int languageid){
	
		fd.InserttoFilm( title, description, languageid);
	}
	public void deletetoFilm (int id){
		
		fd.deletetoFilm(id);
		
	}
	public Film getFilmById(int id){
		
		return fd.getFilmById(id);
	}
	public void UpdatetoFilm (String title,String description,int languageid,int filmid){
		
		fd.UpdatetoFilm(title, description, languageid,filmid);
	}
}
