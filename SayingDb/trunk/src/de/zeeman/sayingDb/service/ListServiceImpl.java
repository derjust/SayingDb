package de.zeeman.sayingDb.service;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.criterion.Restrictions.like;

import de.zeeman.sayingDb.data.Author;
import de.zeeman.sayingDb.data.Saying;

public class ListServiceImpl extends AbstractDatabaseService implements
		ListService {

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Author> list(Author searchAuthor) {
		Session s = getDBSession();
		s.beginTransaction();
		Criteria crit = s.createCriteria(Author.class);
		
		if (searchAuthor != null) {
			if (searchAuthor.getId() != 0) {
				crit.add(eq("id", searchAuthor.getId()));
			}
			if (searchAuthor.getBirthday() != null) {
				crit.add(eq("birthday",searchAuthor.getBirthday()));
			}
			if (searchAuthor.getFirstname() != null) {
				crit.add(like("firstname", searchAuthor.getFirstname()+"%"));
			}
			if (searchAuthor.getLastname() != null) {
				crit.add(like("lastname", searchAuthor.getLastname()+"%"));
			}
			if (searchAuthor.getObit() != null) {
				crit.add(eq("obit", searchAuthor.getObit()));
			}
			if (searchAuthor.getPicture() != null) {
				crit.add(eq("picture", searchAuthor.getPicture()));
			}
		}
		crit.addOrder(Order.desc("lastname"));
		crit.addOrder(Order.desc("firstname"));
		
		return crit.list();
	}

	@Override
	public Collection<Saying> list(Saying searchSaying) {
		// TODO Auto-generated method stub
		return null;
	}

}
