package com.altimetrik.app.busreservation.controller.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuoteSearchResults implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<QuoteSearchResult> results = new ArrayList<>();
	private int totalResult;
	public List<QuoteSearchResult> getResults() {
		return results;
	}
	public void addResult(QuoteSearchResult result) {
		this.results.add(result);
	}
	public int getTotalResult() {
		return totalResult;
	}
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	

}
