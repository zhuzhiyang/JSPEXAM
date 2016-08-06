package com.hand.ServiceImpl;

import com.hand.Dao.FilmCategoryDao;
import com.hand.DaoImpl.FilmCategoryDaoImpl;
import com.hand.Service.FilmCategoryService;

public class FilmCategoryServiceImpl implements FilmCategoryService {
	FilmCategoryDao fcd=new FilmCategoryDaoImpl();
	public void deletetoFilmCategoty (int id){
		fcd.deletetoFilmCategoty(id);
		
	}
}
