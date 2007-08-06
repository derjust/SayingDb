package de.zeeman.gui;

import java.io.Serializable;

import de.zeeman.sayingDb.service.ListService;
import de.zeeman.sayingDb.service.SaveService;

public abstract class AbstractController implements Serializable {
	protected enum OUTCOME {
		listSayings("listSayings"), editAuthors("editAuthors"), editSayings("editSayings");
		
		OUTCOME(String outcomeString) {
			this.outcomeString = outcomeString;
		}
		private String outcomeString = "";
		public String toString() {
			return outcomeString;
		}
	}
	
	private ListService listService = null;
	private SaveService saveService = null;
	
	public ListService getListService() {
		return listService;
	}
	public void setListService(ListService listService) {
		this.listService = listService;
	}
	public SaveService getSaveService() {
		return saveService;
	}
	public void setSaveService(SaveService saveService) {
		this.saveService = saveService;
	}
	
	
}
