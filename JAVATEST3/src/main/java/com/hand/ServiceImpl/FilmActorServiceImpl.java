package com.hand.ServiceImpl;

import com.hand.Dao.FilmActorDao;
import com.hand.DaoImpl.FilmActorDaoImpl;
import com.hand.Service.FilmActorService;

public class FilmActorServiceImpl implements FilmActorService {
	FilmActorDao fd=new FilmActorDaoImpl();
	public void deletetoFilmActor (int id){
		
		fd.deletetoFilmActor(id);
	}
}
