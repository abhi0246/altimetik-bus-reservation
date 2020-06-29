package com.altimetrik.app.busreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.app.busreservation.controller.dto.QuoteSearchCriteria;
import com.altimetrik.app.busreservation.controller.dto.QuoteSearchResults;
import com.altimetrik.app.busreservation.entity.BusDetails;
import com.altimetrik.app.busreservation.repository.QuoteSearchRepository;
import com.altimetrik.app.busreservation.service.helper.QuoteSearchServiceHelper;

@Service
public class QuoteSearchServiceImpl implements QuoteSearchService {

	@Autowired
	private QuoteSearchRepository quoteSearchRepository;

	@Override
	public QuoteSearchResults getBookingQuotes(QuoteSearchCriteria quoteSearchCriteria) {
		List<BusDetails> result = quoteSearchRepository.getQuoteSearchResult(quoteSearchCriteria.getSourceCity(),
				quoteSearchCriteria.getDestinationCity(), quoteSearchCriteria.getTravleDate());
		return QuoteSearchServiceHelper.populateQuoteSearchResult(result, quoteSearchCriteria.getCustomSortByFiledName());
	}
}
