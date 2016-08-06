package com.hand.ServiceImpl;

import com.hand.Dao.FilmtextDao;
import com.hand.DaoImpl.FilmtextDaoImpl;
import com.hand.Service.FilmtextService;

public class FilmtextServiceImpl implements FilmtextService {
	FilmtextDao fd=new FilmtextDaoImpl();
	public void deletetoFilmText (int id){
		
		
		fd.deletetoFilmText(id);
		
	}
}
