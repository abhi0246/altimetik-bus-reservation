package com.altimetrik.app.busreservation.service;

import com.altimetrik.app.busreservation.controller.dto.QuoteSearchCriteria;
import com.altimetrik.app.busreservation.controller.dto.QuoteSearchResults;

public interface QuoteSearchService {
	
	public abstract QuoteSearchResults getBookingQuotes(QuoteSearchCriteria quoteSearchCriteria);

}
