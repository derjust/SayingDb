package de.zeeman.gui;

import java.util.Collection;
import java.util.Vector;

import javax.faces.model.SelectItem;

import de.zeeman.sayingDb.data.Author;

public class EditAuthorsController extends AbstractController {

	private static final long serialVersionUID = -8323186318028882897L;

	private Author currentAuthor = new Author();
	
	public EditAuthorsController() {
		super();
	}
	
	public Collection<SelectItem> getAuthors() {
		Collection<SelectItem> retList = new Vector<SelectItem>();
		
		Author searchAuthor = null;
		
		for (Author aAuthor : getListService().list(searchAuthor)) {
			retList.add(new SelectItem(aAuthor.getId(), aAuthor.getName()));
		}
		
		return retList;
	}

	public Author getCurrentAuthor() {
		return currentAuthor;
	}

	public void setCurrentAuthor(Author currentAuthor) {
		this.currentAuthor = currentAuthor;
	}
	
}
