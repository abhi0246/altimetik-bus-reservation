package com.altimetrik.app.busreservation.controller.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class QuoteSearchCriteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "sourceCity is reqired")
	private String sourceCity;
	
	@NotBlank(message = "destinationCity is reqired")
	private String destinationCity;
	
	@NotNull(message = "travleDate is reqired")
	private Date travleDate;
	
	public String getCustomSortByFiledName() {
		return customSortByFiledName;
	}

	public void setCustomSortByFiledName(String customSortByFiledName) {
		this.customSortByFiledName = customSortByFiledName;
	}

	private Date returnDate;
	
	private String customSortByFiledName;

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getTravleDate() {
		return travleDate;
	}

	public void setTravleDate(Date travleDate) {
		this.travleDate = travleDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
