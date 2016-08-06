package com.hand.Service;

import com.hand.Entity.Language;

public interface LanguageService {
	public Language getLanguageById(int id);
	public Language getLanguageByName(String name);
}
