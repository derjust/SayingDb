package de.zeeman.sayingDb.service;

import org.hibernate.Session;

public abstract class AbstractDatabaseService {

	protected Session getDBSession() {
		return null;
	}
	
}
