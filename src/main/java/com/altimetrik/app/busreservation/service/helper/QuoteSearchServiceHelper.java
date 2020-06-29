package com.altimetrik.app.busreservation.service.helper;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.altimetrik.app.busreservation.controller.dto.QuoteSearchResult;
import com.altimetrik.app.busreservation.controller.dto.QuoteSearchResults;
import com.altimetrik.app.busreservation.entity.BusDetails;

public class QuoteSearchServiceHelper {
	private QuoteSearchServiceHelper() {
		// private constructor to block the instantiation
	}

	public static QuoteSearchResults populateQuoteSearchResult(List<BusDetails> busDetails,
			String customSortByFiledName) {
		QuoteSearchResults result = new QuoteSearchResults();
		if (!busDetails.isEmpty()) {
			result.setTotalResult(busDetails.size());
		}
		
		Collections.sort(busDetails);
		for (BusDetails busDetail : busDetails) {
			QuoteSearchResult quoteSearchResult = new QuoteSearchResult();
			quoteSearchResult.setBusNumber("TN-" + Long.toString(busDetail.getBusNumber()));
			quoteSearchResult.setOperaterName(busDetail.getOperaterName());
			quoteSearchResult.setArrivalTime(busDetail.getArrivalTime());
			quoteSearchResult.setDeparcherTime(busDetail.getDeparcherTime());
			quoteSearchResult.setDuration(
					calculateTravleDuration(quoteSearchResult.getArrivalTime(), quoteSearchResult.getDeparcherTime()));
			quoteSearchResult.setPrice(Double.toString(busDetail.getPrice()) + " INR");

			result.addResult(quoteSearchResult);
		}

	    sortByByFiledName(result.getResults(), customSortByFiledName);
		return result;

	}

	public static String calculateTravleDuration(Date arrivalTime, Date deparcherTime) {

		long diffInMillies = Math.abs(arrivalTime.getTime() - deparcherTime.getTime());
		long diff = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return Long.toString(diff) + " Hours";
	}
	
	private static void sortByByFiledName(List<QuoteSearchResult> list, String customSortByFiledName) {
		Collections.sort(list, new Comparator<QuoteSearchResult>() {

			@Override
			public int compare(QuoteSearchResult o1, QuoteSearchResult o2) {
				if("Duration".equalsIgnoreCase(customSortByFiledName)) {
					return o1.getDuration().compareTo(o2.getDuration());
				} 
				return 0;
			}
			
		});

	}
}
