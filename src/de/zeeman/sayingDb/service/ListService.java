package de.zeeman.sayingDb.service;

import java.util.Collection;

import de.zeeman.sayingDb.data.Author;
import de.zeeman.sayingDb.data.Saying;

public interface ListService {

	public Collection<Author> list(Author searchAuthor);
	
	public Collection<Saying> list(Saying searchSaying);
	
}
