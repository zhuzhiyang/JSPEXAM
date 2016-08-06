package com.hand.ServiceImpl;

import com.hand.Dao.LanguageDao;
import com.hand.DaoImpl.LanguageDaoImpl;
import com.hand.Entity.Language;
import com.hand.Service.LanguageService;

public class LanguageServiceImpl implements LanguageService {
	LanguageDao ld=new LanguageDaoImpl();
	public Language getLanguageById(int id){
		
		return ld.getLanguageById(id);
	}
	public Language getLanguageByName(String name){
		return ld.getLanguageByName(name);
	}
}
