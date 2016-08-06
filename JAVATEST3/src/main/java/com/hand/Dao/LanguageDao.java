package com.hand.Dao;

import com.hand.Entity.Language;

public interface LanguageDao {
	public Language getLanguageById(int id);
	public Language getLanguageByName(String name);
}
