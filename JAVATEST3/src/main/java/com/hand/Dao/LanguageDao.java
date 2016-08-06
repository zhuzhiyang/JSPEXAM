package com.hand.Dao;

import java.util.List;

import com.hand.Entity.Language;

public interface LanguageDao {
	public Language getLanguageById(int id);
	public Language getLanguageByName(String name);
	public List<Language> getLanguages();
}
