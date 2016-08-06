package com.hand.Service;

import java.util.List;

import com.hand.Entity.Language;

public interface LanguageService {
	public Language getLanguageById(int id);
	public Language getLanguageByName(String name);
	public List<Language> getLanguages();
}
