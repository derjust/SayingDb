package de.zeeman.sayingDb.service;

import de.zeeman.sayingDb.data.Author;
import de.zeeman.sayingDb.data.Saying;

public interface SaveService {

	public void save(Author changedAuthor);
	
	public void save(Saying changedSaying);
	
}
