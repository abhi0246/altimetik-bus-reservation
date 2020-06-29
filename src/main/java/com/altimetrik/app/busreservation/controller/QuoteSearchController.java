package com.altimetrik.app.busreservation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.app.busreservation.controller.dto.QuoteSearchCriteria;
import com.altimetrik.app.busreservation.controller.dto.QuoteSearchResults;
import com.altimetrik.app.busreservation.service.QuoteSearchService;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class QuoteSearchController {

	@Autowired
	private QuoteSearchService quoteSearchService;
	
	@PostMapping("/search")
	public ResponseEntity<?> getBookingQuotes(@Valid @RequestBody QuoteSearchCriteria quoteSearchCriteria) {
		QuoteSearchResults bookingQuotes = quoteSearchService.getBookingQuotes(quoteSearchCriteria);
		if(bookingQuotes.getResults().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(bookingQuotes, HttpStatus.BAD_REQUEST);
	}
}
